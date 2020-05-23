package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTDataSourceStatus extends js.Object

/** Data source status. */
@JSGlobal("EnumDWT_DataSourceStatus")
@js.native
object EnumDWTDataSourceStatus extends js.Object {
  /** Indicate the data source is acquiring image. */
  @js.native
  sealed trait TWDSS_ACQUIRING extends EnumDWTDataSourceStatus
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED extends EnumDWTDataSourceStatus
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED extends EnumDWTDataSourceStatus
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED extends EnumDWTDataSourceStatus
  
}

