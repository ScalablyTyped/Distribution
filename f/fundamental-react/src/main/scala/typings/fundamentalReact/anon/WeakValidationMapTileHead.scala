package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> */
@js.native
trait WeakValidationMapTileHead extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var subtitle: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapTileHead {
  
  @scala.inline
  def apply(): WeakValidationMapTileHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileHead]
  }
  
  @scala.inline
  implicit class WeakValidationMapTileHeadMutableBuilder[Self <: WeakValidationMapTileHead] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setSubtitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
  }
}
