package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.anon.GtagCore
import typings.firebaseAnalyticsTypes.mod.DataLayer
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@firebase/analytics/dist/src/helpers", "findGtagScriptOnPage")
  @js.native
  def findGtagScriptOnPage(): HTMLScriptElement | Null = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "getOrCreateDataLayer")
  @js.native
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "insertScriptTag")
  @js.native
  def insertScriptTag(dataLayerName: String): Unit = js.native
  
  @JSImport("@firebase/analytics/dist/src/helpers", "wrapOrCreateGtag")
  @js.native
  def wrapOrCreateGtag(
    initializationPromisesMap: StringDictionary[js.Promise[String]],
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    dataLayerName: String,
    gtagFunctionName: String
  ): GtagCore = js.native
}
