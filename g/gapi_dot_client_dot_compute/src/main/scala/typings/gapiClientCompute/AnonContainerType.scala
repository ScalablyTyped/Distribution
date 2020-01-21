package typings.gapiClientCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerType extends js.Object {
  /**
    * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime
    * format. Provided by the client when the disk image is created.
    */
  var containerType: js.UndefOr[String] = js.undefined
  /** An optional SHA1 checksum of the disk image before unpackaging; provided by the client when the disk image is created. */
  var sha1Checksum: js.UndefOr[String] = js.undefined
  /** The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both. */
  var source: js.UndefOr[String] = js.undefined
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

