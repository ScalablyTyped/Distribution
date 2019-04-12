package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickReplies extends js.Object {
  var quickReplies: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object QuickReplies {
  @scala.inline
  def apply(quickReplies: js.Array[java.lang.String] = null, title: java.lang.String = null): QuickReplies = {
    val __obj = js.Dynamic.literal()
    if (quickReplies != null) __obj.updateDynamic("quickReplies")(quickReplies)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[QuickReplies]
  }
}

