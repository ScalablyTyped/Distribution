package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC SQLXML. For documentation of this class, see java.sql.SQLXML
  * .
  */
@js.native
trait JdbcSQLXML extends StObject {
  
  def free(): Unit = js.native
  
  def getString(): String = js.native
  
  def setString(value: String): Unit = js.native
}
object JdbcSQLXML {
  
  @scala.inline
  def apply(free: () => Unit, getString: () => String, setString: String => Unit): JdbcSQLXML = {
    val __obj = js.Dynamic.literal(free = js.Any.fromFunction0(free), getString = js.Any.fromFunction0(getString), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[JdbcSQLXML]
  }
  
  @scala.inline
  implicit class JdbcSQLXMLMutableBuilder[Self <: JdbcSQLXML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFree(value: () => Unit): Self = StObject.set(x, "free", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
  }
}
