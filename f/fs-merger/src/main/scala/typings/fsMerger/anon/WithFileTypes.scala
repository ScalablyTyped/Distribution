package typings.fsMerger.anon

import typings.fsMerger.fsMergerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithFileTypes extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object WithFileTypes {
  @scala.inline
  def apply(encoding: js.UndefOr[Null | String] = js.undefined, withFileTypes: `false` = null): WithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithFileTypes]
  }
}

