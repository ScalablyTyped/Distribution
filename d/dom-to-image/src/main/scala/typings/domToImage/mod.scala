package typings.domToImage

import org.scalablytyped.runtime.Shortcut
import typings.std.Blob
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dom-to-image", JSImport.Default)
  @js.native
  val default: typings.domToImage.mod.DomToImage = js.native
  
  @js.native
  trait DomToImage extends StObject {
    
    def toBlob(node: Node): js.Promise[Blob] = js.native
    def toBlob(node: Node, options: Options): js.Promise[Blob] = js.native
    
    def toJpeg(node: Node): js.Promise[String] = js.native
    def toJpeg(node: Node, options: Options): js.Promise[String] = js.native
    
    def toPixelData(node: Node): js.Promise[String] = js.native
    def toPixelData(node: Node, options: Options): js.Promise[String] = js.native
    
    def toPng(node: Node): js.Promise[String] = js.native
    def toPng(node: Node, options: Options): js.Promise[String] = js.native
    
    def toSvg(node: Node): js.Promise[String] = js.native
    def toSvg(node: Node, options: Options): js.Promise[String] = js.native
  }
  @JSImport("dom-to-image", "DomToImage")
  @js.native
  val DomToImage: typings.domToImage.mod.DomToImage = js.native
  
  object global {
    
    object DomToImage extends Shortcut {
      
      @JSGlobal("DomToImage")
      @js.native
      val ^ : typings.domToImage.mod.global.DomToImage.DomToImage = js.native
      type DomToImage = DomToImage_
      
      type Options = Options_
      
      type _To = typings.domToImage.mod.global.DomToImage.DomToImage
      
      /* This means you don't have to write `^`, but can instead just say `DomToImage.foo` */
      override def _to: typings.domToImage.mod.global.DomToImage.DomToImage = ^
    }
  }
  
  type DomToImage_ = typings.domToImage.mod.DomToImage
  
  @js.native
  trait Options extends StObject {
    
    var bgcolor: js.UndefOr[String] = js.native
    
    var cacheBust: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var imagePlaceholder: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      @scala.inline
      def setCacheBust(value: Boolean): Self = StObject.set(x, "cacheBust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheBustUndefined: Self = StObject.set(x, "cacheBust", js.undefined)
      
      @scala.inline
      def setFilter(value: /* node */ Node => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImagePlaceholder(value: String): Self = StObject.set(x, "imagePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePlaceholderUndefined: Self = StObject.set(x, "imagePlaceholder", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type Options_ = Options
  
  type _To = typings.domToImage.mod.DomToImage
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typings.domToImage.mod.DomToImage = default
}
