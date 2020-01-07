package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message containing the custome metric.
  */
@js.native
trait Schema$CustomMetric extends js.Object {
  /**
    * Custom metric name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Custom metric numeric value.
    */
  var value: js.UndefOr[Double] = js.native
}

object Schema$CustomMetric {
  @scala.inline
  def apply(name: String = null, value: Int | Double = null): Schema$CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomMetric]
  }
}

