package typings.gherkin

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.gherkin.igherkinoptionsMod.IGherkinOptions
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/stream/ParserMessageStream", JSImport.Namespace)
@js.native
object parserMessageStreamMod extends js.Object {
  
  @js.native
  trait ParserMessageStream extends Transform {
    
    def _transform(envelope: IEnvelope, encoding: String, callback: TransformCallback): Unit = js.native
    
    val options: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ParserMessageStream {
    def this(options: IGherkinOptions) = this()
  }
}
