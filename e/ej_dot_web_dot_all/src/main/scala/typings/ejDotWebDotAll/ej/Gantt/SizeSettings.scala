package typings.ejDotWebDotAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSettings extends js.Object {
  /** Specifies the height of Gantt control
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the width of Gantt control
    */
  var width: js.UndefOr[String] = js.undefined
}

object SizeSettings {
  @scala.inline
  def apply(height: String = null, width: String = null): SizeSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSettings]
  }
}

