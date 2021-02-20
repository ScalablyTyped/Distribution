package typings.gamequery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameQuery extends StObject {
  
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
  implicit class GameQueryMutableBuilder[Self <: GameQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setANIMATION_CALLBACK(value: Double): Self = StObject.set(x, "ANIMATION_CALLBACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANIMATION_HORIZONTAL(value: Double): Self = StObject.set(x, "ANIMATION_HORIZONTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANIMATION_MULTI(value: Double): Self = StObject.set(x, "ANIMATION_MULTI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANIMATION_ONCE(value: Double): Self = StObject.set(x, "ANIMATION_ONCE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANIMATION_PINGPONG(value: Double): Self = StObject.set(x, "ANIMATION_PINGPONG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setANIMATION_VERTICAL(value: Double): Self = StObject.set(x, "ANIMATION_VERTICAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "Animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCssClass(value: String): Self = StObject.set(x, "groupCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTracker(value: js.Array[Boolean]): Self = StObject.set(x, "keyTracker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTrackerVarargs(value: Boolean*): Self = StObject.set(x, "keyTracker", js.Array(value :_*))
    
    @scala.inline
    def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileCssClass(value: String): Self = StObject.set(x, "tileCssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileIdPrefix(value: String): Self = StObject.set(x, "tileIdPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileTypePrefix(value: String): Self = StObject.set(x, "tileTypePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilemapCssClass(value: String): Self = StObject.set(x, "tilemapCssClass", value.asInstanceOf[js.Any])
  }
}
