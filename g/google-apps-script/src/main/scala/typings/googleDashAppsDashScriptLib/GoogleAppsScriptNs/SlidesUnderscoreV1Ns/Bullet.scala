package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Describes the bullet of a paragraph.
trait Bullet extends js.Object {
  // The paragraph specific text style applied to this bullet.
  var bullet_style: TextStyle
  // The rendered bullet glyph for this paragraph.
  var glyph: java.lang.String
  // The ID of the list this paragraph belongs to.
  var list_id: java.lang.String
  // The nesting level of this paragraph in the list.
  var nesting_level: scala.Double
}

object Bullet {
  @scala.inline
  def apply(
    bullet_style: TextStyle,
    glyph: java.lang.String,
    list_id: java.lang.String,
    nesting_level: scala.Double
  ): Bullet = {
    val __obj = js.Dynamic.literal(bullet_style = bullet_style, glyph = glyph, list_id = list_id, nesting_level = nesting_level)
  
    __obj.asInstanceOf[Bullet]
  }
}

