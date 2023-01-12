package typings.dropboxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancelable extends StObject {
    
    var cancelable: Boolean
  }
  object Cancelable {
    
    inline def apply(cancelable: Boolean): Cancelable = {
      val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    }
  }
  
  trait Port extends StObject {
    
    var port: Double
    
    var tls: js.UndefOr[js.Object] = js.undefined
  }
  object Port {
    
    inline def apply(port: Double): Port = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTls(value: js.Object): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  trait ReceiverPath extends StObject {
    
    var receiverPath: String
    
    var scope: String
  }
  object ReceiverPath {
    
    inline def apply(receiverPath: String, scope: String): ReceiverPath = {
      val __obj = js.Dynamic.literal(receiverPath = receiverPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiverPath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReceiverPath] (val x: Self) extends AnyVal {
      
      inline def setReceiverPath(value: String): Self = StObject.set(x, "receiverPath", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait RedirectFile extends StObject {
    
    var redirectFile: String
    
    var redirectUrl: String
    
    var rememberUser: Boolean
    
    var scope: String
  }
  object RedirectFile {
    
    inline def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): RedirectFile = {
      val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedirectFile] (val x: Self) extends AnyVal {
      
      inline def setRedirectFile(value: String): Self = StObject.set(x, "redirectFile", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      inline def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait RememberUser extends StObject {
    
    var rememberUser: Boolean
    
    var scope: String
  }
  object RememberUser {
    
    inline def apply(rememberUser: Boolean, scope: String): RememberUser = {
      val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RememberUser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RememberUser] (val x: Self) extends AnyVal {
      
      inline def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scope extends StObject {
    
    var scope: String
  }
  object Scope {
    
    inline def apply(scope: String): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
