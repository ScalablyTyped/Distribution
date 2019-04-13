package typings
package expressDashFrappeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var json: js.UndefOr[scala.Boolean | bodyDashParserLib.bodyDashParserMod.OptionsJson] = js.undefined
  var urlencoded: js.UndefOr[scala.Boolean | bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded] = js.undefined
}

object Anon_Json {
  @scala.inline
  def apply(
    json: scala.Boolean | bodyDashParserLib.bodyDashParserMod.OptionsJson = null,
    urlencoded: scala.Boolean | bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded = null
  ): Anon_Json = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

