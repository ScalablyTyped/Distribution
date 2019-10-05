package typings.forgeDashApis.forgeDashApisMod.Dm

import typings.forgeDashApis.Anon_CreateTime
import typings.forgeDashApis.Anon_Derivatives
import typings.forgeDashApis.Anon_Self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var attributes: Anon_CreateTime
  var id: String
  var links: Anon_Self
  var relationships: Anon_Derivatives
  var `type`: String
}

object Item {
  @scala.inline
  def apply(
    attributes: Anon_CreateTime,
    id: String,
    links: Anon_Self,
    relationships: Anon_Derivatives,
    `type`: String
  ): Item = {
    val __obj = js.Dynamic.literal(attributes = attributes, id = id, links = links, relationships = relationships)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Item]
  }
}

