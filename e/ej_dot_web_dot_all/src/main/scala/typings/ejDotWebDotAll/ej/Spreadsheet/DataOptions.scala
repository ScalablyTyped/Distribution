package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataOptions extends js.Object {
  /** Pass the type to update
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Pass the value to update
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Pass the value2 to update
    */
  var value2: js.UndefOr[Double] = js.undefined
}

object DataOptions {
  @scala.inline
  def apply(`type`: String = null, value: Int | Double = null, value2: Int | Double = null): DataOptions = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (value2 != null) __obj.updateDynamic("value2")(value2.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
}

