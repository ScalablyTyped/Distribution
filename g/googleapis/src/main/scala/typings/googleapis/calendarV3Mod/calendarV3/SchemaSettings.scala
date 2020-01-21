package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSettings extends js.Object {
  /**
    * Etag of the collection.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of user settings.
    */
  var items: js.UndefOr[js.Array[SchemaSetting]] = js.native
  /**
    * Type of the collection (&quot;calendar#settings&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access the next page of this result. Omitted if no further
    * results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Token used at a later point in time to retrieve only the entries that
    * have changed since this result was returned. Omitted if further results
    * are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[SchemaSetting] = null,
    kind: String = null,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSettings]
  }
}

