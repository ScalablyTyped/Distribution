package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
trait JdbcRef extends StObject {
  
  def getBaseTypeName(): String
  
  def getObject(): Any
  
  def setObject(`object`: Any): Unit
}
object JdbcRef {
  
  inline def apply(getBaseTypeName: () => String, getObject: () => Any, setObject: Any => Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
    __obj.asInstanceOf[JdbcRef]
  }
  
  extension [Self <: JdbcRef](x: Self) {
    
    inline def setGetBaseTypeName(value: () => String): Self = StObject.set(x, "getBaseTypeName", js.Any.fromFunction0(value))
    
    inline def setGetObject(value: () => Any): Self = StObject.set(x, "getObject", js.Any.fromFunction0(value))
    
    inline def setSetObject(value: Any => Unit): Self = StObject.set(x, "setObject", js.Any.fromFunction1(value))
  }
}
