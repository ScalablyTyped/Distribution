package typings.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndices extends js.Object {
  var alias: String
  var index: js.UndefOr[String] = js.undefined
  var indices: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonIndices {
  @scala.inline
  def apply(alias: String, index: String = null, indices: js.Array[String] = null): AnonIndices = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indices != null) __obj.updateDynamic("indices")(indices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndices]
  }
}

