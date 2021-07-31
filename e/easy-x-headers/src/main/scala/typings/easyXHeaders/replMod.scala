package typings.easyXHeaders

import typings.easyXHeaders.NodeJS.ReadableStream
import typings.easyXHeaders.NodeJS.WritableStream
import typings.easyXHeaders.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replMod {
  
  @JSImport("repl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def start(options: ReplOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  trait ReplOptions extends StObject {
    
    var eval: js.UndefOr[js.Function] = js.undefined
    
    var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
    
    var input: js.UndefOr[ReadableStream] = js.undefined
    
    var output: js.UndefOr[WritableStream] = js.undefined
    
    var prompt: js.UndefOr[String] = js.undefined
    
    var terminal: js.UndefOr[Boolean] = js.undefined
    
    var useColors: js.UndefOr[Boolean] = js.undefined
    
    var useGlobal: js.UndefOr[Boolean] = js.undefined
    
    var writer: js.UndefOr[js.Function] = js.undefined
  }
  object ReplOptions {
    
    @scala.inline
    def apply(): ReplOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplOptions]
    }
    
    @scala.inline
    implicit class ReplOptionsMutableBuilder[Self <: ReplOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEval(value: js.Function): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
      
      @scala.inline
      def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
      
      @scala.inline
      def setUseColors(value: Boolean): Self = StObject.set(x, "useColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseColorsUndefined: Self = StObject.set(x, "useColors", js.undefined)
      
      @scala.inline
      def setUseGlobal(value: Boolean): Self = StObject.set(x, "useGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseGlobalUndefined: Self = StObject.set(x, "useGlobal", js.undefined)
      
      @scala.inline
      def setWriter(value: js.Function): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriterUndefined: Self = StObject.set(x, "writer", js.undefined)
    }
  }
}
