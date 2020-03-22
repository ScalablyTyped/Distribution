package typings.ebml.mod.Tag

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Record<ebml.ebml.TagType, any> */
trait DataTypeToTypeMap extends js.Object {
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
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    if (!js.isUndefined(m)) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeToTypeMap]
  }
}

