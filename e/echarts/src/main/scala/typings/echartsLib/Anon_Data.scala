package typings
package echartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  // The data to be appended.
  var data: js.UndefOr[js.Array[_] | echartsLib.echartsNs.TypedArray] = js.undefined
  // Specify which series the data will be appended to.
  var seriesIndex: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Array[_] | echartsLib.echartsNs.TypedArray = null, seriesIndex: java.lang.String = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (seriesIndex != null) __obj.updateDynamic("seriesIndex")(seriesIndex)
    __obj.asInstanceOf[Anon_Data]
  }
}

