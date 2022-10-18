package typings.firebaseAnalytics

import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.AnalyticsCallOptions
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.ConsentSettings
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.CustomParams
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.EventParams
import typings.firebaseAnalytics.distEsmSrcTypesMod.Gtag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcFunctionsMod {
  
  @JSImport("@firebase/analytics/dist/esm/src/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/analytics/dist/esm/src/functions", "defaultConsentSettingsForInit")
  @js.native
  def defaultConsentSettingsForInit: js.UndefOr[ConsentSettings] = js.native
  inline def defaultConsentSettingsForInit_=(x: js.UndefOr[ConsentSettings]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultConsentSettingsForInit")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/analytics/dist/esm/src/functions", "defaultEventParametersForInit")
  @js.native
  def defaultEventParametersForInit: js.UndefOr[CustomParams] = js.native
  inline def defaultEventParametersForInit_=(x: js.UndefOr[CustomParams]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultEventParametersForInit")(x.asInstanceOf[js.Any])
  
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
  
  inline def setConsentDefaultForInit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setConsentDefaultForInit")().asInstanceOf[Unit]
  inline def setConsentDefaultForInit(consentSettings: ConsentSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setConsentDefaultForInit")(consentSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  
  inline def setDefaultEventParametersForInit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setDefaultEventParametersForInit")().asInstanceOf[Unit]
  inline def setDefaultEventParametersForInit(customParams: CustomParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setDefaultEventParametersForInit")(customParams.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
