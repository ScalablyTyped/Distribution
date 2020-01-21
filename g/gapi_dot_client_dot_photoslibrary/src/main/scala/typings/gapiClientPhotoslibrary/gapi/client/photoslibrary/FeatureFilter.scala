package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureFilter extends js.Object {
  /**
    * The set of features to be included in the media item search results.
    * The items in the set are ORed and may match any of the specified features.
    */
  var includedFeatures: js.UndefOr[js.Array[String]] = js.undefined
}

object FeatureFilter {
  @scala.inline
  def apply(includedFeatures: js.Array[String] = null): FeatureFilter = {
    val __obj = js.Dynamic.literal()
    if (includedFeatures != null) __obj.updateDynamic("includedFeatures")(includedFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureFilter]
  }
}

