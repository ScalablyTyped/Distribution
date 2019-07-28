package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import typings.gapiDotDrive.gapiDotDriveStrings.driveDOLLARproperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesResource extends js.Object {
  var etag: String
  var key: String
  var kind: driveDOLLARproperty
  var selfLink: String
  var value: String
  var visibility: String
}

object PropertiesResource {
  @scala.inline
  def apply(
    etag: String,
    key: String,
    kind: driveDOLLARproperty,
    selfLink: String,
    value: String,
    visibility: String
  ): PropertiesResource = {
    val __obj = js.Dynamic.literal(etag = etag, key = key, kind = kind, selfLink = selfLink, value = value, visibility = visibility)
  
    __obj.asInstanceOf[PropertiesResource]
  }
}

