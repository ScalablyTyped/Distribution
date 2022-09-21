package typings.firebaseAnalytics

import typings.firebaseAnalytics.firebaseAnalyticsStrings.config
import typings.firebaseAnalytics.firebaseAnalyticsStrings.consent
import typings.firebaseAnalytics.firebaseAnalyticsStrings.event
import typings.firebaseAnalytics.firebaseAnalyticsStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "ANALYTICS_TYPE")
  @js.native
  val ANALYTICS_TYPE: /* "analytics" */ String = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "DYNAMIC_CONFIG_URL")
  @js.native
  val DYNAMIC_CONFIG_URL: /* "https://firebase.googleapis.com/v1alpha/projects/-/apps/{app-id}/webConfig" */ String = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "FETCH_TIMEOUT_MILLIS")
  @js.native
  val FETCH_TIMEOUT_MILLIS: Double = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "GA_FID_KEY")
  @js.native
  val GA_FID_KEY: /* "firebase_id" */ String = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "GTAG_URL")
  @js.native
  val GTAG_URL: /* "https://www.googletagmanager.com/gtag/js" */ String = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/constants", "ORIGIN_KEY")
  @js.native
  val ORIGIN_KEY: /* "origin" */ String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.event
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.set
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.config
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.consent
  */
  trait GtagCommand extends StObject
  object GtagCommand {
    
    inline def CONFIG: config = "config".asInstanceOf[config]
    
    inline def CONSENT: consent = "consent".asInstanceOf[consent]
    
    inline def EVENT: event = "event".asInstanceOf[event]
    
    inline def SET: set = "set".asInstanceOf[set]
  }
}
