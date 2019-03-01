package typings
package forgeDashApisLib.forgeDashApisMod.DmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var attributes: forgeDashApisLib.Anon_CreateTime
  var id: java.lang.String
  var links: forgeDashApisLib.Anon_Self
  var relationships: forgeDashApisLib.Anon_Derivatives
  var `type`: java.lang.String
}

object Item {
  @scala.inline
  def apply(
    attributes: forgeDashApisLib.Anon_CreateTime,
    id: java.lang.String,
    links: forgeDashApisLib.Anon_Self,
    relationships: forgeDashApisLib.Anon_Derivatives,
    `type`: java.lang.String
  ): Item = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("links")(links)
    __obj.updateDynamic("relationships")(relationships)
    __obj.asInstanceOf[Item]
  }
}

