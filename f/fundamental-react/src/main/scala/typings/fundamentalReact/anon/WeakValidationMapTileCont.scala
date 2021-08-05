package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
trait WeakValidationMapTileCont extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var twoColumns: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}
object WeakValidationMapTileCont {
  
  inline def apply(): WeakValidationMapTileCont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileCont]
  }
  
  extension [Self <: WeakValidationMapTileCont](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTwoColumns(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
  }
}
