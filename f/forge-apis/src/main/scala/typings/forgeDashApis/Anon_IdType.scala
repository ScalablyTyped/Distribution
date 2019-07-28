package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdType extends js.Object {
  var id: String
  var `type`: String
}

object Anon_IdType {
  @scala.inline
  def apply(id: String, `type`: String): Anon_IdType = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdType]
  }
}

