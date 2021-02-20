package typings.eventStream

import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("event-stream", "child")
  @js.native
  def child(child_process: js.Any): MapStream = js.native
  
  @JSImport("event-stream", "concat")
  @js.native
  def concat(streamArray: js.Array[MapStream]): MapStream = js.native
  @JSImport("event-stream", "concat")
  @js.native
  def concat(stream: MapStream*): MapStream = js.native
  
  @JSImport("event-stream", "duplex")
  @js.native
  def duplex(writeStream: Writable, readStream: Readable): MapStream = js.native
  
  @JSImport("event-stream", "join")
  @js.native
  def join(separator: String): MapStream = js.native
  
  @JSImport("event-stream", "map")
  @js.native
  def map(asyncFunction: js.Function): MapStream = js.native
  
  @JSImport("event-stream", "mapSync")
  @js.native
  def mapSync(syncFunction: js.Function): MapStream = js.native
  
  @JSImport("event-stream", "merge")
  @js.native
  def merge(streamArray: js.Array[MapStream]): MapStream = js.native
  @JSImport("event-stream", "merge")
  @js.native
  def merge(stream: MapStream*): MapStream = js.native
  
  @JSImport("event-stream", "parse")
  @js.native
  def parse(): js.Any = js.native
  
  @JSImport("event-stream", "pause")
  @js.native
  def pause(): MapStream | Unit = js.native
  
  @JSImport("event-stream", "readArray")
  @js.native
  def readArray(array: js.Array[_]): MapStream = js.native
  
  @JSImport("event-stream", "readable")
  @js.native
  def readable(asyncFunction: js.Function): MapStream = js.native
  
  @JSImport("event-stream", "replace")
  @js.native
  def replace(from: String, to: String): MapStream = js.native
  @JSImport("event-stream", "replace")
  @js.native
  def replace(from: String, to: RegExp): MapStream = js.native
  @JSImport("event-stream", "replace")
  @js.native
  def replace(from: RegExp, to: String): MapStream = js.native
  @JSImport("event-stream", "replace")
  @js.native
  def replace(from: RegExp, to: RegExp): MapStream = js.native
  
  @JSImport("event-stream", "split")
  @js.native
  def split(): MapStream = js.native
  @JSImport("event-stream", "split")
  @js.native
  def split(matcher: String): MapStream = js.native
  @JSImport("event-stream", "split")
  @js.native
  def split(matcher: RegExp): MapStream = js.native
  
  @JSImport("event-stream", "stringify")
  @js.native
  def stringify(): MapStream = js.native
  
  @JSImport("event-stream", "wait")
  @js.native
  def wait_(callback: js.Function): MapStream = js.native
  
  @JSImport("event-stream", "writeArray")
  @js.native
  def writeArray(callback: js.Function): MapStream = js.native
  
  @js.native
  trait MapStream extends Stream {
    
    def destroy(): Unit = js.native
    
    var end: js.Any = js.native
    
    def pause(): Unit = js.native
    
    var readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    var writable: Boolean = js.native
    
    var write: js.Any = js.native
  }
}
