package typings.dwt

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
  sealed trait TWDSS_ACQUIRING extends EnumDWT_DataSourceStatus
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED extends EnumDWT_DataSourceStatus
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED extends EnumDWT_DataSourceStatus
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED extends EnumDWT_DataSourceStatus
  
  /* 3 */ val TWDSS_ACQUIRING: typings.dwt.EnumDWT_DataSourceStatus.TWDSS_ACQUIRING with Double = js.native
  /* 0 */ val TWDSS_CLOSED: typings.dwt.EnumDWT_DataSourceStatus.TWDSS_CLOSED with Double = js.native
  /* 2 */ val TWDSS_ENABLED: typings.dwt.EnumDWT_DataSourceStatus.TWDSS_ENABLED with Double = js.native
  /* 1 */ val TWDSS_OPENED: typings.dwt.EnumDWT_DataSourceStatus.TWDSS_OPENED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_DataSourceStatus with Double] = js.native
}

