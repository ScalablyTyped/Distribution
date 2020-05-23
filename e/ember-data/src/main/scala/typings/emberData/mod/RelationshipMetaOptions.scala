package typings.emberData.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipMetaOptions
  extends /* k */ StringDictionary[js.Any] {
  var async: js.UndefOr[Boolean] = js.undefined
  var inverse: js.UndefOr[String] = js.undefined
  var polymorphic: js.UndefOr[Boolean] = js.undefined
}

object RelationshipMetaOptions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    async: js.UndefOr[Boolean] = js.undefined,
    inverse: String = null,
    polymorphic: js.UndefOr[Boolean] = js.undefined
  ): RelationshipMetaOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.get.asInstanceOf[js.Any])
    if (inverse != null) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (!js.isUndefined(polymorphic)) __obj.updateDynamic("polymorphic")(polymorphic.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipMetaOptions]
  }
}

