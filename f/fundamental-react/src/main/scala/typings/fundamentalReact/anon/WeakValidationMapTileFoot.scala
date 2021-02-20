package typings.fundamentalReact.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> */
@js.native
trait WeakValidationMapTileFoot extends StObject {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapTileFoot {
  
  @scala.inline
  def apply(): WeakValidationMapTileFoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTileFoot]
  }
  
  @scala.inline
  implicit class WeakValidationMapTileFootMutableBuilder[Self <: WeakValidationMapTileFoot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
