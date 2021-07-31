package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.Gtag
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeIdsMod {
  
  @JSImport("@firebase/analytics/dist/src/initialize-ids", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initializeIds(
    app: FirebaseApp,
    dynamicConfigPromisesList: js.Array[js.Promise[DynamicConfig | MinimalDynamicConfig]],
    measurementIdToAppId: StringDictionary[String],
    installations: FirebaseInstallations,
    gtagCore: Gtag
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeIds")(app.asInstanceOf[js.Any], dynamicConfigPromisesList.asInstanceOf[js.Any], measurementIdToAppId.asInstanceOf[js.Any], installations.asInstanceOf[js.Any], gtagCore.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
