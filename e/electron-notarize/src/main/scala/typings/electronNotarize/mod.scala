package typings.electronNotarize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-notarize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def notarize(hasAppBundleIdAppPathAscProviderAuthOptions: NotarizeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notarize")(hasAppBundleIdAppPathAscProviderAuthOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def stapleApp(opts: NotarizeStapleOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("stapleApp")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def startNotarize(opts: NotarizeStartOptions): js.Promise[NotarizeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("startNotarize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NotarizeResult]]
  
  @scala.inline
  def validateAuthorizationArgs(opts: NotarizeCredentials): NotarizeCredentials = ^.asInstanceOf[js.Dynamic].applyDynamic("validateAuthorizationArgs")(opts.asInstanceOf[js.Any]).asInstanceOf[NotarizeCredentials]
  
  @scala.inline
  def waitForNotarize(opts: NotarizeWaitOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForNotarize")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait NotarizeApiKeyCredentials
    extends StObject
       with NotarizeCredentials {
    
    var appleApiIssuer: String
    
    var appleApiKey: String
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
  
  trait NotarizeAppOptions extends StObject {
    
    var appBundleId: String
    
    var appPath: String
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
  
  trait NotarizePasswordCredentials
    extends StObject
       with NotarizeCredentials {
    
    var appleId: String
    
    var appleIdPassword: String
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
  
  trait NotarizeResult extends StObject {
    
    var uuid: String
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
  trait NotarizeStapleOptions extends StObject {
    
    var appPath: String
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
  
  type NotarizeStartOptions = NotarizeAppOptions & NotarizeCredentials & TransporterOptions
  
  type NotarizeWaitOptions = NotarizeResult & NotarizeCredentials
  
  trait TransporterOptions extends StObject {
    
    var ascProvider: js.UndefOr[String] = js.undefined
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
