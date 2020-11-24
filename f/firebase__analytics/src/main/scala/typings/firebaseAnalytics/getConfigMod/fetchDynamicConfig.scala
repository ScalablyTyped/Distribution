package typings.firebaseAnalytics.getConfigMod

import typings.firebaseAnalyticsTypes.mod.DynamicConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/get-config", "fetchDynamicConfig")
@js.native
object fetchDynamicConfig extends js.Object {
  
  def apply(appFields: AppFields): js.Promise[DynamicConfig] = js.native
}
