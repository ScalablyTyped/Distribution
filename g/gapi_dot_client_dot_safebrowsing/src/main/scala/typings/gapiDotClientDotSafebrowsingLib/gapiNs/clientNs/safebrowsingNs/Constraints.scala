package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  /**
    * Sets the maximum number of entries that the client is willing to have
    * in the local database. This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20. If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[scala.Double] = js.undefined
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user's IP address. Expects ISO
    * 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** The compression types supported by the client. */
  var supportedCompressions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(
    maxDatabaseEntries: scala.Int | scala.Double = null,
    maxUpdateEntries: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    supportedCompressions: js.Array[java.lang.String] = null
  ): Constraints = {
    val __obj = js.Dynamic.literal()
    if (maxDatabaseEntries != null) __obj.updateDynamic("maxDatabaseEntries")(maxDatabaseEntries.asInstanceOf[js.Any])
    if (maxUpdateEntries != null) __obj.updateDynamic("maxUpdateEntries")(maxUpdateEntries.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (supportedCompressions != null) __obj.updateDynamic("supportedCompressions")(supportedCompressions)
    __obj.asInstanceOf[Constraints]
  }
}

