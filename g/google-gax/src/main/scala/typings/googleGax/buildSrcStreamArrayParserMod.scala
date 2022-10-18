package typings.googleGax

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.protobufjs.mod.Method
import typings.std.AbortController
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStreamArrayParserMod {
  
  @JSImport("google-gax/build/src/streamArrayParser", "StreamArrayParser")
  @js.native
  open class StreamArrayParser protected () extends Transform {
    /**
      * StreamArrayParser processes array of valid JSON objects in random chunks
      * through readable stream, and produces a stream of plain Javascript objects
      * where it converted from the corresponding protobuf message instance.
      *
      * The default JSON parser decodes the input stream under the
      * following rules:
      *  1. The stream represents a valid JSON array (must start with a "[" and
      * close with the corresponding "]"). Each element of this array is assumed to
      * be either an array or an object, and will be decoded as a JS object and
      *    delivered.
      *  2. All JSON elements in the buffer will be decoded and delivered in a
      * stream.
      *
      * @private
      * @constructor
      * @param {protobuf.Method} rpc - the protobuf method produce array of JSON.
      * @param {Object} options - the options pass to Transform Stream. See more
      * details
      * https://nodejs.org/api/stream.html#stream_new_stream_transform_options.
      */
    def this(rpc: Method) = this()
    def this(rpc: Method, options: js.Object) = this()
    
    /* private */ var _done: Any = js.native
    
    def _flush(callback: js.Function): Unit = js.native
    
    /* private */ var _isInString: Any = js.native
    
    /* private */ var _isSkipped: Any = js.native
    
    /* private */ var _level: Any = js.native
    
    /* private */ var _prevBlock: Any = js.native
    
    def _transform(chunk: Buffer, _underscore: String, callback: js.Function): Unit = js.native
    
    def cancel(): Unit = js.native
    
    var cancelController: AbortController | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeAbortController */ Any) = js.native
    
    var cancelRequested: Boolean = js.native
    
    var cancelSignal: AbortSignal = js.native
    
    var rpc: Method = js.native
  }
}
