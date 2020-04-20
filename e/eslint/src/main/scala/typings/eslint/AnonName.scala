package typings.eslint

import typings.estree.mod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: Identifier
}

object AnonName {
  @scala.inline
  def apply(name: Identifier): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

