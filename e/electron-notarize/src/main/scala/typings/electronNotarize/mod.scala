package typings.electronNotarize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notarize", "notarize")
  @js.native
  def notarize(hasAppBundleIdAppPathAscProviderAuthOptions: NotarizeOptions): js.Promise[Unit] = js.native
  
  @JSImport("electron-notarize", "stapleApp")
  @js.native
  def stapleApp(opts: NotarizeStapleOptions): js.Promise[Unit] = js.native
  
  @JSImport("electron-notarize", "startNotarize")
  @js.native
  def startNotarize(opts: NotarizeStartOptions): js.Promise[NotarizeResult] = js.native
  
  @JSImport("electron-notarize", "validateAuthorizationArgs")
  @js.native
  def validateAuthorizationArgs(opts: NotarizeCredentials): NotarizeCredentials = js.native
  
  @JSImport("electron-notarize", "waitForNotarize")
  @js.native
  def waitForNotarize(opts: NotarizeWaitOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait NotarizeApiKeyCredentials extends NotarizeCredentials {
    
    var appleApiIssuer: String = js.native
    
    var appleApiKey: String = js.native
  }
  object NotarizeApiKeyCredentials {
    
    @scala.inline
    def apply(appleApiIssuer: String, appleApiKey: String): NotarizeApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeApiKeyCredentials]
    }
    
    @scala.inline
    implicit class NotarizeApiKeyCredentialsMutableBuilder[Self <: NotarizeApiKeyCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppleApiIssuer(value: String): Self = StObject.set(x, "appleApiIssuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppleApiKey(value: String): Self = StObject.set(x, "appleApiKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotarizeAppOptions extends StObject {
    
    var appBundleId: String = js.native
    
    var appPath: String = js.native
  }
  object NotarizeAppOptions {
    
    @scala.inline
    def apply(appBundleId: String, appPath: String): NotarizeAppOptions = {
      val __obj = js.Dynamic.literal(appBundleId = appBundleId.asInstanceOf[js.Any], appPath = appPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeAppOptions]
    }
    
    @scala.inline
    implicit class NotarizeAppOptionsMutableBuilder[Self <: NotarizeAppOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronNotarize.mod.NotarizePasswordCredentials
    - typings.electronNotarize.mod.NotarizeApiKeyCredentials
  */
  trait NotarizeCredentials extends StObject
  object NotarizeCredentials {
    
    @scala.inline
    def NotarizeApiKeyCredentials(appleApiIssuer: String, appleApiKey: String): typings.electronNotarize.mod.NotarizeApiKeyCredentials = {
      val __obj = js.Dynamic.literal(appleApiIssuer = appleApiIssuer.asInstanceOf[js.Any], appleApiKey = appleApiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.mod.NotarizeApiKeyCredentials]
    }
    
    @scala.inline
    def NotarizePasswordCredentials(appleId: String, appleIdPassword: String): typings.electronNotarize.mod.NotarizePasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronNotarize.mod.NotarizePasswordCredentials]
    }
  }
  
  type NotarizeOptions = NotarizeStartOptions
  
  @js.native
  trait NotarizePasswordCredentials extends NotarizeCredentials {
    
    var appleId: String = js.native
    
    var appleIdPassword: String = js.native
  }
  object NotarizePasswordCredentials {
    
    @scala.inline
    def apply(appleId: String, appleIdPassword: String): NotarizePasswordCredentials = {
      val __obj = js.Dynamic.literal(appleId = appleId.asInstanceOf[js.Any], appleIdPassword = appleIdPassword.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizePasswordCredentials]
    }
    
    @scala.inline
    implicit class NotarizePasswordCredentialsMutableBuilder[Self <: NotarizePasswordCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppleId(value: String): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppleIdPassword(value: String): Self = StObject.set(x, "appleIdPassword", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotarizeResult extends StObject {
    
    var uuid: String = js.native
  }
  object NotarizeResult {
    
    @scala.inline
    def apply(uuid: String): NotarizeResult = {
      val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeResult]
    }
    
    @scala.inline
    implicit class NotarizeResultMutableBuilder[Self <: NotarizeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<electron-notarize.electron-notarize.NotarizeAppOptions, 'appPath'> */
  @js.native
  trait NotarizeStapleOptions extends StObject {
    
    var appPath: String = js.native
  }
  object NotarizeStapleOptions {
    
    @scala.inline
    def apply(appPath: String): NotarizeStapleOptions = {
      val __obj = js.Dynamic.literal(appPath = appPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizeStapleOptions]
    }
    
    @scala.inline
    implicit class NotarizeStapleOptionsMutableBuilder[Self <: NotarizeStapleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    }
  }
  
  type NotarizeStartOptions = NotarizeAppOptions with NotarizeCredentials with TransporterOptions
  
  type NotarizeWaitOptions = NotarizeResult with NotarizeCredentials
  
  @js.native
  trait TransporterOptions extends StObject {
    
    var ascProvider: js.UndefOr[String] = js.native
  }
  object TransporterOptions {
    
    @scala.inline
    def apply(): TransporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransporterOptions]
    }
    
    @scala.inline
    implicit class TransporterOptionsMutableBuilder[Self <: TransporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscProvider(value: String): Self = StObject.set(x, "ascProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAscProviderUndefined: Self = StObject.set(x, "ascProvider", js.undefined)
    }
  }
}
