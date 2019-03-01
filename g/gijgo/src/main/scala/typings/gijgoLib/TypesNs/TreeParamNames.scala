package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeParamNames extends js.Object {
  var parentId: js.UndefOr[java.lang.String] = js.undefined
}

object TreeParamNames {
  @scala.inline
  def apply(parentId: java.lang.String = null): TreeParamNames = {
    val __obj = js.Dynamic.literal()
    if (parentId != null) __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[TreeParamNames]
  }
}

