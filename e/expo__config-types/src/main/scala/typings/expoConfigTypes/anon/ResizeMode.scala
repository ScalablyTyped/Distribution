package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.expoConfigTypes.expoConfigTypesStrings.contain
import typings.expoConfigTypes.expoConfigTypesStrings.cover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeMode
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Color to fill the loading screen background
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Local path or remote URL to an image to fill the background of the loading screen. Image size and aspect ratio are up to you. Must be a .png.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * Determines how the `image` will be displayed in the splash loading screen. Must be one of `cover` or `contain`, defaults to `contain`.
    */
  var resizeMode: js.UndefOr[cover | contain] = js.undefined
}
object ResizeMode {
  
  inline def apply(): ResizeMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResizeMode] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setResizeMode(value: cover | contain): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
  }
}
