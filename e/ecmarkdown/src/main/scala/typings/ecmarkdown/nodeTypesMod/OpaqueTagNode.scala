package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueTagNode
  extends FragmentNode
     with Node {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: opaqueTag
}

object OpaqueTagNode {
  @scala.inline
  def apply(contents: String, name: opaqueTag, location: LocationRange = null): OpaqueTagNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueTagNode]
  }
}

