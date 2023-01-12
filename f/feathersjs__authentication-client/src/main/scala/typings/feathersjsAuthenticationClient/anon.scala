package typings.feathersjsAuthenticationClient

import typings.feathersjsAuthenticationClient.mod.FeathersAuthClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cookie extends StObject {
    
    var cookie: String
    
    var entity: String
    
    var header: String
    
    var jwtStrategy: String
    
    var path: String
    
    var service: String
    
    var storageKey: String
    
    var timeout: Double
  }
  object Cookie {
    
    inline def apply(
      cookie: String,
      entity: String,
      header: String,
      jwtStrategy: String,
      path: String,
      service: String,
      storageKey: String,
      timeout: Double
    ): Cookie = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jwtStrategy = jwtStrategy.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setJwtStrategy(value: String): Self = StObject.set(x, "jwtStrategy", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(config: FeathersAuthClientConfig): js.Function0[Unit] = js.native
    
    val defaults: Cookie = js.native
  }
}
