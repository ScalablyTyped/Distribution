package typings.eyes

import typings.eyes.anon.All
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eyes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inspect(thing: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(thing.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def inspect(thing: Any, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inspect")(thing.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inspector(): InspectorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("inspector")().asInstanceOf[InspectorFunction]
  inline def inspector(options: EyesOptions): InspectorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("inspector")(options.asInstanceOf[js.Any]).asInstanceOf[InspectorFunction]
  
  trait EyesOptions extends StObject {
    
    /** Don't output functions at all */
    var hideFunctions: js.UndefOr[Boolean] = js.undefined
    
    /** Truncate output if longer */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /** Indent object literals */
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /** Stream to write to, or null */
    var stream: js.UndefOr[WritableStream] = js.undefined
    
    /** Styles applied to stdout */
    var styles: js.UndefOr[All] = js.undefined
  }
  object EyesOptions {
    
    inline def apply(): EyesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EyesOptions]
    }
    
    extension [Self <: EyesOptions](x: Self) {
      
      inline def setHideFunctions(value: Boolean): Self = StObject.set(x, "hideFunctions", value.asInstanceOf[js.Any])
      
      inline def setHideFunctionsUndefined: Self = StObject.set(x, "hideFunctions", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStyles(value: All): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type InspectorFunction = js.Function2[/* thing */ Any, /* label */ js.UndefOr[String], String]
}
