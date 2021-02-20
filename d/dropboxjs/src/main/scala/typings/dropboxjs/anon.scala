package typings.dropboxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancelable extends StObject {
    
    var cancelable: Boolean = js.native
  }
  object Cancelable {
    
    @scala.inline
    def apply(cancelable: Boolean): Cancelable = {
      val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit class CancelableMutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Port extends StObject {
    
    var port: Double = js.native
    
    var tls: js.UndefOr[js.Object] = js.native
  }
  object Port {
    
    @scala.inline
    def apply(port: Double): Port = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Port]
    }
    
    @scala.inline
    implicit class PortMutableBuilder[Self <: Port] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTls(value: js.Object): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    }
  }
  
  @js.native
  trait ReceiverPath extends StObject {
    
    var receiverPath: String = js.native
    
    var scope: String = js.native
  }
  object ReceiverPath {
    
    @scala.inline
    def apply(receiverPath: String, scope: String): ReceiverPath = {
      val __obj = js.Dynamic.literal(receiverPath = receiverPath.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceiverPath]
    }
    
    @scala.inline
    implicit class ReceiverPathMutableBuilder[Self <: ReceiverPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReceiverPath(value: String): Self = StObject.set(x, "receiverPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RedirectFile extends StObject {
    
    var redirectFile: String = js.native
    
    var redirectUrl: String = js.native
    
    var rememberUser: Boolean = js.native
    
    var scope: String = js.native
  }
  object RedirectFile {
    
    @scala.inline
    def apply(redirectFile: String, redirectUrl: String, rememberUser: Boolean, scope: String): RedirectFile = {
      val __obj = js.Dynamic.literal(redirectFile = redirectFile.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectFile]
    }
    
    @scala.inline
    implicit class RedirectFileMutableBuilder[Self <: RedirectFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectFile(value: String): Self = StObject.set(x, "redirectFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RememberUser extends StObject {
    
    var rememberUser: Boolean = js.native
    
    var scope: String = js.native
  }
  object RememberUser {
    
    @scala.inline
    def apply(rememberUser: Boolean, scope: String): RememberUser = {
      val __obj = js.Dynamic.literal(rememberUser = rememberUser.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RememberUser]
    }
    
    @scala.inline
    implicit class RememberUserMutableBuilder[Self <: RememberUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Scope extends StObject {
    
    var scope: String = js.native
  }
  object Scope {
    
    @scala.inline
    def apply(scope: String): Scope = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
