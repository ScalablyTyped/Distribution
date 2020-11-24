package typings.dookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushOpts extends js.Object {
  
  var dropDatabase: Boolean = js.native
  
  var filename: js.UndefOr[String] = js.native
}
object PushOpts {
  
  @scala.inline
  def apply(dropDatabase: Boolean): PushOpts = {
    val __obj = js.Dynamic.literal(dropDatabase = dropDatabase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushOpts]
  }
  
  @scala.inline
  implicit class PushOptsOps[Self <: PushOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDropDatabase(value: Boolean): Self = this.set("dropDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
}
