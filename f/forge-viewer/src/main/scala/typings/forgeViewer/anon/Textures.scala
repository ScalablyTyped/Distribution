package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Textures extends StObject {
  
  var geometries: Double
  
  var textures: Double
}
object Textures {
  
  inline def apply(geometries: Double, textures: Double): Textures = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textures]
  }
  
  extension [Self <: Textures](x: Self) {
    
    inline def setGeometries(value: Double): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setTextures(value: Double): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
  }
}
