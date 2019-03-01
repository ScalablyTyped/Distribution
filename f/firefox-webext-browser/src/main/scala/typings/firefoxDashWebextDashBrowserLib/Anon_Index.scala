package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var parentId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, parentId: java.lang.String = null): Anon_Index = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[Anon_Index]
  }
}

