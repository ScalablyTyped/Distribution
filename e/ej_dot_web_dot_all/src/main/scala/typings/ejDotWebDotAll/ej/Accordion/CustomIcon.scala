package typings.ejDotWebDotAll.ej.Accordion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomIcon extends js.Object {
  /** This class name set to collapsing header.
    */
  var header: js.UndefOr[String] = js.undefined
  /** This class name set to expanded (active) header.
    */
  var selectedHeader: js.UndefOr[String] = js.undefined
}

object CustomIcon {
  @scala.inline
  def apply(header: String = null, selectedHeader: String = null): CustomIcon = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (selectedHeader != null) __obj.updateDynamic("selectedHeader")(selectedHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomIcon]
  }
}

