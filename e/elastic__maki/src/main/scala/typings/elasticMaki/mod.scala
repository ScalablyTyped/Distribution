package typings.elasticMaki

import org.scalablytyped.runtime.StringDictionary
import typings.elasticMaki.anon.All
import typings.elasticMaki.anon.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@elastic/maki", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** bject that can be used to organize and display icons in your app or website */
  @JSImport("@elastic/maki", "layouts")
  @js.native
  def layouts: All = js.native
  @scala.inline
  def layouts_=(x: All): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layouts")(x.asInstanceOf[js.Any])
  
  @JSImport("@elastic/maki", "spritesheet")
  @js.native
  def spritesheet: `1` = js.native
  @scala.inline
  def spritesheet_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spritesheet")(x.asInstanceOf[js.Any])
  
  @JSImport("@elastic/maki", "svgArray")
  @js.native
  def svgArray: js.Array[SvgContent] = js.native
  @scala.inline
  def svgArray_=(x: js.Array[SvgContent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("svgArray")(x.asInstanceOf[js.Any])
  
  type IconName = String
  
  @js.native
  trait Sprite extends StObject {
    
    var height: Double = js.native
    
    var pixelRation: Double = js.native
    
    var sdf: Boolean = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Sprite {
    
    @scala.inline
    def apply(height: Double, pixelRation: Double, sdf: Boolean, width: Double, x: Double, y: Double): Sprite = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pixelRation = pixelRation.asInstanceOf[js.Any], sdf = sdf.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sprite]
    }
    
    @scala.inline
    implicit class SpriteMutableBuilder[Self <: Sprite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRation(value: Double): Self = StObject.set(x, "pixelRation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdf(value: Boolean): Self = StObject.set(x, "sdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type SpriteSheet = StringDictionary[Sprite]
  
  type SvgContent = String
}
