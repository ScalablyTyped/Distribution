package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_ErrorCode extends js.Object

@JSGlobal("EnumDWT_ErrorCode")
@js.native
object EnumDWT_ErrorCode extends js.Object {
  /** Can't add the filter to graph */
  @js.native
  sealed trait WCERR_FAIL_ADDFILTER extends EnumDWT_ErrorCode
  
  /** Can't build the graph */
  @js.native
  sealed trait WCERR_FAIL_BUILDGRAPH extends EnumDWT_ErrorCode
  
  /** Could not create filter graph. */
  @js.native
  sealed trait WCERR_FAIL_FILTERGRAPH extends EnumDWT_ErrorCode
  
  /** Create ICreateDevEnum interface failed. */
  @js.native
  sealed trait WCERR_FAIL_ICREATEDEVENUM extends EnumDWT_ErrorCode
  
  /** Create IEnumMoniker interface failed. */
  @js.native
  sealed trait WCERR_FAIL_IENUMMONIKER extends EnumDWT_ErrorCode
  
  /** Failed to register filter graph with ROT. */
  @js.native
  sealed trait WCERR_FAIL_REGFILTERGRAPH extends EnumDWT_ErrorCode
  
  /** Could not create SampleGrabber (isqedit.all registered?). */
  @js.native
  sealed trait WCERR_FAIL_SAMPLEGRABBER extends EnumDWT_ErrorCode
  
  /** Could not get video window interface */
  @js.native
  sealed trait WCERR_FAIL_VIDEOWINDOW extends EnumDWT_ErrorCode
  
  /** Time out */
  @js.native
  sealed trait WCERR_GRAB_TIMEOUT extends EnumDWT_ErrorCode
  
  /** The property doesn't support auto capability. */
  @js.native
  sealed trait WCERR_NOT_AUTOPROPERTY extends EnumDWT_ErrorCode
  
  /** The camera doesn't support IAMCameraControl interface. */
  @js.native
  sealed trait WCERR_NOT_IAMCAMERACONTROL extends EnumDWT_ErrorCode
  
  /** The camera doesn't support IAMVideoProcAmp interface. */
  @js.native
  sealed trait WCERR_NOT_IAMVIDEOPROPERTY extends EnumDWT_ErrorCode
  
  /** No webcam device is found. */
  @js.native
  sealed trait WCERR_NO_DEVICE extends EnumDWT_ErrorCode
  
  /** Unable to make NULL renderer */
  @js.native
  sealed trait WCERR_NULLRENDER extends EnumDWT_ErrorCode
  
  /** All error from directshow sdk */
  @js.native
  sealed trait WCERR_SYSTEM extends EnumDWT_ErrorCode
  
  /* -2411 */ val WCERR_FAIL_ADDFILTER: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_ADDFILTER with Double = js.native
  /* -2412 */ val WCERR_FAIL_BUILDGRAPH: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_BUILDGRAPH with Double = js.native
  /* -2408 */ val WCERR_FAIL_FILTERGRAPH: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_FILTERGRAPH with Double = js.native
  /* -2401 */ val WCERR_FAIL_ICREATEDEVENUM: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_ICREATEDEVENUM with Double = js.native
  /* -2402 */ val WCERR_FAIL_IENUMMONIKER: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_IENUMMONIKER with Double = js.native
  /* -2413 */ val WCERR_FAIL_REGFILTERGRAPH: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_REGFILTERGRAPH with Double = js.native
  /* -2409 */ val WCERR_FAIL_SAMPLEGRABBER: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_SAMPLEGRABBER with Double = js.native
  /* -2407 */ val WCERR_FAIL_VIDEOWINDOW: typings.dwt.EnumDWT_ErrorCode.WCERR_FAIL_VIDEOWINDOW with Double = js.native
  /* -2414 */ val WCERR_GRAB_TIMEOUT: typings.dwt.EnumDWT_ErrorCode.WCERR_GRAB_TIMEOUT with Double = js.native
  /* -2405 */ val WCERR_NOT_AUTOPROPERTY: typings.dwt.EnumDWT_ErrorCode.WCERR_NOT_AUTOPROPERTY with Double = js.native
  /* -2404 */ val WCERR_NOT_IAMCAMERACONTROL: typings.dwt.EnumDWT_ErrorCode.WCERR_NOT_IAMCAMERACONTROL with Double = js.native
  /* -2403 */ val WCERR_NOT_IAMVIDEOPROPERTY: typings.dwt.EnumDWT_ErrorCode.WCERR_NOT_IAMVIDEOPROPERTY with Double = js.native
  /* -2406 */ val WCERR_NO_DEVICE: typings.dwt.EnumDWT_ErrorCode.WCERR_NO_DEVICE with Double = js.native
  /* -2410 */ val WCERR_NULLRENDER: typings.dwt.EnumDWT_ErrorCode.WCERR_NULLRENDER with Double = js.native
  /* -2400 */ val WCERR_SYSTEM: typings.dwt.EnumDWT_ErrorCode.WCERR_SYSTEM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ErrorCode with Double] = js.native
}

