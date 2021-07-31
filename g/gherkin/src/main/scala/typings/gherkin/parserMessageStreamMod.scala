package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMessageStreamMod {
  
  @JSImport("gherkin/dist/src/stream/ParserMessageStream", JSImport.Default)
  @js.native
  class default protected () extends ParserMessageStream {
    def this(options: IGherkinOptions) = this()
  }
  
  @js.native
  trait ParserMessageStream extends Transform {
    
    def _transform(envelope: IEnvelope, encoding: String, callback: TransformCallback): Unit = js.native
    
    val options: js.Any = js.native
  }
}
