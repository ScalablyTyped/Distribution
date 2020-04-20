package typings.eslint

import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeading extends js.Object {
  var leading: js.Array[Comment]
  var trailing: js.Array[Comment]
}

object AnonLeading {
  @scala.inline
  def apply(leading: js.Array[Comment], trailing: js.Array[Comment]): AnonLeading = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeading]
  }
}

