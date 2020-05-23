package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarNode
  extends FormatNode
     with Node {
  var contents: js.Array[FragmentNode]
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: star
}

object StarNode {
  @scala.inline
  def apply(contents: js.Array[FragmentNode], name: star, location: LocationRange = null): StarNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarNode]
  }
}

