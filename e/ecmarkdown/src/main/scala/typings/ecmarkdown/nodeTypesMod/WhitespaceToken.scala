package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhitespaceToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: whitespace
}

object WhitespaceToken {
  @scala.inline
  def apply(contents: String, name: whitespace, location: LocationRange = null): WhitespaceToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhitespaceToken]
  }
}

