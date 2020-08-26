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
  def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  @scala.inline
  implicit class SchemaSettingsOps[Self <: SchemaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setItemsVarargs(value: SchemaSetting*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaSetting]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
  }
  
}

