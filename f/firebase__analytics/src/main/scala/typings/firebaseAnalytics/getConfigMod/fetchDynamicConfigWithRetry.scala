package typings.firebaseAnalytics.getConfigMod

import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import typings.firebaseAnalyticsTypes.mod.MinimalDynamicConfig
import typings.firebaseAppTypes.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfigWithRetry")
@js.native
object fetchDynamicConfigWithRetry extends js.Object {
  
  def apply(app: FirebaseApp): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  def apply(app: FirebaseApp, retryData: js.UndefOr[scala.Nothing], timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  def apply(app: FirebaseApp, retryData: RetryData): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
  def apply(app: FirebaseApp, retryData: RetryData, timeoutMillis: Double): js.Promise[DynamicConfig | MinimalDynamicConfig] = js.native
}
