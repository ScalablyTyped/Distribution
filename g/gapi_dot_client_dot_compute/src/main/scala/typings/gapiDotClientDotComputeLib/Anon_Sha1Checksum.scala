package typings
package gapiDotClientDotComputeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sha1Checksum extends js.Object {
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

