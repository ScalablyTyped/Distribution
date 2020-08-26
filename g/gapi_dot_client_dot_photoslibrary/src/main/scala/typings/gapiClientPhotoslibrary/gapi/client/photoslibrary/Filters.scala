package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /** Filters the media items based on their content. */
  var contentFilter: js.UndefOr[ContentFilter] = js.native
  /** Filters the media items based on their creation date. */
  var dateFilter: js.UndefOr[DateFilter] = js.native
  /**
    * If set, the results exclude media items that were not created by this app.
    * Defaults to false (all media items are returned). This field is ignored if
    * the photoslibrary.readonly.appcreateddata scope is used.
    */
  var excludeNonAppCreatedData: js.UndefOr[Boolean] = js.native
  /** Filters the media items based on their features. */
  var featureFilter: js.UndefOr[FeatureFilter] = js.native
  /**
    * If set, the results include media items that the user has archived.
    * Defaults to false (archived media items aren't included).
    */
  var includeArchivedMedia: js.UndefOr[Boolean] = js.native
  /** Filters the media items based on the type of media. */
  var mediaTypeFilter: js.UndefOr[MediaTypeFilter] = js.native
}

object Filters {
  @scala.inline
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
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
    def setContentFilter(value: ContentFilter): Self = this.set("contentFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentFilter: Self = this.set("contentFilter", js.undefined)
    @scala.inline
    def setDateFilter(value: DateFilter): Self = this.set("dateFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFilter: Self = this.set("dateFilter", js.undefined)
    @scala.inline
    def setExcludeNonAppCreatedData(value: Boolean): Self = this.set("excludeNonAppCreatedData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeNonAppCreatedData: Self = this.set("excludeNonAppCreatedData", js.undefined)
    @scala.inline
    def setFeatureFilter(value: FeatureFilter): Self = this.set("featureFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureFilter: Self = this.set("featureFilter", js.undefined)
    @scala.inline
    def setIncludeArchivedMedia(value: Boolean): Self = this.set("includeArchivedMedia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeArchivedMedia: Self = this.set("includeArchivedMedia", js.undefined)
    @scala.inline
    def setMediaTypeFilter(value: MediaTypeFilter): Self = this.set("mediaTypeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypeFilter: Self = this.set("mediaTypeFilter", js.undefined)
  }
  
}

