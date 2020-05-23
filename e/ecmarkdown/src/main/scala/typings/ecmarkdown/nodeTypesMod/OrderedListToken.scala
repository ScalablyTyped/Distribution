package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.ol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedListToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: ol
}

object OrderedListToken {
  @scala.inline
  def apply(contents: String, name: ol, location: LocationRange = null): OrderedListToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListToken]
  }
}

