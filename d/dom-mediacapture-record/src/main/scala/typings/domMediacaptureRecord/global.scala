package typings.domMediacaptureRecord

import typings.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class BlobEvent protected ()
    extends typings.domMediacaptureRecord.BlobEvent {
    def this(`type`: String, eventInitDict: BlobEventInit) = this()
  }
  
  @js.native
  class MediaRecorder protected ()
    extends typings.domMediacaptureRecord.MediaRecorder {
    def this(stream: MediaStream) = this()
    def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  }
  
  @js.native
  class MediaRecorderErrorEvent protected ()
    extends typings.domMediacaptureRecord.MediaRecorderErrorEvent {
    def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  }
  
  /* static members */
  @js.native
  object MediaRecorder extends js.Object {
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  
}

