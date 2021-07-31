package typings.elasticApmNode.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Inlined from @types/aws-lambda - start
object AwsLambda {
  
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[Error | Null | String], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  
  trait ClientContext extends StObject {
    
    var client: ClientContextClient
    
    var custom: js.UndefOr[js.Any] = js.undefined
    
    var env: ClientContextEnv
  }
  object ClientContext {
    
    @scala.inline
    def apply(client: ClientContextClient, env: ClientContextEnv): ClientContext = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContext]
    }
    
    @scala.inline
    implicit class ClientContextMutableBuilder[Self <: ClientContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: ClientContextClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEnv(value: ClientContextEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientContextClient extends StObject {
    
    var appPackageName: String
    
    var appTitle: String
    
    var appVersionCode: String
    
    var appVersionName: String
    
    var installationId: String
  }
  object ClientContextClient {
    
    @scala.inline
    def apply(
      appPackageName: String,
      appTitle: String,
      appVersionCode: String,
      appVersionName: String,
      installationId: String
    ): ClientContextClient = {
      val __obj = js.Dynamic.literal(appPackageName = appPackageName.asInstanceOf[js.Any], appTitle = appTitle.asInstanceOf[js.Any], appVersionCode = appVersionCode.asInstanceOf[js.Any], appVersionName = appVersionName.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContextClient]
    }
    
    @scala.inline
    implicit class ClientContextClientMutableBuilder[Self <: ClientContextClient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppPackageName(value: String): Self = StObject.set(x, "appPackageName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppTitle(value: String): Self = StObject.set(x, "appTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionCode(value: String): Self = StObject.set(x, "appVersionCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionName(value: String): Self = StObject.set(x, "appVersionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientContextEnv extends StObject {
    
    var locale: String
    
    var make: String
    
    var model: String
    
    var platform: String
    
    var platformVersion: String
  }
  object ClientContextEnv {
    
    @scala.inline
    def apply(locale: String, make: String, model: String, platform: String, platformVersion: String): ClientContextEnv = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], platformVersion = platformVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientContextEnv]
    }
    
    @scala.inline
    implicit class ClientContextEnvMutableBuilder[Self <: ClientContextEnv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMake(value: String): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait CognitoIdentity extends StObject {
    
    var cognitoIdentityId: String
    
    var cognitoIdentityPoolId: String
  }
  object CognitoIdentity {
    
    @scala.inline
    def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
      val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoIdentity]
    }
    
    @scala.inline
    implicit class CognitoIdentityMutableBuilder[Self <: CognitoIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCognitoIdentityId(value: String): Self = StObject.set(x, "cognitoIdentityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoIdentityPoolId(value: String): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var awsRequestId: String = js.native
    
    // Properties
    var callbackWaitsForEmptyEventLoop: Boolean = js.native
    
    var clientContext: js.UndefOr[ClientContext] = js.native
    
    // Functions for compatibility with earlier Node.js Runtime v0.10.42
    // For more details see http://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-using-old-runtime.html#nodejs-prog-model-oldruntime-context-methods
    def done(): Unit = js.native
    def done(error: Unit, result: js.Any): Unit = js.native
    def done(error: Error): Unit = js.native
    def done(error: Error, result: js.Any): Unit = js.native
    
    def fail(error: String): Unit = js.native
    def fail(error: Error): Unit = js.native
    
    var functionName: String = js.native
    
    var functionVersion: String = js.native
    
    // Functions
    def getRemainingTimeInMillis(): Double = js.native
    
    var identity: js.UndefOr[CognitoIdentity] = js.native
    
    var invokedFunctionArn: String = js.native
    
    var logGroupName: String = js.native
    
    var logStreamName: String = js.native
    
    var memoryLimitInMB: Double = js.native
    
    def succeed(messageOrObject: js.Any): Unit = js.native
    def succeed(message: String, `object`: js.Any): Unit = js.native
  }
  
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
}
