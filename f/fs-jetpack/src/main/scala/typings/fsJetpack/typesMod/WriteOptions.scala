package typings.fsJetpack.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteOptions extends js.Object {
  
  var atomic: js.UndefOr[Boolean] = js.native
  
  var jsonIndent: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
}
object WriteOptions {
  
  @scala.inline
  def apply(): WriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteOptions]
  }
  
  @scala.inline
  implicit class WriteOptionsOps[Self <: WriteOptions] (val x: Self) extends AnyVal {
    
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
    def setAtomic(value: Boolean): Self = this.set("atomic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtomic: Self = this.set("atomic", js.undefined)
    
    @scala.inline
    def setJsonIndent(value: Double): Self = this.set("jsonIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonIndent: Self = this.set("jsonIndent", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
