package typings.expressFrappe.anon

import typings.bodyParser.mod.OptionsJson
import typings.bodyParser.mod.OptionsUrlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  var json: js.UndefOr[Boolean | OptionsJson] = js.undefined
  var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.undefined
}

object Json {
  @scala.inline
  def apply(json: Boolean | OptionsJson = null, urlencoded: Boolean | OptionsUrlencoded = null): Json = {
    val __obj = js.Dynamic.literal()
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (urlencoded != null) __obj.updateDynamic("urlencoded")(urlencoded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
}

