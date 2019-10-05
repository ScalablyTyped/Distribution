package typings.ebml.ebmlMod.Tag

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in ebml.ebml.TagType ]: any} */ trait DataTypeToTypeMap extends js.Object {
  var `8`: String
  var b: Double
  var d: Date
  var f: Double
  var i: Double
  var m: js.UndefOr[scala.Nothing] = js.undefined
  var s: String
  var u: Double
}

object DataTypeToTypeMap {
  @scala.inline
  def apply(
    `8`: String,
    b: Double,
    d: Date,
    f: Double,
    i: Double,
    s: String,
    u: Double,
    m: js.UndefOr[scala.Nothing] = js.undefined
  ): DataTypeToTypeMap = {
    val __obj = js.Dynamic.literal(b = b, d = d, f = f, i = i, s = s, u = u)
    __obj.updateDynamic("8")(`8`)
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m)
    __obj.asInstanceOf[DataTypeToTypeMap]
  }
}

