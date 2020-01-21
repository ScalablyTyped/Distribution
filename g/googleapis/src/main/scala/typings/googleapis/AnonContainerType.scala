package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerType extends js.Object {
  var containerType: js.UndefOr[String] = js.native
  var sha1Checksum: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object AnonContainerType {
  @scala.inline
  def apply(containerType: String = null, sha1Checksum: String = null, source: String = null): AnonContainerType = {
    val __obj = js.Dynamic.literal()
    if (containerType != null) __obj.updateDynamic("containerType")(containerType.asInstanceOf[js.Any])
    if (sha1Checksum != null) __obj.updateDynamic("sha1Checksum")(sha1Checksum.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerType]
  }
}

