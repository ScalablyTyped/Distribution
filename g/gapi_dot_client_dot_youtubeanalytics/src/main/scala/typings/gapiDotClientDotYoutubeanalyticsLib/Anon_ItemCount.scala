package typings
package gapiDotClientDotYoutubeanalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemCount extends js.Object {
  var itemCount: js.UndefOr[java.lang.String] = js.undefined
  var itemType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ItemCount {
  @scala.inline
  def apply(itemCount: java.lang.String = null, itemType: java.lang.String = null): Anon_ItemCount = {
    val __obj = js.Dynamic.literal()
    if (itemCount != null) __obj.updateDynamic("itemCount")(itemCount)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    __obj.asInstanceOf[Anon_ItemCount]
  }
}

