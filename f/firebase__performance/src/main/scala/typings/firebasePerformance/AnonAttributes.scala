package typings.firebasePerformance

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var metrics: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object AnonAttributes {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, metrics: StringDictionary[Double] = null): AnonAttributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAttributes]
  }
}

