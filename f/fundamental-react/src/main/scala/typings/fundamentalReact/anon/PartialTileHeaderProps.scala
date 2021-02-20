package typings.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> */
@js.native
trait PartialTileHeaderProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
}
object PartialTileHeaderProps {
  
  @scala.inline
  def apply(): PartialTileHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTileHeaderProps]
  }
  
  @scala.inline
  implicit class PartialTileHeaderPropsMutableBuilder[Self <: PartialTileHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
  }
}
