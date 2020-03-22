package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerMixin extends js.Object {
   // DEPRECATED: use 'fills' instead
  var backgroundStyleId: String
  var backgrounds: js.Array[Paint]
  var expanded: Boolean
}

object ContainerMixin {
  @scala.inline
  def apply(backgroundStyleId: String, backgrounds: js.Array[Paint], expanded: Boolean): ContainerMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerMixin]
  }
}

