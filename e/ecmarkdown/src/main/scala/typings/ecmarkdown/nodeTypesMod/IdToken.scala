package typings.ecmarkdown.nodeTypesMod

import typings.ecmarkdown.ecmarkdownStrings.id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdToken extends js.Object {
  var location: js.UndefOr[LocationRange] = js.undefined
  var name: id
  var value: String
}

object IdToken {
  @scala.inline
  def apply(name: id, value: String, location: LocationRange = null): IdToken = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdToken]
  }
}

