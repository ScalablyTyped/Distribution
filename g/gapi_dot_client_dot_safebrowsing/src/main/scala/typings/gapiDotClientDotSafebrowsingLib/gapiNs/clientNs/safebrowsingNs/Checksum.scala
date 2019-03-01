package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checksum extends js.Object {
  /**
    * The SHA256 hash of the client state; that is, of the sorted list of all
    * hashes present in the database.
    */
  var sha256: js.UndefOr[java.lang.String] = js.undefined
}

object Checksum {
  @scala.inline
  def apply(sha256: java.lang.String = null): Checksum = {
    val __obj = js.Dynamic.literal()
    if (sha256 != null) __obj.updateDynamic("sha256")(sha256)
    __obj.asInstanceOf[Checksum]
  }
}

