package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.parabreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParabreakToken extends Token {
  var contents: String
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: parabreak
}

object ParabreakToken {
  @scala.inline
  def apply(contents: String, name: parabreak, location: LocationRange = null): ParabreakToken = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParabreakToken]
  }
}

