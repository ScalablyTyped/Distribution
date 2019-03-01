package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyPortWrapper extends js.Object {
  @JSName("$")
  var $: scala.Double
  var `@enabled`: scala.Boolean
}

object LegacyPortWrapper {
  @scala.inline
  def apply($: scala.Double, `@enabled`: scala.Boolean): LegacyPortWrapper = {
    val __obj = js.Dynamic.literal(`@enabled` = `@enabled`)
    __obj.updateDynamic("$")($)
    __obj.asInstanceOf[LegacyPortWrapper]
  }
}

