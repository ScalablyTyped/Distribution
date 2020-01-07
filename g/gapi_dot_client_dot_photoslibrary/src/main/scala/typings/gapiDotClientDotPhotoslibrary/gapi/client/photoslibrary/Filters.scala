package typings.gapiDotClientDotPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends js.Object {
  /** Filters the media items based on their content. */
  var contentFilter: js.UndefOr[ContentFilter] = js.undefined
  /** Filters the media items based on their creation date. */
  var dateFilter: js.UndefOr[DateFilter] = js.undefined
  /**
    * If set, the results exclude media items that were not created by this app.
    * Defaults to false (all media items are returned). This field is ignored if
    * the photoslibrary.readonly.appcreateddata scope is used.
    */
  var excludeNonAppCreatedData: js.UndefOr[Boolean] = js.undefined
  /** Filters the media items based on their features. */
  var featureFilter: js.UndefOr[FeatureFilter] = js.undefined
  /**
    * If set, the results include media items that the user has archived.
    * Defaults to false (archived media items aren't included).
    */
  var includeArchivedMedia: js.UndefOr[Boolean] = js.undefined
  /** Filters the media items based on the type of media. */
  var mediaTypeFilter: js.UndefOr[MediaTypeFilter] = js.undefined
}

object Filters {
  @scala.inline
  def apply(
    contentFilter: ContentFilter = null,
    dateFilter: DateFilter = null,
    excludeNonAppCreatedData: js.UndefOr[Boolean] = js.undefined,
    featureFilter: FeatureFilter = null,
    includeArchivedMedia: js.UndefOr[Boolean] = js.undefined,
    mediaTypeFilter: MediaTypeFilter = null
  ): Filters = {
    val __obj = js.Dynamic.literal()
    if (contentFilter != null) __obj.updateDynamic("contentFilter")(contentFilter.asInstanceOf[js.Any])
    if (dateFilter != null) __obj.updateDynamic("dateFilter")(dateFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeNonAppCreatedData)) __obj.updateDynamic("excludeNonAppCreatedData")(excludeNonAppCreatedData.asInstanceOf[js.Any])
    if (featureFilter != null) __obj.updateDynamic("featureFilter")(featureFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(includeArchivedMedia)) __obj.updateDynamic("includeArchivedMedia")(includeArchivedMedia.asInstanceOf[js.Any])
    if (mediaTypeFilter != null) __obj.updateDynamic("mediaTypeFilter")(mediaTypeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

