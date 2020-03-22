package typings.googleapis

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInitialurl extends js.Object {
  var id: js.UndefOr[String] = js.native
  var initial_url: js.UndefOr[String] = js.native
  var metrics: js.UndefOr[StringDictionary[AnonDistributions]] = js.native
  var overall_category: js.UndefOr[String] = js.native
}

object AnonInitialurl {
  @scala.inline
  def apply(
    id: String = null,
    initial_url: String = null,
    metrics: StringDictionary[AnonDistributions] = null,
    overall_category: String = null
  ): AnonInitialurl = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (initial_url != null) __obj.updateDynamic("initial_url")(initial_url.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (overall_category != null) __obj.updateDynamic("overall_category")(overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialurl]
  }
}

