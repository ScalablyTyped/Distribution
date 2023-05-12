package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityEpcisCaptureResponseMod {
  
  @JSImport("epcis2.js/entity/epcis/CaptureResponse", JSImport.Default)
  @js.native
  /**
    * You can only provide an already existing CaptureResponse
    * via Object
    * @param [captureResponse] - The object that will be used to create the epcisHeader
    * entity
    */
  open class default ()
    extends StObject
       with CaptureResponse {
    def this(captureResponse: Any) = this()
  }
  
  @js.native
  trait CaptureResponse extends StObject {
    
    var errorFile: Any = js.native
    
    var errors: Any = js.native
    
    var fetched: Boolean = js.native
    
    def getCaptureJob(): js.Promise[Any] = js.native
    def getCaptureJob(options: js.Object): js.Promise[Any] = js.native
    
    /**
      * Getter for the error file property
      */
    def getErrorFile(): Any = js.native
    
    /**
      * Getter for the errors property
      */
    def getErrors(): js.Array[String] = js.native
    
    /**
      * Getter for the location
      */
    def getLocation(): String = js.native
    
    /**
      * Getter for the running property
      */
    def getRunningStatus(): Boolean = js.native
    
    /**
      * Getter for the success property
      */
    def getSuccessStatus(): Boolean = js.native
    
    var location: Any = js.native
    
    /**
      * Fetch the capture job information until the running field is equal to false. Stop trying after
      * [nbRetry] tries.
      * @param nbRetry - how much time should it fetch the capture job until aborted
      * @param delay - the delay between each call, in ms (2000 by default)
      * @param options - the request options
      */
    def pollForTheCaptureToFinish(): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Double): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Double, delay: Double): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Double, delay: Double, options: Any): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Double, delay: Unit, options: Any): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Unit, delay: Double): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Unit, delay: Double, options: Any): js.Promise[Unit] = js.native
    def pollForTheCaptureToFinish(nbRetry: Unit, delay: Unit, options: Any): js.Promise[Unit] = js.native
    
    var running: Any = js.native
    
    var success: Any = js.native
  }
}
