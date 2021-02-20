package typings.gherkin

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.dialectMod.Dialect
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gherkinExeMod {
  
  @JSImport("gherkin/dist/src/external/GherkinExe", JSImport.Default)
  @js.native
  class default protected () extends GherkinExe {
    def this(
      gherkinExe: String,
      paths: js.Array[String],
      envelopes: js.Array[IEnvelope],
      options: IGherkinOptions
    ) = this()
  }
  
  @js.native
  trait GherkinExe extends StObject {
    
    def dialects(): StringDictionary[Dialect] = js.native
    
    val envelopes: js.Any = js.native
    
    val gherkinExe: js.Any = js.native
    
    def messageStream(): Readable = js.native
    
    val options: js.Any = js.native
    
    val paths: js.Any = js.native
  }
  object GherkinExe {
    
    @scala.inline
    def apply(
      dialects: () => StringDictionary[Dialect],
      envelopes: js.Any,
      gherkinExe: js.Any,
      messageStream: () => Readable,
      options: js.Any,
      paths: js.Any
    ): GherkinExe = {
      val __obj = js.Dynamic.literal(dialects = js.Any.fromFunction0(dialects), envelopes = envelopes.asInstanceOf[js.Any], gherkinExe = gherkinExe.asInstanceOf[js.Any], messageStream = js.Any.fromFunction0(messageStream), options = options.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinExe]
    }
    
    @scala.inline
    implicit class GherkinExeMutableBuilder[Self <: GherkinExe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDialects(value: () => StringDictionary[Dialect]): Self = StObject.set(x, "dialects", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnvelopes(value: js.Any): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGherkinExe(value: js.Any): Self = StObject.set(x, "gherkinExe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageStream(value: () => Readable): Self = StObject.set(x, "messageStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
}
