package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesResource extends js.Object {
  var etag: java.lang.String
  var key: java.lang.String
  var kind: gapiDotDriveLib.gapiDotDriveLibStrings.driveDOLLARproperty
  var selfLink: java.lang.String
  var value: java.lang.String
  var visibility: java.lang.String
}

object PropertiesResource {
  @scala.inline
  def apply(
    etag: java.lang.String,
    key: java.lang.String,
    kind: gapiDotDriveLib.gapiDotDriveLibStrings.driveDOLLARproperty,
    selfLink: java.lang.String,
    value: java.lang.String,
    visibility: java.lang.String
  ): PropertiesResource = {
    val __obj = js.Dynamic.literal(etag = etag, key = key, kind = kind, selfLink = selfLink, value = value, visibility = visibility)
  
    __obj.asInstanceOf[PropertiesResource]
  }
}

