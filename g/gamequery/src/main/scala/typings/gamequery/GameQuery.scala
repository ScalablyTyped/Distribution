package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameQuery extends js.Object {
  var ANIMATION_CALLBACK: Double = js.native
  var ANIMATION_HORIZONTAL: Double = js.native
  var ANIMATION_MULTI: Double = js.native
  var ANIMATION_ONCE: Double = js.native
  var ANIMATION_PINGPONG: Double = js.native
  var ANIMATION_VERTICAL: Double = js.native
  var Animation: typings.gamequery.Animation = js.native
  var groupCssClass: String = js.native
  var keyTracker: js.Array[Boolean] = js.native
  var spriteCssClass: String = js.native
  var tileCssClass: String = js.native
  var tileIdPrefix: String = js.native
  var tileTypePrefix: String = js.native
  var tilemapCssClass: String = js.native
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
  @scala.inline
  implicit class GameQueryOps[Self <: GameQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setANIMATION_CALLBACK(value: Double): Self = this.set("ANIMATION_CALLBACK", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATION_HORIZONTAL(value: Double): Self = this.set("ANIMATION_HORIZONTAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATION_MULTI(value: Double): Self = this.set("ANIMATION_MULTI", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATION_ONCE(value: Double): Self = this.set("ANIMATION_ONCE", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATION_PINGPONG(value: Double): Self = this.set("ANIMATION_PINGPONG", value.asInstanceOf[js.Any])
    @scala.inline
    def setANIMATION_VERTICAL(value: Double): Self = this.set("ANIMATION_VERTICAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("Animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupCssClass(value: String): Self = this.set("groupCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyTrackerVarargs(value: Boolean*): Self = this.set("keyTracker", js.Array(value :_*))
    @scala.inline
    def setKeyTracker(value: js.Array[Boolean]): Self = this.set("keyTracker", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpriteCssClass(value: String): Self = this.set("spriteCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileCssClass(value: String): Self = this.set("tileCssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileIdPrefix(value: String): Self = this.set("tileIdPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileTypePrefix(value: String): Self = this.set("tileTypePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setTilemapCssClass(value: String): Self = this.set("tilemapCssClass", value.asInstanceOf[js.Any])
  }
  
}

