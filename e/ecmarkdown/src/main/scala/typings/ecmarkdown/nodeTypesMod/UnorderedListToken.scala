package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ul
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnorderedListToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: ul
}

object UnorderedListToken {
  @scala.inline
  def apply(contents: String, name: ul, location: LocationRange = null): UnorderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnorderedListToken]
  }
}

