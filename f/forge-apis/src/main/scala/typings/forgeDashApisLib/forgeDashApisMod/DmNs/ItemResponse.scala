package typings
package forgeDashApisLib.forgeDashApisMod.DmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  var data: js.Array[_]
  var included: js.Array[Item]
  var jsonapi: forgeDashApisLib.Anon_Version
  var links: js.Any
}

object ItemResponse {
  @scala.inline
  def apply(data: js.Array[_], included: js.Array[Item], jsonapi: forgeDashApisLib.Anon_Version, links: js.Any): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("included")(included)
    __obj.updateDynamic("jsonapi")(jsonapi)
    __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[ItemResponse]
  }
}

