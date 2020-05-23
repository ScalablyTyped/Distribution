package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.anon.GtagCore
import typings.firebaseAnalyticsTypes.mod.DataLayer
import typings.firebaseAnalyticsTypes.mod.Gtag
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
@js.native
object helpersMod extends js.Object {
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  def initializeGAId(app: FirebaseApp, installations: FirebaseInstallations, gtagCore: Gtag): js.Promise[Unit] = js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  def wrapOrCreateGtag(
    initializedIdPromisesMap: StringDictionary[js.Promise[Unit]],
    dataLayerName: String,
    gtagFunctionName: String
  ): GtagCore = js.native
}

