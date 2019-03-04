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
    val __obj = js.Dynamic.literal(attributes = attributes, id = id, links = links, relationships = relationships)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Item]
  }
}

