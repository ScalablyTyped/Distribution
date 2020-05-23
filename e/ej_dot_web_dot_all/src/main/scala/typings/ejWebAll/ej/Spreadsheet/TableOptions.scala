package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  /** Pass the format name of table
    */
  var formatName: js.UndefOr[String] = js.undefined
  /** Pass the header boolean condition of table
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /** Pass the name of the table
    */
  var name: js.UndefOr[String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(formatName: String = null, header: js.UndefOr[Boolean] = js.undefined, name: String = null): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (formatName != null) __obj.updateDynamic("formatName")(formatName.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

