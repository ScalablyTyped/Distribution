package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.anon.GtagCore
import typings.firebaseAnalyticsTypes.mod.DataLayer
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findGtagScriptOnPage(): HTMLScriptElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findGtagScriptOnPage")().asInstanceOf[HTMLScriptElement | Null]
  
  @scala.inline
  def getOrCreateDataLayer(dataLayerName: String): DataLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateDataLayer")(dataLayerName.asInstanceOf[js.Any]).asInstanceOf[DataLayer]
  
  @scala.inline
  def insertScriptTag(dataLayerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("insertScriptTag")(dataLayerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def wrapOrCreateGtag(
    initializationPromisesMap: StringDictionary[js.Promise[String]],
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    dataLayerName: String,
    gtagFunctionName: String
  ): GtagCore = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapOrCreateGtag")(initializationPromisesMap.asInstanceOf[js.Any], dynamicConfigPromisesList.asInstanceOf[js.Any], measurementIdToAppId.asInstanceOf[js.Any], dataLayerName.asInstanceOf[js.Any], gtagFunctionName.asInstanceOf[js.Any])).asInstanceOf[GtagCore]
}
