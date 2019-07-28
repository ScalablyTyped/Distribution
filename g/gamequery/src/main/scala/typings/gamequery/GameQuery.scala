package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameQuery extends js.Object {
  var ANIMATION_CALLBACK: Double
  var ANIMATION_HORIZONTAL: Double
  var ANIMATION_MULTI: Double
  var ANIMATION_ONCE: Double
  var ANIMATION_PINGPONG: Double
  var ANIMATION_VERTICAL: Double
  var Animation: typings.gamequery.Animation
  var groupCssClass: String
  var keyTracker: js.Array[Boolean]
  var spriteCssClass: String
  var tileCssClass: String
  var tileIdPrefix: String
  var tileTypePrefix: String
  var tilemapCssClass: String
}

object GameQuery {
  @scala.inline
  def apply(
    ANIMATION_CALLBACK: Double,
    ANIMATION_HORIZONTAL: Double,
    ANIMATION_MULTI: Double,
    ANIMATION_ONCE: Double,
    ANIMATION_PINGPONG: Double,
    ANIMATION_VERTICAL: Double,
    Animation: Animation,
    groupCssClass: String,
    keyTracker: js.Array[Boolean],
    spriteCssClass: String,
    tileCssClass: String,
    tileIdPrefix: String,
    tileTypePrefix: String,
    tilemapCssClass: String
  ): GameQuery = {
    val __obj = js.Dynamic.literal(ANIMATION_CALLBACK = ANIMATION_CALLBACK, ANIMATION_HORIZONTAL = ANIMATION_HORIZONTAL, ANIMATION_MULTI = ANIMATION_MULTI, ANIMATION_ONCE = ANIMATION_ONCE, ANIMATION_PINGPONG = ANIMATION_PINGPONG, ANIMATION_VERTICAL = ANIMATION_VERTICAL, Animation = Animation, groupCssClass = groupCssClass, keyTracker = keyTracker, spriteCssClass = spriteCssClass, tileCssClass = tileCssClass, tileIdPrefix = tileIdPrefix, tileTypePrefix = tileTypePrefix, tilemapCssClass = tilemapCssClass)
  
    __obj.asInstanceOf[GameQuery]
  }
}

