package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Byte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC RowId. For documentation of this class, see java.sql.RowId
  * .
  */
trait JdbcRowId extends StObject {
  
  def getBytes(): js.Array[Byte]
}
object JdbcRowId {
  
  inline def apply(getBytes: () => js.Array[Byte]): JdbcRowId = {
    val __obj = js.Dynamic.literal(getBytes = js.Any.fromFunction0(getBytes))
    __obj.asInstanceOf[JdbcRowId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JdbcRowId] (val x: Self) extends AnyVal {
    
    inline def setGetBytes(value: () => js.Array[Byte]): Self = StObject.set(x, "getBytes", js.Any.fromFunction0(value))
  }
}
