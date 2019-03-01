package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelStyle extends js.Object {
  var color: java.lang.String
  var fontName: java.lang.String
  var fontSize: java.lang.String
}

object LabelStyle {
  @scala.inline
  def apply(color: java.lang.String, fontName: java.lang.String, fontSize: java.lang.String): LabelStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("fontName")(fontName)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.asInstanceOf[LabelStyle]
  }
}

