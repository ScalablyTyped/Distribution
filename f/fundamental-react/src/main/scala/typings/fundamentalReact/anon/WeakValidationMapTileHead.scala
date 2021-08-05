package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> */
trait WeakValidationMapTileHead extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var subtitle: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}
object WeakValidationMapTileHead {
  
  inline def apply(): WeakValidationMapTileHead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileHead]
  }
  
  extension [Self <: WeakValidationMapTileHead](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setSubtitle(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
  }
}
