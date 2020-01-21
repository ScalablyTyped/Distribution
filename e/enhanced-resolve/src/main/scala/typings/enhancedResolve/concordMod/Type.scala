package typings.enhancedResolve.concordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var features: js.Array[String]
  var `type`: js.UndefOr[String | Null] = js.undefined
}

object Type {
  @scala.inline
  def apply(features: js.Array[String], `type`: String = null): Type = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

