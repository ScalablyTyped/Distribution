package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tilde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TildeNode
  extends FormatNode
     with Node {
  var contents: js.Array[FragmentNode]
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: tilde
}

object TildeNode {
  @scala.inline
  def apply(contents: js.Array[FragmentNode], name: tilde, location: LocationRange = null): TildeNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TildeNode]
  }
}

