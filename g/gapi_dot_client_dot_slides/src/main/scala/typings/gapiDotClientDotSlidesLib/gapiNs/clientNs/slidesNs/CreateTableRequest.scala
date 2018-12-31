package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableRequest extends js.Object {
  /** Number of columns in the table. */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /**
    * The element properties for the table.
    *
    * The table will be created at the provided size, subject to a minimum size.
    * If no size is provided, the table will be automatically sized.
    *
    * Table transforms must have a scale of 1 and no shear components. If no
    * transform is provided, the table will be centered on the page.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  /**
    * A user-supplied object ID.
    *
    * If you specify an ID, it must be unique among all pages and page elements
    * in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters
    * may include those as well as a hyphen or colon (matches regex
    * `[a-zA-Z0-9_-:]`).
    * The length of the ID must not be less than 5 or greater than 50.
    *
    * If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /** Number of rows in the table. */
  var rows: js.UndefOr[scala.Double] = js.undefined
}

