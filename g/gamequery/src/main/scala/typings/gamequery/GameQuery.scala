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
    val __obj = js.Dynamic.literal(ANIMATION_CALLBACK = ANIMATION_CALLBACK.asInstanceOf[js.Any], ANIMATION_HORIZONTAL = ANIMATION_HORIZONTAL.asInstanceOf[js.Any], ANIMATION_MULTI = ANIMATION_MULTI.asInstanceOf[js.Any], ANIMATION_ONCE = ANIMATION_ONCE.asInstanceOf[js.Any], ANIMATION_PINGPONG = ANIMATION_PINGPONG.asInstanceOf[js.Any], ANIMATION_VERTICAL = ANIMATION_VERTICAL.asInstanceOf[js.Any], Animation = Animation.asInstanceOf[js.Any], groupCssClass = groupCssClass.asInstanceOf[js.Any], keyTracker = keyTracker.asInstanceOf[js.Any], spriteCssClass = spriteCssClass.asInstanceOf[js.Any], tileCssClass = tileCssClass.asInstanceOf[js.Any], tileIdPrefix = tileIdPrefix.asInstanceOf[js.Any], tileTypePrefix = tileTypePrefix.asInstanceOf[js.Any], tilemapCssClass = tilemapCssClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameQuery]
  }
}

