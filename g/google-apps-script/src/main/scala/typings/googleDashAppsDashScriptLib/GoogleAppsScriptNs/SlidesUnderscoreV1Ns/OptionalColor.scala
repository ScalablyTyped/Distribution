package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalColor extends js.Object {
  // If set, this will be used as an opaque color. If unset, this represents
  // a transparent color.
  var opaque_color: OpaqueColor
}

object OptionalColor {
  @scala.inline
  def apply(opaque_color: OpaqueColor): OptionalColor = {
    val __obj = js.Dynamic.literal(opaque_color = opaque_color)
  
    __obj.asInstanceOf[OptionalColor]
  }
}

