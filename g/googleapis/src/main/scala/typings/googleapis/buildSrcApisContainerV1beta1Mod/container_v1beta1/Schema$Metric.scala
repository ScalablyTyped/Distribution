package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress metric is (string, int|float|string) pair.
  */
@js.native
trait Schema$Metric extends js.Object {
  /**
    * For metrics with floating point value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * For metrics with integer value.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * Metric name, required. e.g., &quot;nodes total&quot;, &quot;percent
    * done&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * For metrics with custom values (ratios, visual progress, etc.).
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Schema$Metric {
  @scala.inline
  def apply(
    doubleValue: Int | Double = null,
    intValue: String = null,
    name: String = null,
    stringValue: String = null
  ): Schema$Metric = {
    val __obj = js.Dynamic.literal()
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metric]
  }
}

