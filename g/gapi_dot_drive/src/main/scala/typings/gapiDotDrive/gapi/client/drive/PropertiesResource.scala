package typings.gapiDotDrive.gapi.client.drive

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
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertiesResource]
  }
}

