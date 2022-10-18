package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.AnalyticsSettings
import typings.firebaseAnalytics.distEsmSrcTypesMod.DynamicConfig
import typings.firebaseAnalytics.distEsmSrcTypesMod.Gtag
import typings.firebaseAnalytics.distEsmSrcTypesMod.MinimalDynamicConfig
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInitializeAnalyticsMod {
  
  @JSImport("@firebase/analytics/dist/esm/src/initialize-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initializeAnalytics(
    app: FirebaseApp,
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
    gtagCore: Gtag,
    dataLayerName: String
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAnalytics")(app.asInstanceOf[js.Any], dynamicConfigPromisesList.asInstanceOf[js.Any], measurementIdToAppId.asInstanceOf[js.Any], installations.asInstanceOf[js.Any], gtagCore.asInstanceOf[js.Any], dataLayerName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def initializeAnalytics(
    app: FirebaseApp,
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    installations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseInstallationsInternal */ Any,
    gtagCore: Gtag,
    dataLayerName: String,
    options: AnalyticsSettings
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_initializeAnalytics")(app.asInstanceOf[js.Any], dynamicConfigPromisesList.asInstanceOf[js.Any], measurementIdToAppId.asInstanceOf[js.Any], installations.asInstanceOf[js.Any], gtagCore.asInstanceOf[js.Any], dataLayerName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
