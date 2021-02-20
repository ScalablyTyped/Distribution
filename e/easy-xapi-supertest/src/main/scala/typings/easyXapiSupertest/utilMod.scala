package typings.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", "debug")
  @js.native
  def debug(string: String): Unit = js.native
  
  @JSImport("util", "error")
  @js.native
  def error(param: js.Any*): Unit = js.native
  
  @JSImport("util", "format")
  @js.native
  def format(format: js.Any, param: js.Any*): String = js.native
  
  @JSImport("util", "inherits")
  @js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, options: InspectOptions): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(
    `object`: js.Any,
    showHidden: js.UndefOr[scala.Nothing],
    depth: js.UndefOr[scala.Nothing],
    color: Boolean
  ): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: js.UndefOr[scala.Nothing], depth: Double, color: Boolean): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: Boolean): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: js.UndefOr[scala.Nothing], color: Boolean): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double): String = js.native
  @JSImport("util", "inspect")
  @js.native
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): String = js.native
  
  @JSImport("util", "isArray")
  @js.native
  def isArray(`object`: js.Any): Boolean = js.native
  
  @JSImport("util", "isDate")
  @js.native
  def isDate(`object`: js.Any): Boolean = js.native
  
  @JSImport("util", "isError")
  @js.native
  def isError(`object`: js.Any): Boolean = js.native
  
  @JSImport("util", "isRegExp")
  @js.native
  def isRegExp(`object`: js.Any): Boolean = js.native
  
  @JSImport("util", "log")
  @js.native
  def log(string: String): Unit = js.native
  
  @JSImport("util", "print")
  @js.native
  def print(param: js.Any*): Unit = js.native
  
  @JSImport("util", "puts")
  @js.native
  def puts(param: js.Any*): Unit = js.native
  
  @js.native
  trait InspectOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.native
    
    var customInspect: js.UndefOr[Boolean] = js.native
    
    var depth: js.UndefOr[Double] = js.native
    
    var showHidden: js.UndefOr[Boolean] = js.native
  }
  object InspectOptions {
    
    @scala.inline
    def apply(): InspectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InspectOptions]
    }
    
    @scala.inline
    implicit class InspectOptionsMutableBuilder[Self <: InspectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setCustomInspect(value: Boolean): Self = StObject.set(x, "customInspect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInspectUndefined: Self = StObject.set(x, "customInspect", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    }
  }
}
