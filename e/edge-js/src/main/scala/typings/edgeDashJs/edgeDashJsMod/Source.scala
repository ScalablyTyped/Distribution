package typings.edgeDashJs.edgeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var references: js.UndefOr[js.Array[String]] = js.undefined
  var source: String | js.Function
}

object Source {
  @scala.inline
  def apply(source: String | js.Function, references: js.Array[String] = null): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

