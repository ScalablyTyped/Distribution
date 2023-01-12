package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Custom Pano Provider.
  */
trait PanoProviderOptions extends StObject {
  
  /**
    * If set, the renderer will use technologies (like webgl) that only work
    * when cors headers are appropiately set on the provided images. It is the
    * developer&#39;s task to serve the images correctly in combination with
    * this flag, which might otherwise lead to SecurityErrors.
    */
  var cors: js.UndefOr[Boolean] = js.undefined
}
object PanoProviderOptions {
  
  inline def apply(): PanoProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanoProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
  }
}
