package typings.firebase.firebaseMod.analytics

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
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsCallOptions]
  }
}

