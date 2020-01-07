package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Dimensions extends js.Object {
  var dimensions: js.UndefOr[String] = js.native
  var `end-date`: js.UndefOr[String] = js.native
  var filters: js.UndefOr[String] = js.native
  var ids: js.UndefOr[String] = js.native
  var `max-results`: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[js.Array[String]] = js.native
  var samplingLevel: js.UndefOr[String] = js.native
  var segment: js.UndefOr[String] = js.native
  var sort: js.UndefOr[js.Array[String]] = js.native
  var `start-date`: js.UndefOr[String] = js.native
  var `start-index`: js.UndefOr[Double] = js.native
}

object Anon_Dimensions {
  @scala.inline
  def apply(
    dimensions: String = null,
    `end-date`: String = null,
    filters: String = null,
    ids: String = null,
    `max-results`: Int | Double = null,
    metrics: js.Array[String] = null,
    samplingLevel: String = null,
    segment: String = null,
    sort: js.Array[String] = null,
    `start-date`: String = null,
    `start-index`: Int | Double = null
  ): Anon_Dimensions = {
    val __obj = js.Dynamic.literal()
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (`end-date` != null) __obj.updateDynamic("end-date")(`end-date`.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (`max-results` != null) __obj.updateDynamic("max-results")(`max-results`.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (samplingLevel != null) __obj.updateDynamic("samplingLevel")(samplingLevel.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (`start-date` != null) __obj.updateDynamic("start-date")(`start-date`.asInstanceOf[js.Any])
    if (`start-index` != null) __obj.updateDynamic("start-index")(`start-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Dimensions]
  }
}

