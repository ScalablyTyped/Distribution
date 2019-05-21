package typings
package enhancedDashResolveLib.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var features: js.Array[java.lang.String]
  var `type`: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Type {
  @scala.inline
  def apply(features: js.Array[java.lang.String], `type`: java.lang.String = null): Type = {
    val __obj = js.Dynamic.literal(features = features)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Type]
  }
}

