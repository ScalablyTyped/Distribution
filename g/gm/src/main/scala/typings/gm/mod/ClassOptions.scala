package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassOptions extends StObject {
  
  var appPath: js.UndefOr[String] = js.undefined
  
  var imageMagick: js.UndefOr[String | Boolean] = js.undefined
  
  var nativeAutoOrient: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[String | Double] = js.undefined
}
object ClassOptions {
  
  inline def apply(): ClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassOptions] (val x: Self) extends AnyVal {
    
    inline def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    
    inline def setAppPathUndefined: Self = StObject.set(x, "appPath", js.undefined)
    
    inline def setImageMagick(value: String | Boolean): Self = StObject.set(x, "imageMagick", value.asInstanceOf[js.Any])
    
    inline def setImageMagickUndefined: Self = StObject.set(x, "imageMagick", js.undefined)
    
    inline def setNativeAutoOrient(value: Boolean): Self = StObject.set(x, "nativeAutoOrient", value.asInstanceOf[js.Any])
    
    inline def setNativeAutoOrientUndefined: Self = StObject.set(x, "nativeAutoOrient", js.undefined)
    
    inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
