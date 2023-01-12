package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtlasHeight extends StObject {
  
  var atlasHeight: Double
  
  var atlasWidth: Double
}
object AtlasHeight {
  
  inline def apply(atlasHeight: Double, atlasWidth: Double): AtlasHeight = {
    val __obj = js.Dynamic.literal(atlasHeight = atlasHeight.asInstanceOf[js.Any], atlasWidth = atlasWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlasHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtlasHeight] (val x: Self) extends AnyVal {
    
    inline def setAtlasHeight(value: Double): Self = StObject.set(x, "atlasHeight", value.asInstanceOf[js.Any])
    
    inline def setAtlasWidth(value: Double): Self = StObject.set(x, "atlasWidth", value.asInstanceOf[js.Any])
  }
}
