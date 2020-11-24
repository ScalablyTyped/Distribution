package typings.firebaseAnalytics.getConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/analytics/dist/src/get-config", "AnalyticsAbortSignal")
@js.native
class AnalyticsAbortSignal () extends js.Object {
  
  def abort(): Unit = js.native
  
  def addEventListener(listener: js.Function0[Unit]): Unit = js.native
  
  var listeners: js.Array[js.Function0[Unit]] = js.native
}
