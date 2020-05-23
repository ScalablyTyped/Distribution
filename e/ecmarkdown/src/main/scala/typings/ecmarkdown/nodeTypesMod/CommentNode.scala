package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentNode
  extends FragmentNode
     with Node {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: comment
}

object CommentNode {
  @scala.inline
  def apply(contents: String, name: comment, location: LocationRange = null): CommentNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentNode]
  }
}

