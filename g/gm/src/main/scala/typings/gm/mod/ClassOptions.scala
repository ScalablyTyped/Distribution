package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassOptions extends StObject {
  
  var appPath: js.UndefOr[String] = js.undefined
  
  var imageMagick: js.UndefOr[Boolean] = js.undefined
  
  var nativeAutoOrient: js.UndefOr[Boolean] = js.undefined
}
object ClassOptions {
  
  @scala.inline
  def apply(): ClassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassOptions]
  }
  
  @scala.inline
  implicit class ClassOptionsMutableBuilder[Self <: ClassOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppPath(value: String): Self = StObject.set(x, "appPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppPathUndefined: Self = StObject.set(x, "appPath", js.undefined)
    
    @scala.inline
    def setImageMagick(value: Boolean): Self = StObject.set(x, "imageMagick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageMagickUndefined: Self = StObject.set(x, "imageMagick", js.undefined)
    
    @scala.inline
    def setNativeAutoOrient(value: Boolean): Self = StObject.set(x, "nativeAutoOrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeAutoOrientUndefined: Self = StObject.set(x, "nativeAutoOrient", js.undefined)
  }
}
