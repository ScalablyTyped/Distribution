package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The constraints for this update.
  */
@js.native
trait Schema$Constraints extends js.Object {
  /**
    * A client&#39;s physical location, expressed as a ISO 31166-1 alpha-2
    * region code.
    */
  var deviceLocation: js.UndefOr[String] = js.native
  /**
    * Requests the lists for a specific language. Expects ISO 639 alpha-2
    * format.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sets the maximum number of entries that the client is willing to have in
    * the local database. This should be a power of 2 between 2**10 and 2**20.
    * If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2**10 and
    * 2**20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user&#39;s IP address. Expects
    * ISO 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The compression types supported by the client.
    */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Constraints {
  @scala.inline
  def apply(
    deviceLocation: String = null,
    language: String = null,
    maxDatabaseEntries: Int | Double = null,
    maxUpdateEntries: Int | Double = null,
    region: String = null,
    supportedCompressions: js.Array[String] = null
  ): Schema$Constraints = {
    val __obj = js.Dynamic.literal()
    if (deviceLocation != null) __obj.updateDynamic("deviceLocation")(deviceLocation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (maxDatabaseEntries != null) __obj.updateDynamic("maxDatabaseEntries")(maxDatabaseEntries.asInstanceOf[js.Any])
    if (maxUpdateEntries != null) __obj.updateDynamic("maxUpdateEntries")(maxUpdateEntries.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (supportedCompressions != null) __obj.updateDynamic("supportedCompressions")(supportedCompressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Constraints]
  }
}

