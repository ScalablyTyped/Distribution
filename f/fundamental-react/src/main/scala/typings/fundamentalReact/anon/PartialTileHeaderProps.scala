package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> */
trait PartialTileHeaderProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
}
object PartialTileHeaderProps {
  
  inline def apply(): PartialTileHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTileHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
  }
}
