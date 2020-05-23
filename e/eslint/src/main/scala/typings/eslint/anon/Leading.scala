package typings.eslint.anon

import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leading extends js.Object {
  var leading: js.Array[Comment]
  var trailing: js.Array[Comment]
}

object Leading {
  @scala.inline
  def apply(leading: js.Array[Comment], trailing: js.Array[Comment]): Leading = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leading]
  }
}

