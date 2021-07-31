package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Ref. For documentation of this class, see java.sql.Ref.
  */
trait JdbcRef extends StObject {
  
  def getBaseTypeName(): String
  
  def getObject(): js.Any
  
  def setObject(`object`: js.Any): Unit
}
object JdbcRef {
  
  @scala.inline
  def apply(getBaseTypeName: () => String, getObject: () => js.Any, setObject: js.Any => Unit): JdbcRef = {
    val __obj = js.Dynamic.literal(getBaseTypeName = js.Any.fromFunction0(getBaseTypeName), getObject = js.Any.fromFunction0(getObject), setObject = js.Any.fromFunction1(setObject))
    __obj.asInstanceOf[JdbcRef]
  }
  
  @scala.inline
  implicit class JdbcRefMutableBuilder[Self <: JdbcRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBaseTypeName(value: () => String): Self = StObject.set(x, "getBaseTypeName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetObject(value: () => js.Any): Self = StObject.set(x, "getObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetObject(value: js.Any => Unit): Self = StObject.set(x, "setObject", js.Any.fromFunction1(value))
  }
}
