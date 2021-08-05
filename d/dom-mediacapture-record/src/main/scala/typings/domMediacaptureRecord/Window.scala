package typings.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable2
import typings.domMediacaptureRecord.anon.TypeofMediaRecorder
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var BlobEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ BlobEventInit, 
    typings.domMediacaptureRecord.BlobEvent
  ]
  
  var MediaRecorder: TypeofMediaRecorder & (Instantiable2[
    /* stream */ MediaStream, 
    /* options */ js.UndefOr[MediaRecorderOptions], 
    typings.domMediacaptureRecord.MediaRecorder
  ])
  
  var MediaRecorderErrorEvent: Instantiable2[
    /* type */ String, 
    /* eventInitDict */ MediaRecorderErrorEventInit, 
    typings.domMediacaptureRecord.MediaRecorderErrorEvent
  ]
}
object Window {
  
  inline def apply(
    BlobEvent: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent],
    MediaRecorder: TypeofMediaRecorder & (Instantiable2[
      /* stream */ MediaStream, 
      /* options */ js.UndefOr[MediaRecorderOptions], 
      MediaRecorder
    ]),
    MediaRecorderErrorEvent: Instantiable2[
      /* type */ String, 
      /* eventInitDict */ MediaRecorderErrorEventInit, 
      MediaRecorderErrorEvent
    ]
  ): Window = {
    val __obj = js.Dynamic.literal(BlobEvent = BlobEvent.asInstanceOf[js.Any], MediaRecorder = MediaRecorder.asInstanceOf[js.Any], MediaRecorderErrorEvent = MediaRecorderErrorEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setBlobEvent(value: Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent]): Self = StObject.set(x, "BlobEvent", value.asInstanceOf[js.Any])
    
    inline def setMediaRecorder(
      value: TypeofMediaRecorder & (Instantiable2[
          /* stream */ MediaStream, 
          /* options */ js.UndefOr[MediaRecorderOptions], 
          MediaRecorder
        ])
    ): Self = StObject.set(x, "MediaRecorder", value.asInstanceOf[js.Any])
    
    inline def setMediaRecorderErrorEvent(
      value: Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MediaRecorderErrorEventInit, 
          MediaRecorderErrorEvent
        ]
    ): Self = StObject.set(x, "MediaRecorderErrorEvent", value.asInstanceOf[js.Any])
  }
}
