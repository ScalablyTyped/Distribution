package typings.eventStream

import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def child(child_process: Any): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("child")(child_process.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def concat(streamArray: js.Array[MapStream]): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(streamArray.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  inline def concat(stream: MapStream*): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MapStream]
  
  inline def duplex(writeStream: Writable, readStream: Readable): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("duplex")(writeStream.asInstanceOf[js.Any], readStream.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  
  inline def filterSync(syncFunction: js.Function1[/* value */ Any, Boolean]): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSync")(syncFunction.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def join(separator: String): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def map(asyncFunction: js.Function): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(asyncFunction.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def mapSync(syncFunction: js.Function): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSync")(syncFunction.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def merge(streamArray: js.Array[MapStream]): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(streamArray.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  inline def merge(stream: MapStream*): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(stream.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MapStream]
  
  inline def parse(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Any]
  
  inline def pause(): MapStream | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")().asInstanceOf[MapStream | Unit]
  
  inline def pipeline(streams: MapStream*): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MapStream]
  
  inline def readArray(array: js.Array[Any]): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("readArray")(array.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def readable(asyncFunction: js.Function): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(asyncFunction.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def replace(from: String, to: String): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  inline def replace(from: String, to: js.RegExp): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  inline def replace(from: js.RegExp, to: String): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  inline def replace(from: js.RegExp, to: js.RegExp): MapStream = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[MapStream]
  
  inline def split(): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("split")().asInstanceOf[MapStream]
  inline def split(matcher: String): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(matcher.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  inline def split(matcher: js.RegExp): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("split")(matcher.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def stringify(): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[MapStream]
  
  inline def wait_(callback: js.Function): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(callback.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  inline def writeArray(callback: js.Function): MapStream = ^.asInstanceOf[js.Dynamic].applyDynamic("writeArray")(callback.asInstanceOf[js.Any]).asInstanceOf[MapStream]
  
  @js.native
  trait MapStream extends Stream {
    
    def destroy(): Unit = js.native
    
    var end: Any = js.native
    
    def pause(): Unit = js.native
    
    var readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    var writable: Boolean = js.native
    
    var write: Any = js.native
  }
}
