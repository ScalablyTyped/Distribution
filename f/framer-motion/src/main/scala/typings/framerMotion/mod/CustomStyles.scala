package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomStyles extends StObject {
  
  var image: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[String | Double] = js.undefined
  
  var shadow: js.UndefOr[String] = js.undefined
  
  /**
    * Framer Library custom prop types. These are not actually supported in Motion - preferably
    * we'd have a way of external consumers injecting supported styles into this library.
    */
  var size: js.UndefOr[String | Double] = js.undefined
}
object CustomStyles {
  
  inline def apply(): CustomStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomStyles] (val x: Self) extends AnyVal {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setRadius(value: String | Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setShadow(value: String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
