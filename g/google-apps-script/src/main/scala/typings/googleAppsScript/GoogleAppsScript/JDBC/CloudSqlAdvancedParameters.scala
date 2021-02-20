package typings.googleAppsScript.GoogleAppsScript.JDBC

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JdbcAdvancedParameters */
@js.native
trait CloudSqlAdvancedParameters extends StObject {
  
  /** connection timeout in seconds */
  var connectTimeoutSeconds: js.UndefOr[Integer] = js.native
  
  /** the database to connect to */
  var database: js.UndefOr[String] = js.native
  
  /** the name of a Google SQL Service instance */
  var instance: js.UndefOr[String] = js.native
  
  /** the user's password */
  var password: js.UndefOr[String] = js.native
  
  /** query timeout in seconds */
  var queryTimeoutSeconds: js.UndefOr[Integer] = js.native
  
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.native
}
object CloudSqlAdvancedParameters {
  
  @scala.inline
  def apply(): CloudSqlAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlAdvancedParameters]
  }
  
  @scala.inline
  implicit class CloudSqlAdvancedParametersMutableBuilder[Self <: CloudSqlAdvancedParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectTimeoutSeconds(value: Integer): Self = StObject.set(x, "connectTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutSecondsUndefined: Self = StObject.set(x, "connectTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setQueryTimeoutSeconds(value: Integer): Self = StObject.set(x, "queryTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTimeoutSecondsUndefined: Self = StObject.set(x, "queryTimeoutSeconds", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
