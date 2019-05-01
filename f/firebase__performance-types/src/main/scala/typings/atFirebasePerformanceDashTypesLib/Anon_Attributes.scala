package typings
package atFirebasePerformanceDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var metrics: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    metrics: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    __obj.asInstanceOf[Anon_Attributes]
  }
}

