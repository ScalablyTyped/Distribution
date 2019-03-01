package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  // The properties of the line.
  var line_properties: LineProperties
  // The type of the line.
  var line_type: LineType
}

object Line {
  @scala.inline
  def apply(line_properties: LineProperties, line_type: LineType): Line = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line_properties")(line_properties)
    __obj.updateDynamic("line_type")(line_type)
    __obj.asInstanceOf[Line]
  }
}

