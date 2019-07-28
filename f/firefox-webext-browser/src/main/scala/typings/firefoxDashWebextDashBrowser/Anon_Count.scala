package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var rangeData: js.UndefOr[js.Array[Anon_EndOffset]] = js.undefined
  var rectData: js.UndefOr[js.Array[Anon_RectsAndTexts]] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    count: Double,
    rangeData: js.Array[Anon_EndOffset] = null,
    rectData: js.Array[Anon_RectsAndTexts] = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count)
    if (rangeData != null) __obj.updateDynamic("rangeData")(rangeData)
    if (rectData != null) __obj.updateDynamic("rectData")(rectData)
    __obj.asInstanceOf[Anon_Count]
  }
}

