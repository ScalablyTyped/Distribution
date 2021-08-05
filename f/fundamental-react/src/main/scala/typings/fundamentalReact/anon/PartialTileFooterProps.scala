package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> */
trait PartialTileFooterProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object PartialTileFooterProps {
  
  inline def apply(): PartialTileFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileFooterProps]
  }
  
  extension [Self <: PartialTileFooterProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
