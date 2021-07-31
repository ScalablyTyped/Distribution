package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JDBC Struct. For documentation of this class, see java.sql.Struct
  * .
  */
trait JdbcStruct extends StObject {
  
  def getAttributes(): js.Array[js.Any]
  
  def getSQLTypeName(): String
}
object JdbcStruct {
  
  @scala.inline
  def apply(getAttributes: () => js.Array[js.Any], getSQLTypeName: () => String): JdbcStruct = {
    val __obj = js.Dynamic.literal(getAttributes = js.Any.fromFunction0(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName))
    __obj.asInstanceOf[JdbcStruct]
  }
  
  @scala.inline
  implicit class JdbcStructMutableBuilder[Self <: JdbcStruct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAttributes(value: () => js.Array[js.Any]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSQLTypeName(value: () => String): Self = StObject.set(x, "getSQLTypeName", js.Any.fromFunction0(value))
  }
}
