package typings.expressDashFrappe

import typings.bodyDashParser.bodyDashParserMod.OptionsJson
import typings.bodyDashParser.bodyDashParserMod.OptionsUrlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var json: js.UndefOr[Boolean | OptionsJson] = js.undefined
  var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.undefined
}

object Anon_Json {
  @scala.inline
  def apply(json: Boolean | OptionsJson = null, urlencoded: Boolean | OptionsUrlencoded = null): Anon_Json = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

