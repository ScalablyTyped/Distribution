package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of object values.
  */
@js.native
trait Schema$ObjectValues extends js.Object {
  var values: js.UndefOr[js.Array[Schema$StructuredDataObject]] = js.native
}

object Schema$ObjectValues {
  @scala.inline
  def apply(values: js.Array[Schema$StructuredDataObject] = null): Schema$ObjectValues = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ObjectValues]
  }
}

