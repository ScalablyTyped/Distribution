package typings.firebaseStorage.storageMod

import typings.firebaseStorage.firebaseStorageStrings.canceled
import typings.firebaseStorage.firebaseStorageStrings.canceling
import typings.firebaseStorage.firebaseStorageStrings.error
import typings.firebaseStorage.firebaseStorageStrings.paused
import typings.firebaseStorage.firebaseStorageStrings.pausing
import typings.firebaseStorage.firebaseStorageStrings.running
import typings.firebaseStorage.firebaseStorageStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Internal enum for task state.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebaseStorage.firebaseStorageStrings.running
  - typings.firebaseStorage.firebaseStorageStrings.pausing
  - typings.firebaseStorage.firebaseStorageStrings.paused
  - typings.firebaseStorage.firebaseStorageStrings.success
  - typings.firebaseStorage.firebaseStorageStrings.canceling
  - typings.firebaseStorage.firebaseStorageStrings.canceled
  - typings.firebaseStorage.firebaseStorageStrings.error
*/
trait InternalTaskState extends StObject
object InternalTaskState {
  
  inline def CANCELED: canceled = "canceled".asInstanceOf[canceled]
  
  inline def CANCELING: canceling = "canceling".asInstanceOf[canceling]
  
  inline def ERROR: error = "error".asInstanceOf[error]
  
  inline def PAUSED: paused = "paused".asInstanceOf[paused]
  
  inline def PAUSING: pausing = "pausing".asInstanceOf[pausing]
  
  inline def RUNNING: running = "running".asInstanceOf[running]
  
  inline def SUCCESS: success = "success".asInstanceOf[success]
}
