package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
@js.native
trait JdbcSavepoint extends StObject {
  
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
  implicit class JdbcSavepointMutableBuilder[Self <: JdbcSavepoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSavepointId(value: () => Integer): Self = StObject.set(x, "getSavepointId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSavepointName(value: () => String): Self = StObject.set(x, "getSavepointName", js.Any.fromFunction0(value))
  }
}
