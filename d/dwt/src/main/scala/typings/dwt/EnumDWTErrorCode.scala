package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTErrorCode extends js.Object

@JSGlobal("EnumDWT_ErrorCode")
@js.native
object EnumDWTErrorCode extends js.Object {
  /** Can't add the filter to graph */
  @js.native
  sealed trait WCERR_FAIL_ADDFILTER extends EnumDWTErrorCode
  
  /** Can't build the graph */
  @js.native
  sealed trait WCERR_FAIL_BUILDGRAPH extends EnumDWTErrorCode
  
  /** Could not create filter graph. */
  @js.native
  sealed trait WCERR_FAIL_FILTERGRAPH extends EnumDWTErrorCode
  
  /** Create ICreateDevEnum interface failed. */
  @js.native
  sealed trait WCERR_FAIL_ICREATEDEVENUM extends EnumDWTErrorCode
  
  /** Create IEnumMoniker interface failed. */
  @js.native
  sealed trait WCERR_FAIL_IENUMMONIKER extends EnumDWTErrorCode
  
  /** Failed to register filter graph with ROT. */
  @js.native
  sealed trait WCERR_FAIL_REGFILTERGRAPH extends EnumDWTErrorCode
  
  /** Could not create SampleGrabber (isqedit.all registered?). */
  @js.native
  sealed trait WCERR_FAIL_SAMPLEGRABBER extends EnumDWTErrorCode
  
  /** Could not get video window interface */
  @js.native
  sealed trait WCERR_FAIL_VIDEOWINDOW extends EnumDWTErrorCode
  
  /** Time out */
  @js.native
  sealed trait WCERR_GRAB_TIMEOUT extends EnumDWTErrorCode
  
  /** The property doesn't support auto capability. */
  @js.native
  sealed trait WCERR_NOT_AUTOPROPERTY extends EnumDWTErrorCode
  
  /** The camera doesn't support IAMCameraControl interface. */
  @js.native
  sealed trait WCERR_NOT_IAMCAMERACONTROL extends EnumDWTErrorCode
  
  /** The camera doesn't support IAMVideoProcAmp interface. */
  @js.native
  sealed trait WCERR_NOT_IAMVIDEOPROPERTY extends EnumDWTErrorCode
  
  /** No webcam device is found. */
  @js.native
  sealed trait WCERR_NO_DEVICE extends EnumDWTErrorCode
  
  /** Unable to make NULL renderer */
  @js.native
  sealed trait WCERR_NULLRENDER extends EnumDWTErrorCode
  
  /** All error from directshow sdk */
  @js.native
  sealed trait WCERR_SYSTEM extends EnumDWTErrorCode
  
}

