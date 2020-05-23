package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.underscore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderscoreNode
  extends FormatNode
     with Node {
  var contents: js.Array[FragmentNode]
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: underscore
}

object UnderscoreNode {
  @scala.inline
  def apply(contents: js.Array[FragmentNode], name: underscore, location: LocationRange = null): UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderscoreNode]
  }
}

