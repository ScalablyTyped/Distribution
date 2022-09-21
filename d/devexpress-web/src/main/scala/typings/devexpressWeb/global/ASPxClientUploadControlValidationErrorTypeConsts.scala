package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Declares client constants containing codes of validation errors that can occur while selecting files for uploading.
  */
@JSGlobal("ASPxClientUploadControlValidationErrorTypeConsts")
@js.native
open class ASPxClientUploadControlValidationErrorTypeConsts ()
  extends StObject
     with typings.devexpressWeb.ASPxClientUploadControlValidationErrorTypeConsts
object ASPxClientUploadControlValidationErrorTypeConsts {
  
  /**
    * A file name contains invalid character. Return Value: 4
    */
  /* static member */
  @JSGlobal("ASPxClientUploadControlValidationErrorTypeConsts.FileNameContainsInvalidCharacter")
  @js.native
  val FileNameContainsInvalidCharacter: Double = js.native
  
  /**
    * The allowed maximum count of the files is exceeded. Return Value: 3
    */
  /* static member */
  @JSGlobal("ASPxClientUploadControlValidationErrorTypeConsts.MaxFileCountExceeded")
  @js.native
  val MaxFileCountExceeded: Double = js.native
  
  /**
    * The allowed maximum file size is exceeded. Return Value: 1
    */
  /* static member */
  @JSGlobal("ASPxClientUploadControlValidationErrorTypeConsts.MaxFileSizeExceeded")
  @js.native
  val MaxFileSizeExceeded: Double = js.native
  
  /**
    * The file's extension is not allowed. Return Value: 2
    */
  /* static member */
  @JSGlobal("ASPxClientUploadControlValidationErrorTypeConsts.NotAllowedFileExtension")
  @js.native
  val NotAllowedFileExtension: Double = js.native
}
