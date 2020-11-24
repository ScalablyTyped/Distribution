package typings.expressMysqlSession.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<express-mysql-session.express-mysql-session.ColumnNames> */
@js.native
trait PartialColumnNames extends js.Object {
  
  var data: js.UndefOr[String] = js.native
  
  var expires: js.UndefOr[String] = js.native
  
  var session_id: js.UndefOr[String] = js.native
}
object PartialColumnNames {
  
  @scala.inline
  def apply(): PartialColumnNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumnNames]
  }
  
  @scala.inline
  implicit class PartialColumnNamesOps[Self <: PartialColumnNames] (val x: Self) extends AnyVal {
    
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setSession_id(value: String): Self = this.set("session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession_id: Self = this.set("session_id", js.undefined)
  }
}
