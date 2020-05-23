package typings.ejWebAll.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataType extends js.Object {
  var data: js.Any
  var `type`: String
  var url: String
}

object DataType {
  @scala.inline
  def apply(data: js.Any, `type`: String, url: String): DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
}

