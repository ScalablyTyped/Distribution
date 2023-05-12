package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTransformAttributes extends StObject {
  
  var attrScale: js.UndefOr[Double] = js.undefined
  
  var attrX: js.UndefOr[Double] = js.undefined
  
  var attrY: js.UndefOr[Double] = js.undefined
}
object SVGTransformAttributes {
  
  inline def apply(): SVGTransformAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGTransformAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGTransformAttributes] (val x: Self) extends AnyVal {
    
    inline def setAttrScale(value: Double): Self = StObject.set(x, "attrScale", value.asInstanceOf[js.Any])
    
    inline def setAttrScaleUndefined: Self = StObject.set(x, "attrScale", js.undefined)
    
    inline def setAttrX(value: Double): Self = StObject.set(x, "attrX", value.asInstanceOf[js.Any])
    
    inline def setAttrXUndefined: Self = StObject.set(x, "attrX", js.undefined)
    
    inline def setAttrY(value: Double): Self = StObject.set(x, "attrY", value.asInstanceOf[js.Any])
    
    inline def setAttrYUndefined: Self = StObject.set(x, "attrY", js.undefined)
  }
}
