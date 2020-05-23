package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: tag
}

object TagToken {
  @scala.inline
  def apply(contents: String, name: tag, location: LocationRange = null): TagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagToken]
  }
}

