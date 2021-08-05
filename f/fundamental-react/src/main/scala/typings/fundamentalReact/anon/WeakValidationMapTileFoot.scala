package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> */
trait WeakValidationMapTileFoot extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
}
object WeakValidationMapTileFoot {
  
  inline def apply(): WeakValidationMapTileFoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileFoot]
  }
  
  extension [Self <: WeakValidationMapTileFoot](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
