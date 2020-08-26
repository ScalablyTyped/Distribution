package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTErrorCode extends js.Object

/** -2400 to -2499 is webcam error code */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_ErrorCode")
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTErrorCode with Double] = js.native
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

