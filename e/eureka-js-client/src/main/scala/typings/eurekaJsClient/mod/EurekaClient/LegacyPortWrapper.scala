package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyPortWrapper extends js.Object {
  @JSName("$")
  var $: Double
  var `@enabled`: Boolean
}

object LegacyPortWrapper {
  @scala.inline
  def apply($: Double, `@enabled`: Boolean): LegacyPortWrapper = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.updateDynamic("@enabled")(`@enabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyPortWrapper]
  }
}

