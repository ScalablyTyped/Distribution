package typings.draftDashConvert

import typings.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Object
  var `type`: DraftBlockType
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Object, `type`: DraftBlockType): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

