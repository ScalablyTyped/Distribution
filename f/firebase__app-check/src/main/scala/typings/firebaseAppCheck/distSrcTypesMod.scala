package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckToken
import typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckTokenListener
import typings.firebaseAppCheck.firebaseAppCheckStrings.`app-check-internal`
import typings.firebaseUtil.mod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  type AppCheckInternalComponentName = `app-check-internal`
  
  trait AppCheckProvider extends StObject {
    
    /**
      * Returns an App Check token.
      * @internal
      */
    def getToken(): js.Promise[AppCheckTokenInternal]
    
    /**
      * @internal
      */
    def initialize(app: FirebaseApp): Unit
  }
  object AppCheckProvider {
    
    inline def apply(getToken: () => js.Promise[AppCheckTokenInternal], initialize: FirebaseApp => Unit): AppCheckProvider = {
      val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken), initialize = js.Any.fromFunction1(initialize))
      __obj.asInstanceOf[AppCheckProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckProvider] (val x: Self) extends AnyVal {
      
      inline def setGetToken(value: () => js.Promise[AppCheckTokenInternal]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setInitialize(value: FirebaseApp => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    }
  }
  
  trait AppCheckTokenInternal
    extends StObject
       with AppCheckToken {
    
    var issuedAtTimeMillis: Double
  }
  object AppCheckTokenInternal {
    
    inline def apply(expireTimeMillis: Double, issuedAtTimeMillis: Double, token: String): AppCheckTokenInternal = {
      val __obj = js.Dynamic.literal(expireTimeMillis = expireTimeMillis.asInstanceOf[js.Any], issuedAtTimeMillis = issuedAtTimeMillis.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenInternal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckTokenInternal] (val x: Self) extends AnyVal {
      
      inline def setIssuedAtTimeMillis(value: Double): Self = StObject.set(x, "issuedAtTimeMillis", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCheckTokenObserver
    extends StObject
       with PartialObserver[AppCheckTokenResult] {
    
    @JSName("next")
    def next_MAppCheckTokenObserver(token: typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckTokenResult): Unit
    @JSName("next")
    var next_Original: AppCheckTokenListener
    
    var `type`: ListenerType
  }
  object AppCheckTokenObserver {
    
    inline def apply(
      next: /* token */ typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckTokenResult => Unit,
      `type`: ListenerType
    ): AppCheckTokenObserver = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenObserver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckTokenObserver] (val x: Self) extends AnyVal {
      
      inline def setNext(value: /* token */ typings.firebaseAppCheck.distSrcPublicTypesMod.AppCheckTokenResult => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      
      inline def setType(value: ListenerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AppCheckTokenResult extends StObject {
    
    val error: js.UndefOr[js.Error] = js.undefined
    
    val internalError: js.UndefOr[js.Error] = js.undefined
    
    val token: String
  }
  object AppCheckTokenResult {
    
    inline def apply(token: String): AppCheckTokenResult = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCheckTokenResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppCheckTokenResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInternalError(value: js.Error): Self = StObject.set(x, "internalError", value.asInstanceOf[js.Any])
      
      inline def setInternalErrorUndefined: Self = StObject.set(x, "internalError", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirebaseAppCheckInternal extends StObject {
    
    def addTokenListener(listener: AppCheckTokenListener): Unit = js.native
    
    def getLimitedUseToken(): js.Promise[AppCheckTokenResult] = js.native
    
    def getToken(): js.Promise[AppCheckTokenResult] = js.native
    def getToken(forceRefresh: Boolean): js.Promise[AppCheckTokenResult] = js.native
    
    def removeTokenListener(listener: AppCheckTokenListener): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAppCheck.firebaseAppCheckStrings.INTERNAL
    - typings.firebaseAppCheck.firebaseAppCheckStrings.EXTERNAL
  */
  trait ListenerType extends StObject
  object ListenerType {
    
    inline def EXTERNAL: typings.firebaseAppCheck.firebaseAppCheckStrings.EXTERNAL = "EXTERNAL".asInstanceOf[typings.firebaseAppCheck.firebaseAppCheckStrings.EXTERNAL]
    
    inline def INTERNAL: typings.firebaseAppCheck.firebaseAppCheckStrings.INTERNAL = "INTERNAL".asInstanceOf[typings.firebaseAppCheck.firebaseAppCheckStrings.INTERNAL]
  }
  
  trait ThrottleData extends StObject {
    
    var allowRequestsAfter: Double
    
    var backoffCount: Double
    
    var httpStatus: Double
  }
  object ThrottleData {
    
    inline def apply(allowRequestsAfter: Double, backoffCount: Double, httpStatus: Double): ThrottleData = {
      val __obj = js.Dynamic.literal(allowRequestsAfter = allowRequestsAfter.asInstanceOf[js.Any], backoffCount = backoffCount.asInstanceOf[js.Any], httpStatus = httpStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThrottleData] (val x: Self) extends AnyVal {
      
      inline def setAllowRequestsAfter(value: Double): Self = StObject.set(x, "allowRequestsAfter", value.asInstanceOf[js.Any])
      
      inline def setBackoffCount(value: Double): Self = StObject.set(x, "backoffCount", value.asInstanceOf[js.Any])
      
      inline def setHttpStatus(value: Double): Self = StObject.set(x, "httpStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `app-check-internal`: FirebaseAppCheckInternal
    }
    object NameServiceMapping {
      
      inline def apply(`app-check-internal`: FirebaseAppCheckInternal): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("app-check-internal")(`app-check-internal`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def `setApp-check-internal`(value: FirebaseAppCheckInternal): Self = StObject.set(x, "app-check-internal", value.asInstanceOf[js.Any])
      }
    }
  }
}
