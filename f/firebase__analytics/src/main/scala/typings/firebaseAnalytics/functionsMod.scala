package typings.firebaseAnalytics

import typings.firebaseAnalyticsTypes.mod.AnalyticsCallOptions
import typings.firebaseAnalyticsTypes.mod.CustomParams
import typings.firebaseAnalyticsTypes.mod.EventParams
import typings.firebaseAnalyticsTypes.mod.Gtag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("@firebase/analytics/dist/src/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logEvent(gtagFunction: Gtag, initializationPromise: js.Promise[String], eventName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: EventParams
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: EventParams,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setAnalyticsCollectionEnabled(initializationPromise: js.Promise[String], enabled: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsCollectionEnabled")(initializationPromise.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setCurrentScreen(gtagFunction: Gtag, initializationPromise: js.Promise[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setCurrentScreen(gtagFunction: Gtag, initializationPromise: js.Promise[String], screenName: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setCurrentScreen(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    screenName: String,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setCurrentScreen(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    screenName: Null,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setUserId(gtagFunction: Gtag, initializationPromise: js.Promise[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setUserId(gtagFunction: Gtag, initializationPromise: js.Promise[String], id: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setUserId(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    id: String,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setUserId(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    id: Null,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setUserProperties(gtagFunction: Gtag, initializationPromise: js.Promise[String], properties: CustomParams): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setUserProperties(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    properties: CustomParams,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(gtagFunction.asInstanceOf[js.Any], initializationPromise.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
