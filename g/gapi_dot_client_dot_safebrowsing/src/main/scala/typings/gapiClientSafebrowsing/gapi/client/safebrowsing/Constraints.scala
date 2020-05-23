package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  /**
    * Sets the maximum number of entries that the client is willing to have
    * in the local database. This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20. If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.undefined
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.undefined
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user's IP address. Expects ISO
    * 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.undefined
  /** The compression types supported by the client. */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(
    maxDatabaseEntries: js.UndefOr[Double] = js.undefined,
    maxUpdateEntries: js.UndefOr[Double] = js.undefined,
    region: String = null,
    supportedCompressions: js.Array[String] = null
  ): Constraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxDatabaseEntries)) __obj.updateDynamic("maxDatabaseEntries")(maxDatabaseEntries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxUpdateEntries)) __obj.updateDynamic("maxUpdateEntries")(maxUpdateEntries.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (supportedCompressions != null) __obj.updateDynamic("supportedCompressions")(supportedCompressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
}

