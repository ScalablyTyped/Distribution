package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of date values.
  */
@js.native
trait SchemaDateValues extends js.Object {
  var values: js.UndefOr[js.Array[SchemaDate]] = js.native
}

object SchemaDateValues {
  @scala.inline
  def apply(values: js.Array[SchemaDate] = null): SchemaDateValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDateValues]
  }
}

