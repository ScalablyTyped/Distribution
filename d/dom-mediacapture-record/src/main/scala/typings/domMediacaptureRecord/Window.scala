package typings.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable2
import typings.domMediacaptureRecord.anon.TypeofMediaRecorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var BlobEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ BlobEventInit, 
    typings.domMediacaptureRecord.BlobEvent
  ] = js.native
  
  var MediaRecorder: TypeofMediaRecorder = js.native
  
  var MediaRecorderErrorEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ MediaRecorderErrorEventInit, 
    typings.domMediacaptureRecord.MediaRecorderErrorEvent
  ] = js.native
}
object Window {
  
  @scala.inline
  def apply(
    BlobEvent: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent],
    MediaRecorder: TypeofMediaRecorder,
    MediaRecorderErrorEvent: Instantiable2[
      /* type */ String, 
      /* eventInitDict */ MediaRecorderErrorEventInit, 
      MediaRecorderErrorEvent
    ]
  ): Window = {
    val __obj = js.Dynamic.literal(BlobEvent = BlobEvent.asInstanceOf[js.Any], MediaRecorder = MediaRecorder.asInstanceOf[js.Any], MediaRecorderErrorEvent = MediaRecorderErrorEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlobEvent(value: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent]): Self = this.set("BlobEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRecorder(value: TypeofMediaRecorder): Self = this.set("MediaRecorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaRecorderErrorEvent(
      value: Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MediaRecorderErrorEventInit, 
          MediaRecorderErrorEvent
        ]
    ): Self = this.set("MediaRecorderErrorEvent", value.asInstanceOf[js.Any])
  }
}
