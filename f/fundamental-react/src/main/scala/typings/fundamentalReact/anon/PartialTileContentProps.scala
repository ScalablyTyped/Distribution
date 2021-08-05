package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> */
trait PartialTileContentProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var twoColumns: js.UndefOr[Boolean] = js.undefined
}
object PartialTileContentProps {
  
  inline def apply(): PartialTileContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileContentProps]
  }
  
  extension [Self <: PartialTileContentProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTwoColumns(value: Boolean): Self = StObject.set(x, "twoColumns", value.asInstanceOf[js.Any])
    
    inline def setTwoColumnsUndefined: Self = StObject.set(x, "twoColumns", js.undefined)
  }
}
