package typings.domMediacaptureTransform

import typings.domWebcodecs.AudioData
import typings.domWebcodecs.VideoFrame
import typings.std.MediaStreamTrack
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Takes video frames as input, and emits control signals that result from subsequent processing.
  */
@js.native
trait MediaStreamTrackGenerator[T /* <: AudioData | VideoFrame */]
  extends StObject
     with MediaStreamTrack {
  
  /**
    * Allows reading control signals sent from any sinks connected to the
    * MediaStreamTrackGenerator.
    */
  val readableControl: ReadableStream[MediaStreamTrackSignal] = js.native
  
  /**
    * Allows writing media frames to the MediaStreamTrackGenerator, which is itself a
    * MediaStreamTrack. When a frame is written to writable, the frame’s close() method is
    * automatically invoked, so that its internal resources are no longer accessible from
    * JavaScript.
    */
  val writable: WritableStream[T] = js.native
}
