package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfiguration extends StObject {
  
  var appCheckCredentials: CredentialsProvider[String]
  
  var asyncQueue: AsyncQueue
  
  var authCredentials: CredentialsProvider[User]
  
  var clientId: ClientId
  
  var databaseInfo: DatabaseInfo
  
  var initialUser: User
  
  var maxConcurrentLimboResolutions: Double
}
object ComponentConfiguration {
  
  inline def apply(
    appCheckCredentials: CredentialsProvider[String],
    asyncQueue: AsyncQueue,
    authCredentials: CredentialsProvider[User],
    clientId: ClientId,
    databaseInfo: DatabaseInfo,
    initialUser: User,
    maxConcurrentLimboResolutions: Double
  ): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(appCheckCredentials = appCheckCredentials.asInstanceOf[js.Any], asyncQueue = asyncQueue.asInstanceOf[js.Any], authCredentials = authCredentials.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], databaseInfo = databaseInfo.asInstanceOf[js.Any], initialUser = initialUser.asInstanceOf[js.Any], maxConcurrentLimboResolutions = maxConcurrentLimboResolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppCheckCredentials(value: CredentialsProvider[String]): Self = StObject.set(x, "appCheckCredentials", value.asInstanceOf[js.Any])
    
    inline def setAsyncQueue(value: AsyncQueue): Self = StObject.set(x, "asyncQueue", value.asInstanceOf[js.Any])
    
    inline def setAuthCredentials(value: CredentialsProvider[User]): Self = StObject.set(x, "authCredentials", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInfo(value: DatabaseInfo): Self = StObject.set(x, "databaseInfo", value.asInstanceOf[js.Any])
    
    inline def setInitialUser(value: User): Self = StObject.set(x, "initialUser", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentLimboResolutions(value: Double): Self = StObject.set(x, "maxConcurrentLimboResolutions", value.asInstanceOf[js.Any])
  }
}
