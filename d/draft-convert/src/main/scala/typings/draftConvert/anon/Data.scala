package typings.draftConvert.anon

import typings.draftJs.mod.Draft.Model.Constants.DraftBlockType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: js.Object
  var `type`: DraftBlockType
}

object Data {
  @scala.inline
  def apply(data: js.Object, `type`: DraftBlockType): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

