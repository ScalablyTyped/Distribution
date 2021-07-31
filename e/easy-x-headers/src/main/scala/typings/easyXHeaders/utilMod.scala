package typings.easyXHeaders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debug(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def error(param: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(param.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def format(format: js.Any, param: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(format.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(constructor.asInstanceOf[js.Any], superConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def inspect(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, options: InspectOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Boolean, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Unit, depth: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Unit, depth: Double, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def inspect(`object`: js.Any, showHidden: Unit, depth: Unit, color: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(`object`.asInstanceOf[js.Any], showHidden.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isArray(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isDate(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isError(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isRegExp(`object`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def log(string: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(string.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def print(param: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(param.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def puts(param: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("puts")(param.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait InspectOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var customInspect: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var showHidden: js.UndefOr[Boolean] = js.undefined
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
