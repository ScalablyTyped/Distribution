package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaClustering extends js.Object {
  /**
    * [Repeated] One or more fields on which data should be clustered. Only
    * top-level, non-repeated, simple-type fields are supported. When you
    * cluster a table using multiple columns, the order of columns you specify
    * is important. The order of the specified columns determines the sort
    * order of the data.
    */
  var fields: js.UndefOr[js.Array[String]] = js.native
}

object SchemaClustering {
  @scala.inline
  def apply(fields: js.Array[String] = null): SchemaClustering = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClustering]
  }
}

