package typings.dwt

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_ErrorCode with Double] = js.native
  /* -2411 */ @js.native
  object WCERR_FAIL_ADDFILTER extends TopLevel[WCERR_FAIL_ADDFILTER with Double]
  
  /* -2412 */ @js.native
  object WCERR_FAIL_BUILDGRAPH extends TopLevel[WCERR_FAIL_BUILDGRAPH with Double]
  
  /* -2408 */ @js.native
  object WCERR_FAIL_FILTERGRAPH extends TopLevel[WCERR_FAIL_FILTERGRAPH with Double]
  
  /* -2401 */ @js.native
  object WCERR_FAIL_ICREATEDEVENUM extends TopLevel[WCERR_FAIL_ICREATEDEVENUM with Double]
  
  /* -2402 */ @js.native
  object WCERR_FAIL_IENUMMONIKER extends TopLevel[WCERR_FAIL_IENUMMONIKER with Double]
  
  /* -2413 */ @js.native
  object WCERR_FAIL_REGFILTERGRAPH extends TopLevel[WCERR_FAIL_REGFILTERGRAPH with Double]
  
  /* -2409 */ @js.native
  object WCERR_FAIL_SAMPLEGRABBER extends TopLevel[WCERR_FAIL_SAMPLEGRABBER with Double]
  
  /* -2407 */ @js.native
  object WCERR_FAIL_VIDEOWINDOW extends TopLevel[WCERR_FAIL_VIDEOWINDOW with Double]
  
  /* -2414 */ @js.native
  object WCERR_GRAB_TIMEOUT extends TopLevel[WCERR_GRAB_TIMEOUT with Double]
  
  /* -2405 */ @js.native
  object WCERR_NOT_AUTOPROPERTY extends TopLevel[WCERR_NOT_AUTOPROPERTY with Double]
  
  /* -2404 */ @js.native
  object WCERR_NOT_IAMCAMERACONTROL extends TopLevel[WCERR_NOT_IAMCAMERACONTROL with Double]
  
  /* -2403 */ @js.native
  object WCERR_NOT_IAMVIDEOPROPERTY extends TopLevel[WCERR_NOT_IAMVIDEOPROPERTY with Double]
  
  /* -2406 */ @js.native
  object WCERR_NO_DEVICE extends TopLevel[WCERR_NO_DEVICE with Double]
  
  /* -2410 */ @js.native
  object WCERR_NULLRENDER extends TopLevel[WCERR_NULLRENDER with Double]
  
  /* -2400 */ @js.native
  object WCERR_SYSTEM extends TopLevel[WCERR_SYSTEM with Double]
  
}

