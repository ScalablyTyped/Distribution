package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var BlobEvent: org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ BlobEventInit, BlobEvent]
  var MediaRecorder: Anon_IsTypeSupported
  var MediaRecorderErrorEvent: org.scalablytyped.runtime.Instantiable2[
    /* type */ java.lang.String, 
    /* eventInitDict */ MediaRecorderErrorEventInit, 
    MediaRecorderErrorEvent
  ]
}

object Window {
  @scala.inline
  def apply(
    BlobEvent: org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ BlobEventInit, BlobEvent],
    MediaRecorder: Anon_IsTypeSupported,
    MediaRecorderErrorEvent: org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaRecorderErrorEventInit, 
      MediaRecorderErrorEvent
    ]
  ): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BlobEvent")(BlobEvent)
    __obj.updateDynamic("MediaRecorder")(MediaRecorder)
    __obj.updateDynamic("MediaRecorderErrorEvent")(MediaRecorderErrorEvent)
    __obj.asInstanceOf[Window]
  }
}

