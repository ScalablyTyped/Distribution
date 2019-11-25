package typings.atFirebasePerformanceDashTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var metrics: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(attributes: StringDictionary[String] = null, metrics: StringDictionary[Double] = null): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes]
  }
}

