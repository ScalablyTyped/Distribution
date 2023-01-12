package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JdbcAdvancedParameters */
trait CloudSqlAdvancedParameters extends StObject {
  
  /** connection timeout in seconds */
  var connectTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  
  /** the database to connect to */
  var database: js.UndefOr[String] = js.undefined
  
  /** the name of a Google SQL Service instance */
  var instance: js.UndefOr[String] = js.undefined
  
  /** the user's password */
  var password: js.UndefOr[String] = js.undefined
  
  /** query timeout in seconds */
  var queryTimeoutSeconds: js.UndefOr[Integer] = js.undefined
  
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.undefined
}
object CloudSqlAdvancedParameters {
  
  inline def apply(): CloudSqlAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlAdvancedParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudSqlAdvancedParameters] (val x: Self) extends AnyVal {
    
    inline def setConnectTimeoutSeconds(value: Integer): Self = StObject.set(x, "connectTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutSecondsUndefined: Self = StObject.set(x, "connectTimeoutSeconds", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setQueryTimeoutSeconds(value: Integer): Self = StObject.set(x, "queryTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setQueryTimeoutSecondsUndefined: Self = StObject.set(x, "queryTimeoutSeconds", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
