package typings.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileExceptionMessages extends StObject
@JSImport("@google-cloud/storage/build/src/file", "FileExceptionMessages")
@js.native
object FileExceptionMessages extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileExceptionMessages & String] = js.native
  
  @js.native
  sealed trait CONTENT_LENGTH_RANGE_MIN_MAX
    extends StObject
       with FileExceptionMessages
  /* "ContentLengthRange must have numeric min & max fields." */ val CONTENT_LENGTH_RANGE_MIN_MAX: typings.googleCloudStorage.fileMod.FileExceptionMessages.CONTENT_LENGTH_RANGE_MIN_MAX & String = js.native
  
  @js.native
  sealed trait DESTINATION_NO_NAME
    extends StObject
       with FileExceptionMessages
  /* "Destination file should have a name." */ val DESTINATION_NO_NAME: typings.googleCloudStorage.fileMod.FileExceptionMessages.DESTINATION_NO_NAME & String = js.native
  
  @js.native
  sealed trait DOWNLOAD_MISMATCH
    extends StObject
       with FileExceptionMessages
  /* "The downloaded data did not match the data from the server. To be sure the content is the same, you should download the file again." */ val DOWNLOAD_MISMATCH: typings.googleCloudStorage.fileMod.FileExceptionMessages.DOWNLOAD_MISMATCH & String = js.native
  
  @js.native
  sealed trait EQUALS_CONDITION_TWO_ELEMENTS
    extends StObject
       with FileExceptionMessages
  /* "Equals condition must be an array of 2 elements." */ val EQUALS_CONDITION_TWO_ELEMENTS: typings.googleCloudStorage.fileMod.FileExceptionMessages.EQUALS_CONDITION_TWO_ELEMENTS & String = js.native
  
  @js.native
  sealed trait EXPIRATION_TIME_NA
    extends StObject
       with FileExceptionMessages
  /* "An expiration time is not available." */ val EXPIRATION_TIME_NA: typings.googleCloudStorage.fileMod.FileExceptionMessages.EXPIRATION_TIME_NA & String = js.native
  
  @js.native
  sealed trait INVALID_VALIDATION_FILE_RANGE
    extends StObject
       with FileExceptionMessages
  /* "Cannot use validation with file ranges (start/end)." */ val INVALID_VALIDATION_FILE_RANGE: typings.googleCloudStorage.fileMod.FileExceptionMessages.INVALID_VALIDATION_FILE_RANGE & String = js.native
  
  @js.native
  sealed trait MD5_NOT_AVAILABLE
    extends StObject
       with FileExceptionMessages
  /* "MD5 verification was specified, but is not available for the requested object. MD5 is not available for composite objects." */ val MD5_NOT_AVAILABLE: typings.googleCloudStorage.fileMod.FileExceptionMessages.MD5_NOT_AVAILABLE & String = js.native
  
  @js.native
  sealed trait STARTS_WITH_TWO_ELEMENTS
    extends StObject
       with FileExceptionMessages
  /* "StartsWith condition must be an array of 2 elements." */ val STARTS_WITH_TWO_ELEMENTS: typings.googleCloudStorage.fileMod.FileExceptionMessages.STARTS_WITH_TWO_ELEMENTS & String = js.native
  
  @js.native
  sealed trait UPLOAD_MISMATCH
    extends StObject
       with FileExceptionMessages
  /* "The uploaded data did not match the data from the server.\n    As a precaution, the file has been deleted.\n    To be sure the content is the same, you should try uploading the file again." */ val UPLOAD_MISMATCH: typings.googleCloudStorage.fileMod.FileExceptionMessages.UPLOAD_MISMATCH & String = js.native
  
  @js.native
  sealed trait UPLOAD_MISMATCH_DELETE_FAIL
    extends StObject
       with FileExceptionMessages
  /* "The uploaded data did not match the data from the server.\n    As a precaution, we attempted to delete the file, but it was not successful.\n    To be sure the content is the same, you should try removing the file manually,\n    then uploading the file again.\n    \n\nThe delete attempt failed with this message:\n\n  " */ val UPLOAD_MISMATCH_DELETE_FAIL: typings.googleCloudStorage.fileMod.FileExceptionMessages.UPLOAD_MISMATCH_DELETE_FAIL & String = js.native
}
