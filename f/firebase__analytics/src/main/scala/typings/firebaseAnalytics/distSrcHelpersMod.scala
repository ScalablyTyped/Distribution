package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.anon.WrappedGtag
import typings.firebaseAnalytics.distSrcTypesMod.DataLayer
import typings.firebaseAnalytics.distSrcTypesMod.DynamicConfig
import typings.firebaseAnalytics.distSrcTypesMod.MinimalDynamicConfig
import typings.std.HTMLScriptElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersMod {
  
  @JSImport("@firebase/analytics/dist/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findGtagScriptOnPage(dataLayerName: String): HTMLScriptElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findGtagScriptOnPage")(dataLayerName.asInstanceOf[js.Any]).asInstanceOf[HTMLScriptElement | Null]
  
  inline def getOrCreateDataLayer(dataLayerName: String): DataLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateDataLayer")(dataLayerName.asInstanceOf[js.Any]).asInstanceOf[DataLayer]
  
  inline def insertScriptTag(dataLayerName: String, measurementId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertScriptTag")(dataLayerName.asInstanceOf[js.Any], measurementId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def promiseAllSettled[T](promises: js.Array[js.Promise[T]]): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseAllSettled")(promises.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def wrapOrCreateGtag(
    initializationPromisesMap: StringDictionary[js.Promise[String]],
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    dataLayerName: String,
    gtagFunctionName: String
  ): WrappedGtag = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapOrCreateGtag")(initializationPromisesMap.asInstanceOf[js.Any], dynamicConfigPromisesList.asInstanceOf[js.Any], measurementIdToAppId.asInstanceOf[js.Any], dataLayerName.asInstanceOf[js.Any], gtagFunctionName.asInstanceOf[js.Any])).asInstanceOf[WrappedGtag]
}
