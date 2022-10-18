package typings.firebaseStorage.distStorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
/**
  * Error codes for requests made by the the XhrIo wrapper.
  */
@JSImport("@firebase/storage/dist/storage", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @js.native
  sealed trait ABORT
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait NETWORK_ERROR
    extends StObject
       with ErrorCode
  
  @js.native
  sealed trait NO_ERROR
    extends StObject
       with ErrorCode
}
