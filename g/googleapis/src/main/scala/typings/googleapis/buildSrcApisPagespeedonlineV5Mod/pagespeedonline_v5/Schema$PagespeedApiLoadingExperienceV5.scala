package typings.googleapis.buildSrcApisPagespeedonlineV5Mod.pagespeedonline_v5

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_CategoryDistributionsPercentile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PagespeedApiLoadingExperienceV5 extends js.Object {
  /**
    * The url, pattern or origin which the metrics are on.
    */
  var id: js.UndefOr[String] = js.native
  var initial_url: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[StringDictionary[Anon_CategoryDistributionsPercentile]] = js.native
  var overall_category: js.UndefOr[String] = js.native
}

object Schema$PagespeedApiLoadingExperienceV5 {
  @scala.inline
  def apply(
    id: String = null,
    initial_url: String = null,
    metrics: StringDictionary[Anon_CategoryDistributionsPercentile] = null,
    overall_category: String = null
  ): Schema$PagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial_url != null) __obj.updateDynamic("initial_url")(initial_url.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (overall_category != null) __obj.updateDynamic("overall_category")(overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PagespeedApiLoadingExperienceV5]
  }
}

