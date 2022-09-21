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
  open class default protected ()
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
    override val envelopes: Any = js.native
    
    /* private */ /* CompleteClass */
    override val gherkinExe: Any = js.native
    
    /* CompleteClass */
    override def messageStream(): Readable = js.native
    
    /* private */ /* CompleteClass */
    override val options: Any = js.native
    
    /* private */ /* CompleteClass */
    override val paths: Any = js.native
  }
  
  trait GherkinExe extends StObject {
    
    def dialects(): StringDictionary[Dialect]
    
    /* private */ val envelopes: Any
    
    /* private */ val gherkinExe: Any
    
    def messageStream(): Readable
    
    /* private */ val options: Any
    
    /* private */ val paths: Any
  }
  object GherkinExe {
    
    inline def apply(
      dialects: () => StringDictionary[Dialect],
      envelopes: Any,
      gherkinExe: Any,
      messageStream: () => Readable,
      options: Any,
      paths: Any
    ): GherkinExe = {
      val __obj = js.Dynamic.literal(dialects = js.Any.fromFunction0(dialects), envelopes = envelopes.asInstanceOf[js.Any], gherkinExe = gherkinExe.asInstanceOf[js.Any], messageStream = js.Any.fromFunction0(messageStream), options = options.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinExe]
    }
    
    extension [Self <: GherkinExe](x: Self) {
      
      inline def setDialects(value: () => StringDictionary[Dialect]): Self = StObject.set(x, "dialects", js.Any.fromFunction0(value))
      
      inline def setEnvelopes(value: Any): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
      
      inline def setGherkinExe(value: Any): Self = StObject.set(x, "gherkinExe", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: () => Readable): Self = StObject.set(x, "messageStream", js.Any.fromFunction0(value))
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
}
