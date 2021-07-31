package typings.easyXapiSupertest

import typings.easyXapiSupertest.NodeJS.ReadableStream
import typings.easyXapiSupertest.NodeJS.WritableStream
import typings.easyXapiSupertest.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readlineMod {
  
  @JSImport("readline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createInterface(options: ReadLineOptions): ReadLine = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterface")(options.asInstanceOf[js.Any]).asInstanceOf[ReadLine]
  
  @js.native
  trait ReadLine extends EventEmitter {
    
    def close(): Unit = js.native
    
    def pause(): Unit = js.native
    
    def prompt(): Unit = js.native
    def prompt(preserveCursor: Boolean): Unit = js.native
    
    def question(query: String, callback: js.Function): Unit = js.native
    
    def resume(): Unit = js.native
    
    def setPrompt(prompt: String, length: Double): Unit = js.native
    
    def write(data: js.Any): Unit = js.native
    def write(data: js.Any, key: js.Any): Unit = js.native
  }
  
  trait ReadLineOptions extends StObject {
    
    var completer: js.UndefOr[js.Function] = js.undefined
    
    var input: ReadableStream
    
    var output: WritableStream
    
    var terminal: js.UndefOr[Boolean] = js.undefined
  }
  object ReadLineOptions {
    
    @scala.inline
    def apply(input: ReadableStream, output: WritableStream): ReadLineOptions = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadLineOptions]
    }
    
    @scala.inline
    implicit class ReadLineOptionsMutableBuilder[Self <: ReadLineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleter(value: js.Function): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleterUndefined: Self = StObject.set(x, "completer", js.undefined)
      
      @scala.inline
      def setInput(value: ReadableStream): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: WritableStream): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    }
  }
}
