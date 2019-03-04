package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Contains properties describing the look and feel of a list bullet at a given
// level of nesting.
trait NestingLevel extends js.Object {
  // The style of a bullet at this level of nesting.
  var bullet_style: TextStyle
}

object NestingLevel {
  @scala.inline
  def apply(bullet_style: TextStyle): NestingLevel = {
    val __obj = js.Dynamic.literal(bullet_style = bullet_style)
  
    __obj.asInstanceOf[NestingLevel]
  }
}

