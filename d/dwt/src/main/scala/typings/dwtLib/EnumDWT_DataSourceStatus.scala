package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_DataSourceStatus extends js.Object

/** Data source status. */
@JSGlobal("EnumDWT_DataSourceStatus")
@js.native
object EnumDWT_DataSourceStatus extends js.Object {
  /** Indicate the data source is acquiring image. */
  @js.native
  sealed trait TWDSS_ACQUIRING
    extends dwtLib.EnumDWT_DataSourceStatus
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED
    extends dwtLib.EnumDWT_DataSourceStatus
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED
    extends dwtLib.EnumDWT_DataSourceStatus
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED
    extends dwtLib.EnumDWT_DataSourceStatus
  
  /* 3 */ val TWDSS_ACQUIRING: TWDSS_ACQUIRING with scala.Double = js.native
  /* 0 */ val TWDSS_CLOSED: TWDSS_CLOSED with scala.Double = js.native
  /* 2 */ val TWDSS_ENABLED: TWDSS_ENABLED with scala.Double = js.native
  /* 1 */ val TWDSS_OPENED: TWDSS_OPENED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dwtLib.EnumDWT_DataSourceStatus with scala.Double] = js.native
}

