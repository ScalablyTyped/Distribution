package typings.atFirebaseAnalyticsDashTypes.atFirebaseAnalyticsDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsCallOptions extends js.Object {
  /**
    * If true, this config or event call applies globally to all
    * analytics properties on the page.
    */
  var global: Boolean
}

object AnalyticsCallOptions {
  @scala.inline
  def apply(global: Boolean): AnalyticsCallOptions = {
    val __obj = js.Dynamic.literal(global = global)
  
    __obj.asInstanceOf[AnalyticsCallOptions]
  }
}

