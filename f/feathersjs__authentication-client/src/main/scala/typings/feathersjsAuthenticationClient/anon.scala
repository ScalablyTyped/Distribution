package typings.feathersjsAuthenticationClient

import typings.feathersjsAuthenticationClient.mod.FeathersAuthClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cookie extends StObject {
    
    var cookie: String = js.native
    
    var entity: String = js.native
    
    var header: String = js.native
    
    var jwtStrategy: String = js.native
    
    var path: String = js.native
    
    var service: String = js.native
    
    var storageKey: String = js.native
    
    var timeout: Double = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(
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
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJwtStrategy(value: String): Self = StObject.set(x, "jwtStrategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default(): js.Function0[Unit] = js.native
    def default(config: FeathersAuthClientConfig): js.Function0[Unit] = js.native
    
    val defaults: Cookie = js.native
  }
}
