package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RepeatedString extends js.Object {
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$RepeatedString {
  @scala.inline
  def apply(values: js.Array[String] = null): Schema$RepeatedString = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RepeatedString]
  }
}

