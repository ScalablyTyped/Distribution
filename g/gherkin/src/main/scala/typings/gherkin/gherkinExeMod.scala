package typings.gherkin

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.dialectMod.Dialect
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gherkinExeMod {
  
  @JSImport("gherkin/dist/src/external/GherkinExe", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with GherkinExe {
    def this(
      gherkinExe: String,
      paths: js.Array[String],
      envelopes: js.Array[IEnvelope],
      options: IGherkinOptions
    ) = this()
    
    /* CompleteClass */
    override def dialects(): StringDictionary[Dialect] = js.native
    
    /* private */ /* CompleteClass */
    override val envelopes: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val gherkinExe: js.Any = js.native
    
    /* CompleteClass */
    override def messageStream(): Readable = js.native
    
    /* private */ /* CompleteClass */
    override val options: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val paths: js.Any = js.native
  }
  
  trait GherkinExe extends StObject {
    
    def dialects(): StringDictionary[Dialect]
    
    /* private */ val envelopes: js.Any
    
    /* private */ val gherkinExe: js.Any
    
    def messageStream(): Readable
    
    /* private */ val options: js.Any
    
    /* private */ val paths: js.Any
  }
  object GherkinExe {
    
    inline def apply(
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
    
    extension [Self <: GherkinExe](x: Self) {
      
      inline def setDialects(value: () => StringDictionary[Dialect]): Self = StObject.set(x, "dialects", js.Any.fromFunction0(value))
      
      inline def setEnvelopes(value: js.Any): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
      
      inline def setGherkinExe(value: js.Any): Self = StObject.set(x, "gherkinExe", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: () => Readable): Self = StObject.set(x, "messageStream", js.Any.fromFunction0(value))
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
}
