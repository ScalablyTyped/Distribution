package typings.fundamentalReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.fundamentalReactStrings.circle
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("fundamental-react/lib/Image/Image", JSImport.Default)
  @js.native
  val default: FunctionComponent[ImageProps] = js.native
  
  @js.native
  trait ImageProps
    extends /* x */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var disableStyles: js.UndefOr[Boolean] = js.native
    
    var photo: String = js.native
    
    var size: imageSize = js.native
    
    var `type`: js.UndefOr[imageType] = js.native
  }
  object ImageProps {
    
    @scala.inline
    def apply(photo: String, size: imageSize): ImageProps = {
      val __obj = js.Dynamic.literal(photo = photo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageProps]
    }
    
    @scala.inline
    implicit class ImagePropsMutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      @scala.inline
      def setPhoto(value: String): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: imageSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: imageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: FunctionComponent[ImageProps] = default
  
  /* Rewritten from type alias, can be one of: 
    - typings.fundamentalReact.fundamentalReactStrings.s
    - typings.fundamentalReact.fundamentalReactStrings.m
    - typings.fundamentalReact.fundamentalReactStrings.l
  */
  trait imageSize extends StObject
  object imageSize {
    
    @scala.inline
    def l: typings.fundamentalReact.fundamentalReactStrings.l = "l".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.l]
    
    @scala.inline
    def m: typings.fundamentalReact.fundamentalReactStrings.m = "m".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.m]
    
    @scala.inline
    def s: typings.fundamentalReact.fundamentalReactStrings.s = "s".asInstanceOf[typings.fundamentalReact.fundamentalReactStrings.s]
  }
  
  type imageType = circle
}
