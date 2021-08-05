package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
trait JdbcSavepoint extends StObject {
  
  def getSavepointId(): Integer
  
  def getSavepointName(): String
}
object JdbcSavepoint {
  
  inline def apply(getSavepointId: () => Integer, getSavepointName: () => String): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = js.Any.fromFunction0(getSavepointId), getSavepointName = js.Any.fromFunction0(getSavepointName))
    __obj.asInstanceOf[JdbcSavepoint]
  }
  
  extension [Self <: JdbcSavepoint](x: Self) {
    
    inline def setGetSavepointId(value: () => Integer): Self = StObject.set(x, "getSavepointId", js.Any.fromFunction0(value))
    
    inline def setGetSavepointName(value: () => String): Self = StObject.set(x, "getSavepointName", js.Any.fromFunction0(value))
  }
}
