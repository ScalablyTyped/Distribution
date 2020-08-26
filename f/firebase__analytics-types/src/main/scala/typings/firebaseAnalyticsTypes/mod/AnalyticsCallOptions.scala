package typings.firebaseAnalyticsTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsCallOptions extends js.Object {
  /**
    * If true, this config or event call applies globally to all
    * analytics properties on the page.
    */
  var global: Boolean = js.native
}

object AnalyticsCallOptions {
  @scala.inline
  def apply(global: Boolean): AnalyticsCallOptions = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsCallOptions]
  }
  @scala.inline
  implicit class AnalyticsCallOptionsOps[Self <: AnalyticsCallOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
  }
  
}

