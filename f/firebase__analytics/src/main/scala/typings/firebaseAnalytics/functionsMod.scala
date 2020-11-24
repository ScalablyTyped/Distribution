package typings.firebaseAnalytics

import typings.firebaseAnalyticsTypes.mod.AnalyticsCallOptions
import typings.firebaseAnalyticsTypes.mod.CustomParams
import typings.firebaseAnalyticsTypes.mod.EventParams
import typings.firebaseAnalyticsTypes.mod.Gtag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  
  def logEvent(gtagFunction: Gtag, initializationPromise: js.Promise[String], eventName: String): js.Promise[Unit] = js.native
  def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: js.UndefOr[scala.Nothing],
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: EventParams
  ): js.Promise[Unit] = js.native
  def logEvent(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    eventName: String,
    eventParams: EventParams,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  
  def setAnalyticsCollectionEnabled(initializationPromise: js.Promise[String], enabled: Boolean): js.Promise[Unit] = js.native
  
  def setCurrentScreen(gtagFunction: Gtag, initializationPromise: js.Promise[String]): js.Promise[Unit] = js.native
  def setCurrentScreen(gtagFunction: Gtag, initializationPromise: js.Promise[String], screenName: String): js.Promise[Unit] = js.native
  def setCurrentScreen(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    screenName: String,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  def setCurrentScreen(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    screenName: Null,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  
  def setUserId(gtagFunction: Gtag, initializationPromise: js.Promise[String]): js.Promise[Unit] = js.native
  def setUserId(gtagFunction: Gtag, initializationPromise: js.Promise[String], id: String): js.Promise[Unit] = js.native
  def setUserId(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    id: String,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  def setUserId(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    id: Null,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
  
  def setUserProperties(gtagFunction: Gtag, initializationPromise: js.Promise[String], properties: CustomParams): js.Promise[Unit] = js.native
  def setUserProperties(
    gtagFunction: Gtag,
    initializationPromise: js.Promise[String],
    properties: CustomParams,
    options: AnalyticsCallOptions
  ): js.Promise[Unit] = js.native
}
