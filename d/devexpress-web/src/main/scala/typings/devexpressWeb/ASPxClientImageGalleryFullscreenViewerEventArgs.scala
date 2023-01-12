package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
  */
trait ASPxClientImageGalleryFullscreenViewerEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double
  
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String
}
object ASPxClientImageGalleryFullscreenViewerEventArgs {
  
  inline def apply(index: Double, name: String): ASPxClientImageGalleryFullscreenViewerEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageGalleryFullscreenViewerEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientImageGalleryFullscreenViewerEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
