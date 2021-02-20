package typings.eyes

import typings.eyes.anon.All
import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eyes", "inspect")
  @js.native
  def inspect(thing: js.Any): Unit = js.native
  @JSImport("eyes", "inspect")
  @js.native
  def inspect(thing: js.Any, label: String): Unit = js.native
  
  @JSImport("eyes", "inspector")
  @js.native
  def inspector(): InspectorFunction = js.native
  @JSImport("eyes", "inspector")
  @js.native
  def inspector(options: EyesOptions): InspectorFunction = js.native
  
  @js.native
  trait EyesOptions extends StObject {
    
    /** Don't output functions at all */
    var hideFunctions: js.UndefOr[Boolean] = js.native
    
    /** Truncate output if longer */
    var maxLength: js.UndefOr[Double] = js.native
    
    /** Indent object literals */
    var pretty: js.UndefOr[Boolean] = js.native
    
    /** Stream to write to, or null */
    var stream: js.UndefOr[WritableStream] = js.native
    
    /** Styles applied to stdout */
    var styles: js.UndefOr[All] = js.native
  }
  object EyesOptions {
    
    @scala.inline
    def apply(): EyesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EyesOptions]
    }
    
    @scala.inline
    implicit class EyesOptionsMutableBuilder[Self <: EyesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideFunctions(value: Boolean): Self = StObject.set(x, "hideFunctions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideFunctionsUndefined: Self = StObject.set(x, "hideFunctions", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setStyles(value: All): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type InspectorFunction = js.Function2[/* thing */ js.Any, /* label */ js.UndefOr[String], String]
}
