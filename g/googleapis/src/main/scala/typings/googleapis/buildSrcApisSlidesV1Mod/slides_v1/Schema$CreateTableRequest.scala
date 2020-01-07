package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new table.
  */
@js.native
trait Schema$CreateTableRequest extends js.Object {
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * The element properties for the table.  The table will be created at the
    * provided size, subject to a minimum size. If no size is provided, the
    * table will be automatically sized.  Table transforms must have a scale of
    * 1 and no shear components. If no transform is provided, the table will be
    * centered on the page.
    */
  var elementProperties: js.UndefOr[Schema$PageElementProperties] = js.native
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
}

object Schema$CreateTableRequest {
  @scala.inline
  def apply(
    columns: Int | Double = null,
    elementProperties: Schema$PageElementProperties = null,
    objectId: String = null,
    rows: Int | Double = null
  ): Schema$CreateTableRequest = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateTableRequest]
  }
}

