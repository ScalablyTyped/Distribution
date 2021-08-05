package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
trait JdbcSQLXML extends StObject {
  
  def free(): Unit
  
  def getString(): String
  
  def setString(value: String): Unit
}
object JdbcSQLXML {
  
  inline def apply(free: () => Unit, getString: () => String, setString: String => Unit): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[JdbcSQLXML]
  }
  
  extension [Self <: JdbcSQLXML](x: Self) {
    
    inline def setFree(value: () => Unit): Self = StObject.set(x, "free", js.Any.fromFunction0(value))
    
    inline def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
  }
}
