package typings.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* stream */ MediaStream, MediaRecorder]
       with Instantiable2[/* stream */ MediaStream, /* options */ MediaRecorderOptions, MediaRecorder] {
    
    def isTypeSupported(`type`: String): Boolean = js.native
  }
  
  @js.native
  trait InstantiableBlobEvent
    extends StObject
       with Instantiable2[/* type */ String, /* eventInitDict */ BlobEventInit, BlobEvent]
  
  @js.native
  trait InstantiableMediaRecorderErrorEvent
    extends StObject
       with Instantiable2[
          /* type */ String, 
          /* eventInitDict */ MediaRecorderErrorEventInit, 
          MediaRecorderErrorEvent
        ]
}
