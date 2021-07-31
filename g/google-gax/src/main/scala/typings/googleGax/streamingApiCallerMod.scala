package typings.googleGax

import typings.googleGax.apiCallerMod.APICaller
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.gaxMod.CallSettings
import typings.googleGax.streamDescriptorMod.StreamDescriptor
import typings.googleGax.streamingMod.StreamProxy
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingApiCallerMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streamingApiCaller", "StreamingApiCaller")
  @js.native
  class StreamingApiCaller protected ()
    extends StObject
       with APICaller {
    /**
      * An API caller for methods of gRPC streaming.
      * @private
      * @constructor
      * @param {StreamDescriptor} descriptor - the descriptor of the method structure.
      */
    def this(descriptor: StreamDescriptor) = this()
    
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: CallSettings, stream: StreamProxy): Unit = js.native
    
    var descriptor: StreamDescriptor = js.native
    
    def fail(stream: CancellableStream, err: Error): Unit = js.native
  }
}
