package typings.atFluentBundle.atFluentBundleMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawMessage extends js.Object {
  var attributes: Record[String, Pattern]
  var value: Pattern | Null
}

object RawMessage {
  @scala.inline
  def apply(attributes: Record[String, Pattern], value: Pattern = null): RawMessage = {
    val __obj = js.Dynamic.literal(attributes = attributes)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RawMessage]
  }
}

