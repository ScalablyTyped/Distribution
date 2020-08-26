package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFilter extends js.Object {
  /**
    * The set of features to be included in the media item search results.
    * The items in the set are ORed and may match any of the specified features.
    */
  var includedFeatures: js.UndefOr[js.Array[String]] = js.native
}

object FeatureFilter {
  @scala.inline
  def apply(): FeatureFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureFilter]
  }
  @scala.inline
  implicit class FeatureFilterOps[Self <: FeatureFilter] (val x: Self) extends AnyVal {
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
    def setIncludedFeaturesVarargs(value: String*): Self = this.set("includedFeatures", js.Array(value :_*))
    @scala.inline
    def setIncludedFeatures(value: js.Array[String]): Self = this.set("includedFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedFeatures: Self = this.set("includedFeatures", js.undefined)
  }
  
}

