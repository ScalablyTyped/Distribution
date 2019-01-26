package typings
package dwtLib

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
  sealed trait WCERR_FAIL_ADDFILTER
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Can't build the graph */
  @js.native
  sealed trait WCERR_FAIL_BUILDGRAPH
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Could not create filter graph. */
  @js.native
  sealed trait WCERR_FAIL_FILTERGRAPH
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Create ICreateDevEnum interface failed. */
  @js.native
  sealed trait WCERR_FAIL_ICREATEDEVENUM
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Create IEnumMoniker interface failed. */
  @js.native
  sealed trait WCERR_FAIL_IENUMMONIKER
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Failed to register filter graph with ROT. */
  @js.native
  sealed trait WCERR_FAIL_REGFILTERGRAPH
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Could not create SampleGrabber (isqedit.all registered?). */
  @js.native
  sealed trait WCERR_FAIL_SAMPLEGRABBER
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Could not get video window interface */
  @js.native
  sealed trait WCERR_FAIL_VIDEOWINDOW
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Time out */
  @js.native
  sealed trait WCERR_GRAB_TIMEOUT
    extends dwtLib.EnumDWT_ErrorCode
  
  /** The property doesn't support auto capability. */
  @js.native
  sealed trait WCERR_NOT_AUTOPROPERTY
    extends dwtLib.EnumDWT_ErrorCode
  
  /** The camera doesn't support IAMCameraControl interface. */
  @js.native
  sealed trait WCERR_NOT_IAMCAMERACONTROL
    extends dwtLib.EnumDWT_ErrorCode
  
  /** The camera doesn't support IAMVideoProcAmp interface. */
  @js.native
  sealed trait WCERR_NOT_IAMVIDEOPROPERTY
    extends dwtLib.EnumDWT_ErrorCode
  
  /** No webcam device is found. */
  @js.native
  sealed trait WCERR_NO_DEVICE
    extends dwtLib.EnumDWT_ErrorCode
  
  /** Unable to make NULL renderer */
  @js.native
  sealed trait WCERR_NULLRENDER
    extends dwtLib.EnumDWT_ErrorCode
  
  /** All error from directshow sdk */
  @js.native
  sealed trait WCERR_SYSTEM
    extends dwtLib.EnumDWT_ErrorCode
  
  /* -2411 */ val WCERR_FAIL_ADDFILTER: WCERR_FAIL_ADDFILTER with scala.Double = js.native
  /* -2412 */ val WCERR_FAIL_BUILDGRAPH: WCERR_FAIL_BUILDGRAPH with scala.Double = js.native
  /* -2408 */ val WCERR_FAIL_FILTERGRAPH: WCERR_FAIL_FILTERGRAPH with scala.Double = js.native
  /* -2401 */ val WCERR_FAIL_ICREATEDEVENUM: WCERR_FAIL_ICREATEDEVENUM with scala.Double = js.native
  /* -2402 */ val WCERR_FAIL_IENUMMONIKER: WCERR_FAIL_IENUMMONIKER with scala.Double = js.native
  /* -2413 */ val WCERR_FAIL_REGFILTERGRAPH: WCERR_FAIL_REGFILTERGRAPH with scala.Double = js.native
  /* -2409 */ val WCERR_FAIL_SAMPLEGRABBER: WCERR_FAIL_SAMPLEGRABBER with scala.Double = js.native
  /* -2407 */ val WCERR_FAIL_VIDEOWINDOW: WCERR_FAIL_VIDEOWINDOW with scala.Double = js.native
  /* -2414 */ val WCERR_GRAB_TIMEOUT: WCERR_GRAB_TIMEOUT with scala.Double = js.native
  /* -2405 */ val WCERR_NOT_AUTOPROPERTY: WCERR_NOT_AUTOPROPERTY with scala.Double = js.native
  /* -2404 */ val WCERR_NOT_IAMCAMERACONTROL: WCERR_NOT_IAMCAMERACONTROL with scala.Double = js.native
  /* -2403 */ val WCERR_NOT_IAMVIDEOPROPERTY: WCERR_NOT_IAMVIDEOPROPERTY with scala.Double = js.native
  /* -2406 */ val WCERR_NO_DEVICE: WCERR_NO_DEVICE with scala.Double = js.native
  /* -2410 */ val WCERR_NULLRENDER: WCERR_NULLRENDER with scala.Double = js.native
  /* -2400 */ val WCERR_SYSTEM: WCERR_SYSTEM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_ErrorCode with scala.Double] = js.native
}

