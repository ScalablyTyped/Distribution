package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.opaqueTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpaqueTagToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: opaqueTag
}

object OpaqueTagToken {
  @scala.inline
  def apply(contents: String, name: opaqueTag, location: LocationRange = null): OpaqueTagToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpaqueTagToken]
  }
}

