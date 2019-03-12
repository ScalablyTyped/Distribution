package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameQuery extends js.Object {
  var ANIMATION_CALLBACK: scala.Double
  var ANIMATION_HORIZONTAL: scala.Double
  var ANIMATION_MULTI: scala.Double
  var ANIMATION_ONCE: scala.Double
  var ANIMATION_PINGPONG: scala.Double
  var ANIMATION_VERTICAL: scala.Double
  var Animation: gamequeryLib.Animation
  var groupCssClass: java.lang.String
  var keyTracker: js.Array[scala.Boolean]
  var spriteCssClass: java.lang.String
  var tileCssClass: java.lang.String
  var tileIdPrefix: java.lang.String
  var tileTypePrefix: java.lang.String
  var tilemapCssClass: java.lang.String
}

object GameQuery {
  @scala.inline
  def apply(
    ANIMATION_CALLBACK: scala.Double,
    ANIMATION_HORIZONTAL: scala.Double,
    ANIMATION_MULTI: scala.Double,
    ANIMATION_ONCE: scala.Double,
    ANIMATION_PINGPONG: scala.Double,
    ANIMATION_VERTICAL: scala.Double,
    Animation: Animation,
    groupCssClass: java.lang.String,
    keyTracker: js.Array[scala.Boolean],
    spriteCssClass: java.lang.String,
    tileCssClass: java.lang.String,
    tileIdPrefix: java.lang.String,
    tileTypePrefix: java.lang.String,
    tilemapCssClass: java.lang.String
  ): GameQuery = {
    val __obj = js.Dynamic.literal(ANIMATION_CALLBACK = ANIMATION_CALLBACK, ANIMATION_HORIZONTAL = ANIMATION_HORIZONTAL, ANIMATION_MULTI = ANIMATION_MULTI, ANIMATION_ONCE = ANIMATION_ONCE, ANIMATION_PINGPONG = ANIMATION_PINGPONG, ANIMATION_VERTICAL = ANIMATION_VERTICAL, Animation = Animation, groupCssClass = groupCssClass, keyTracker = keyTracker, spriteCssClass = spriteCssClass, tileCssClass = tileCssClass, tileIdPrefix = tileIdPrefix, tileTypePrefix = tileTypePrefix, tilemapCssClass = tilemapCssClass)
  
    __obj.asInstanceOf[GameQuery]
  }
}

