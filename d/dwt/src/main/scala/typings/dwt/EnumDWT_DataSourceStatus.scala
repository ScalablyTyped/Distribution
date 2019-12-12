package typings.dwt

import org.scalablytyped.runtime.TopLevel
import typings.dwt.EnumDWT_DataSourceStatus.TWDSS_ACQUIRING
import typings.dwt.EnumDWT_DataSourceStatus.TWDSS_CLOSED
import typings.dwt.EnumDWT_DataSourceStatus.TWDSS_ENABLED
import typings.dwt.EnumDWT_DataSourceStatus.TWDSS_OPENED
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_DataSourceStatus with Double] = js.native
  /* 3 */ @js.native
  object TWDSS_ACQUIRING extends TopLevel[TWDSS_ACQUIRING with Double]
  
  /* 0 */ @js.native
  object TWDSS_CLOSED extends TopLevel[TWDSS_CLOSED with Double]
  
  /* 2 */ @js.native
  object TWDSS_ENABLED extends TopLevel[TWDSS_ENABLED with Double]
  
  /* 1 */ @js.native
  object TWDSS_OPENED extends TopLevel[TWDSS_OPENED with Double]
  
}

