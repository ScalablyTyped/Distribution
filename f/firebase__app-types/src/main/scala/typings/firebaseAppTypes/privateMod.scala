package typings.firebaseAppTypes

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAppTypes.anon.Components
import typings.firebaseAppTypes.anon.LogEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateMod {
  
  type AppHook = js.Function2[/* event */ String, /* app */ typings.firebaseAppTypes.mod.FirebaseApp, Unit]
  
  @js.native
  trait FirebaseApp
    extends typings.firebaseAppTypes.mod.FirebaseApp {
    
    def _addComponent(
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
    ): Unit = js.native
    
    def _addOrOverwriteComponent(
      component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
    ): Unit = js.native
    
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    var container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentContainer */ js.Any = js.native
  }
  
  @js.native
  trait FirebaseAppInternals extends StObject {
    
    def addAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
    
    var analytics: LogEvent = js.native
    
    def getToken(): js.Promise[FirebaseAuthTokenData | Null] = js.native
    def getToken(refreshToken: Boolean): js.Promise[FirebaseAuthTokenData | Null] = js.native
    
    def getUid(): String | Null = js.native
    
    def removeAuthTokenListener(fn: js.Function1[/* token */ String | Null, Unit]): Unit = js.native
  }
  
  @js.native
  trait FirebaseAuthTokenData extends StObject {
    
    var accessToken: String = js.native
  }
  object FirebaseAuthTokenData {
    
    @scala.inline
    def apply(accessToken: String): FirebaseAuthTokenData = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseAuthTokenData]
    }
    
    @scala.inline
    implicit class FirebaseAuthTokenDataMutableBuilder[Self <: FirebaseAuthTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirebaseNamespace
    extends typings.firebaseAppTypes.mod.FirebaseNamespace {
    
    var INTERNAL: Components = js.native
  }
  
  @js.native
  trait FirebaseService extends StObject {
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
    
    var app: typings.firebaseAppTypes.mod.FirebaseApp = js.native
  }
  object FirebaseService {
    
    @scala.inline
    def apply(app: typings.firebaseAppTypes.mod.FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    @scala.inline
    implicit class FirebaseServiceMutableBuilder[Self <: FirebaseService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: typings.firebaseAppTypes.mod.FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINTERNAL(value: FirebaseServiceInternals): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINTERNALUndefined: Self = StObject.set(x, "INTERNAL", js.undefined)
    }
  }
  
  type FirebaseServiceFactory = js.Function3[
    /* app */ typings.firebaseAppTypes.mod.FirebaseApp, 
    /* extendApp */ js.UndefOr[js.Function1[/* props */ StringDictionary[js.Any], Unit]], 
    /* instanceString */ js.UndefOr[String], 
    FirebaseService
  ]
  
  @js.native
  trait FirebaseServiceInternals extends StObject {
    
    /**
      * Delete the service and free it's resources - called from
      * app.delete().
      */
    def delete(): js.Promise[Unit] = js.native
  }
  object FirebaseServiceInternals {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit]): FirebaseServiceInternals = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[FirebaseServiceInternals]
    }
    
    @scala.inline
    implicit class FirebaseServiceInternalsMutableBuilder[Self <: FirebaseServiceInternals] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[/* app */ js.UndefOr[typings.firebaseAppTypes.mod.FirebaseApp], T]
  
  @js.native
  trait PlatformLoggerService extends StObject {
    
    def getPlatformInfoString(): String = js.native
  }
  object PlatformLoggerService {
    
    @scala.inline
    def apply(getPlatformInfoString: () => String): PlatformLoggerService = {
      val __obj = js.Dynamic.literal(getPlatformInfoString = js.Any.fromFunction0(getPlatformInfoString))
      __obj.asInstanceOf[PlatformLoggerService]
    }
    
    @scala.inline
    implicit class PlatformLoggerServiceMutableBuilder[Self <: PlatformLoggerService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPlatformInfoString(value: () => String): Self = StObject.set(x, "getPlatformInfoString", js.Any.fromFunction0(value))
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var `platform-logger`: PlatformLoggerService = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(`platform-logger`: PlatformLoggerService): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("platform-logger")(`platform-logger`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setPlatform-logger`(value: PlatformLoggerService): Self = StObject.set(x, "platform-logger", value.asInstanceOf[js.Any])
      }
    }
  }
}
