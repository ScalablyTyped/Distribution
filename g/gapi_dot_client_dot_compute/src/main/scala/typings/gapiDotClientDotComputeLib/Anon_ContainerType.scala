package typings
package gapiDotClientDotComputeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerType extends js.Object {
  /**
    * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime
    * format. Provided by the client when the disk image is created.
    */
  var containerType: js.UndefOr[java.lang.String] = js.undefined
  /** An optional SHA1 checksum of the disk image before unpackaging; provided by the client when the disk image is created. */
  var sha1Checksum: js.UndefOr[java.lang.String] = js.undefined
  /** The full Google Cloud Storage URL where the disk image is stored. You must provide either this property or the sourceDisk property but not both. */
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ContainerType {
  @scala.inline
  def apply(
    containerType: java.lang.String = null,
    sha1Checksum: java.lang.String = null,
    source: java.lang.String = null
  ): Anon_ContainerType = {
    val __obj = js.Dynamic.literal()
    if (containerType != null) __obj.updateDynamic("containerType")(containerType)
    if (sha1Checksum != null) __obj.updateDynamic("sha1Checksum")(sha1Checksum)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_ContainerType]
  }
}

