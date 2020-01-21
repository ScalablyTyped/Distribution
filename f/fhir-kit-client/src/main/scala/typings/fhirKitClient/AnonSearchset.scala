package typings.fhirKitClient

import typings.fhirKitClient.fhirKitClientStrings.searchset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSearchset extends js.Object {
  var `type`: searchset
}

object AnonSearchset {
  @scala.inline
  def apply(`type`: searchset): AnonSearchset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSearchset]
  }
}

