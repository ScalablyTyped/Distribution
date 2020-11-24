package typings.gherkin

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gherkin/dist/src/stream/SourceMessageStream", JSImport.Namespace)
@js.native
object sourceMessageStreamMod extends js.Object {
  
  @js.native
  trait SourceMessageStream extends Transform {
    
    def _transform(chunk: Buffer, encoding: String, callback: TransformCallback): Unit = js.native
    
    var buffer: js.Any = js.native
    
    val uri: js.Any = js.native
  }
  
  @js.native
  class default protected () extends SourceMessageStream {
    def this(uri: String) = this()
  }
}
