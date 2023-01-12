package typings.domMediacaptureTransform

import typings.domWebcodecs.AudioData
import typings.domWebcodecs.VideoFrame
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// The following were originally generated from the spec using
// https://github.com/microsoft/TypeScript-DOM-lib-generator, then heavily modified.
/**
  * A track sink that is capable of exposing the unencoded frames from the track to a
  * ReadableStream, and exposes a control channel for signals going in the oppposite direction.
  */
trait MediaStreamTrackProcessor[T /* <: AudioData | VideoFrame */] extends StObject {
  
  /**
    * Allows reading the frames flowing through the MediaStreamTrack provided to the constructor.
    */
  val readable: ReadableStream[T]
  
  /** Allows sending control signals to the MediaStreamTrack provided to the constructor. */
  val writableControl: WritableStream[MediaStreamTrackSignal]
}
object MediaStreamTrackProcessor {
  
  inline def apply[T /* <: AudioData | VideoFrame */](readable: ReadableStream[T], writableControl: WritableStream[MediaStreamTrackSignal]): MediaStreamTrackProcessor[T] = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writableControl = writableControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackProcessor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStreamTrackProcessor[?], T /* <: AudioData | VideoFrame */] (val x: Self & MediaStreamTrackProcessor[T]) extends AnyVal {
    
    inline def setReadable(value: ReadableStream[T]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritableControl(value: WritableStream[MediaStreamTrackSignal]): Self = StObject.set(x, "writableControl", value.asInstanceOf[js.Any])
  }
}
