package typings.forgeViewer.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshPhysicalMaterialParameters
  extends StObject
     with MeshStandardMaterialParameters {
  
  var clearCoat: js.UndefOr[Double] = js.undefined
  
  var clearCoatRoughness: js.UndefOr[Double] = js.undefined
  
  var reflectivity: js.UndefOr[Double] = js.undefined
}
object MeshPhysicalMaterialParameters {
  
  inline def apply(): MeshPhysicalMaterialParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshPhysicalMaterialParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshPhysicalMaterialParameters] (val x: Self) extends AnyVal {
    
    inline def setClearCoat(value: Double): Self = StObject.set(x, "clearCoat", value.asInstanceOf[js.Any])
    
    inline def setClearCoatRoughness(value: Double): Self = StObject.set(x, "clearCoatRoughness", value.asInstanceOf[js.Any])
    
    inline def setClearCoatRoughnessUndefined: Self = StObject.set(x, "clearCoatRoughness", js.undefined)
    
    inline def setClearCoatUndefined: Self = StObject.set(x, "clearCoat", js.undefined)
    
    inline def setReflectivity(value: Double): Self = StObject.set(x, "reflectivity", value.asInstanceOf[js.Any])
    
    inline def setReflectivityUndefined: Self = StObject.set(x, "reflectivity", js.undefined)
  }
}
