package typings.fundamentalReact.anon

import typings.fundamentalReact.fundamentalReactStrings.s
import typings.react.mod.Validator
import typings.std.HTMLButtonElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> */
trait WeakValidationMapTileProp extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  
  var isDouble: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  
  var onClick: js.UndefOr[
    Validator[
      js.UndefOr[
        (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
      ]
    ]
  ] = js.undefined
  
  var size: js.UndefOr[Validator[js.UndefOr[s | Null]]] = js.undefined
}
object WeakValidationMapTileProp {
  
  inline def apply(): WeakValidationMapTileProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileProp]
  }
  
  extension [Self <: WeakValidationMapTileProp](x: Self) {
    
    inline def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsDouble(value: Validator[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "isDouble", value.asInstanceOf[js.Any])
    
    inline def setIsDoubleUndefined: Self = StObject.set(x, "isDouble", js.undefined)
    
    inline def setOnClick(
      value: Validator[
          js.UndefOr[
            (js.Function1[/* event */ typings.react.mod.MouseEvent[HTMLButtonElement, MouseEvent], Unit]) | Null
          ]
        ]
    ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setSize(value: Validator[js.UndefOr[s | Null]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
