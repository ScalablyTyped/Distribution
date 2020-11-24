package typings.dwt.dynamsoftEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDataSourceStatus extends js.Object
/** Data source status. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DataSourceStatus")
@js.native
object EnumDWTDataSourceStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDataSourceStatus with Double] = js.native
  
  /** Indicate the data source is acquiring image. */
  @js.native
  sealed trait TWDSS_ACQUIRING extends EnumDWTDataSourceStatus
  /* 3 */ @js.native
  object TWDSS_ACQUIRING extends TopLevel[TWDSS_ACQUIRING with Double]
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED extends EnumDWTDataSourceStatus
  /* 0 */ @js.native
  object TWDSS_CLOSED extends TopLevel[TWDSS_CLOSED with Double]
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED extends EnumDWTDataSourceStatus
  /* 2 */ @js.native
  object TWDSS_ENABLED extends TopLevel[TWDSS_ENABLED with Double]
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED extends EnumDWTDataSourceStatus
  /* 1 */ @js.native
  object TWDSS_OPENED extends TopLevel[TWDSS_OPENED with Double]
}
