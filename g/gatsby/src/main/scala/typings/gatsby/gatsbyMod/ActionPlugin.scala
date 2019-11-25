package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionPlugin extends js.Object {
  var name: String
}

object ActionPlugin {
  @scala.inline
  def apply(name: String): ActionPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionPlugin]
  }
}

