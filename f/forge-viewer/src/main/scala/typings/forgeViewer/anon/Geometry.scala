package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  var geometry: js.UndefOr[Boolean] = js.undefined
  
  var onlyModels: js.UndefOr[Boolean] = js.undefined
  
  var propDb: js.UndefOr[Boolean] = js.undefined
  
  var textures: js.UndefOr[Boolean] = js.undefined
}
object Geometry {
  
  inline def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  
  extension [Self <: Geometry](x: Self) {
    
    inline def setGeometry(value: Boolean): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setOnlyModels(value: Boolean): Self = StObject.set(x, "onlyModels", value.asInstanceOf[js.Any])
    
    inline def setOnlyModelsUndefined: Self = StObject.set(x, "onlyModels", js.undefined)
    
    inline def setPropDb(value: Boolean): Self = StObject.set(x, "propDb", value.asInstanceOf[js.Any])
    
    inline def setPropDbUndefined: Self = StObject.set(x, "propDb", js.undefined)
    
    inline def setTextures(value: Boolean): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    inline def setTexturesUndefined: Self = StObject.set(x, "textures", js.undefined)
  }
}
