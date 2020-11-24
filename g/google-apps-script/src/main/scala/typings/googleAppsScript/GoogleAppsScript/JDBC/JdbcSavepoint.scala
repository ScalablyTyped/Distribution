package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
@js.native
trait JdbcSavepoint extends js.Object {
  
  def getSavepointId(): Integer = js.native
  
  def getSavepointName(): String = js.native
}
object JdbcSavepoint {
  
  @scala.inline
  def apply(getSavepointId: () => Integer, getSavepointName: () => String): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = js.Any.fromFunction0(getSavepointId), getSavepointName = js.Any.fromFunction0(getSavepointName))
    __obj.asInstanceOf[JdbcSavepoint]
  }
  
  @scala.inline
  implicit class JdbcSavepointOps[Self <: JdbcSavepoint] (val x: Self) extends AnyVal {
    
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
    def setGetSavepointId(value: () => Integer): Self = this.set("getSavepointId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSavepointName(value: () => String): Self = this.set("getSavepointName", js.Any.fromFunction0(value))
  }
}
