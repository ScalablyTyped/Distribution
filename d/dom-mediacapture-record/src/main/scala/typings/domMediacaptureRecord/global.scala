package typings.domMediacaptureRecord

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BlobEvent")
  @js.native
  class BlobEvent protected ()
    extends typings.domMediacaptureRecord.BlobEvent {
    def this(`type`: String, eventInitDict: BlobEventInit) = this()
  }
  
  @JSGlobal("MediaRecorder")
  @js.native
  class MediaRecorder protected ()
    extends typings.domMediacaptureRecord.MediaRecorder {
    def this(stream: MediaStream) = this()
    def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  }
  object MediaRecorder {
    
    /* static member */
    @JSGlobal("MediaRecorder.isTypeSupported")
    @js.native
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  
  @JSGlobal("MediaRecorderErrorEvent")
  @js.native
  class MediaRecorderErrorEvent protected ()
    extends typings.domMediacaptureRecord.MediaRecorderErrorEvent {
    def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  }
}
