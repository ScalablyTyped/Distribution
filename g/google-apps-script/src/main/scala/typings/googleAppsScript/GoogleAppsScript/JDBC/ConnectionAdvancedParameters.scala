package typings.googleAppsScript.GoogleAppsScript.JDBC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** JdbcAdvancedParameters */
trait ConnectionAdvancedParameters extends StObject {
  
  /** the client's SSL certificate */
  var _clientSslCertificate: js.UndefOr[String] = js.undefined
  
  /** the client's SSL key */
  var _clientSslKey: js.UndefOr[String] = js.undefined
  
  /** the server's SSL certificate */
  var _serverSslCertificate: js.UndefOr[String] = js.undefined
  
  /** the database to connect to */
  var databaseName: js.UndefOr[String] = js.undefined
  
  /** the user's password */
  var password: js.UndefOr[String] = js.undefined
  
  /** whether or not the connection should comply with JDBC rules when converting time zones. The default is false. */
  var useJDBCCompliantTimeZoneShift: js.UndefOr[Boolean] = js.undefined
  
  /** the username to pass to the database */
  var user: js.UndefOr[String] = js.undefined
}
object ConnectionAdvancedParameters {
  
  inline def apply(): ConnectionAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAdvancedParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionAdvancedParameters] (val x: Self) extends AnyVal {
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUseJDBCCompliantTimeZoneShift(value: Boolean): Self = StObject.set(x, "useJDBCCompliantTimeZoneShift", value.asInstanceOf[js.Any])
    
    inline def setUseJDBCCompliantTimeZoneShiftUndefined: Self = StObject.set(x, "useJDBCCompliantTimeZoneShift", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def set_clientSslCertificate(value: String): Self = StObject.set(x, "_clientSslCertificate", value.asInstanceOf[js.Any])
    
    inline def set_clientSslCertificateUndefined: Self = StObject.set(x, "_clientSslCertificate", js.undefined)
    
    inline def set_clientSslKey(value: String): Self = StObject.set(x, "_clientSslKey", value.asInstanceOf[js.Any])
    
    inline def set_clientSslKeyUndefined: Self = StObject.set(x, "_clientSslKey", js.undefined)
    
    inline def set_serverSslCertificate(value: String): Self = StObject.set(x, "_serverSslCertificate", value.asInstanceOf[js.Any])
    
    inline def set_serverSslCertificateUndefined: Self = StObject.set(x, "_serverSslCertificate", js.undefined)
  }
}
