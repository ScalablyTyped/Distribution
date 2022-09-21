package typings.firebaseAnalyticsCompat

import typings.firebaseAnalytics.mod.Analytics
import typings.firebaseAnalyticsTypes.mod.AnalyticsCallOptions
import typings.firebaseAnalyticsTypes.mod.CustomParams
import typings.firebaseAnalyticsTypes.mod.EventParams
import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import typings.firebaseAppCompat.mod.FirebaseApp
import typings.firebaseAppCompat.mod.FirebaseServiceInternals
import typings.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAppCompat.mod.FirebaseService because var conflicts: app. Inlined INTERNAL */ @JSImport("@firebase/analytics-compat/dist/src/service", "AnalyticsService")
  @js.native
  open class AnalyticsService protected ()
    extends StObject
       with FirebaseAnalytics
       with Compat[Any] {
    def this(app: FirebaseApp, _delegate: Analytics) = this()
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.native
    
    /* CompleteClass */
    var _delegate: Any = js.native
    @JSName("_delegate")
    val _delegate_AnalyticsService: Analytics = js.native
    
    @JSName("app")
    var app_AnalyticsService: FirebaseApp = js.native
    
    def logEvent(eventName: String): Unit = js.native
    def logEvent(eventName: String, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
    def logEvent(eventName: String, eventParams: CustomParams): Unit = js.native
    def logEvent(eventName: String, eventParams: CustomParams, options: AnalyticsCallOptions): Unit = js.native
    def logEvent(eventName: String, eventParams: EventParams): Unit = js.native
    def logEvent(eventName: String, eventParams: EventParams, options: AnalyticsCallOptions): Unit = js.native
  }
}
