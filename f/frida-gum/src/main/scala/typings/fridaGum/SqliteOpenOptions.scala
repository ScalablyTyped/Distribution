package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqliteOpenOptions extends js.Object {
  
  var flags: js.UndefOr[js.Array[SqliteOpenFlag]] = js.native
}
object SqliteOpenOptions {
  
  @scala.inline
  def apply(): SqliteOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqliteOpenOptions]
  }
  
  @scala.inline
  implicit class SqliteOpenOptionsOps[Self <: SqliteOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setFlagsVarargs(value: SqliteOpenFlag*): Self = this.set("flags", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: js.Array[SqliteOpenFlag]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
  }
}
