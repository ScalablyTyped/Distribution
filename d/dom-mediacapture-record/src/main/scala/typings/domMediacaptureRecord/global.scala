package typings.domMediacaptureRecord

import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BlobEvent")
  @js.native
  class BlobEvent protected ()
    extends StObject
       with typings.domMediacaptureRecord.BlobEvent {
    def this(`type`: String, eventInitDict: BlobEventInit) = this()
  }
  
  @JSGlobal("MediaRecorder")
  @js.native
  class MediaRecorder protected ()
    extends StObject
       with typings.domMediacaptureRecord.MediaRecorder {
    def this(stream: MediaStream) = this()
    def this(stream: MediaStream, options: MediaRecorderOptions) = this()
  }
  object MediaRecorder {
    
    @JSGlobal("MediaRecorder")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def isTypeSupported(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSGlobal("MediaRecorderErrorEvent")
  @js.native
  class MediaRecorderErrorEvent protected ()
    extends StObject
       with typings.domMediacaptureRecord.MediaRecorderErrorEvent {
    def this(`type`: String, eventInitDict: MediaRecorderErrorEventInit) = this()
  }
}
