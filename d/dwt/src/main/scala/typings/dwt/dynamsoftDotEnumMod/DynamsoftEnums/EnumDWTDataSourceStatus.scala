package typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTDataSourceStatus extends StObject
/** Data source status. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_DataSourceStatus")
@js.native
object EnumDWTDataSourceStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTDataSourceStatus & Double] = js.native
  
  /** Indicate the data source is acquiring image. */
  @js.native
  sealed trait TWDSS_ACQUIRING
    extends StObject
       with EnumDWTDataSourceStatus
  /* 3 */ val TWDSS_ACQUIRING: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_ACQUIRING & Double = js.native
  
  /** Indicate the data source is closed.  */
  @js.native
  sealed trait TWDSS_CLOSED
    extends StObject
       with EnumDWTDataSourceStatus
  /* 0 */ val TWDSS_CLOSED: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_CLOSED & Double = js.native
  
  /** Indicate the data source is enabled.  */
  @js.native
  sealed trait TWDSS_ENABLED
    extends StObject
       with EnumDWTDataSourceStatus
  /* 2 */ val TWDSS_ENABLED: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_ENABLED & Double = js.native
  
  /** Indicate the data source is opened. */
  @js.native
  sealed trait TWDSS_OPENED
    extends StObject
       with EnumDWTDataSourceStatus
  /* 1 */ val TWDSS_OPENED: typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTDataSourceStatus.TWDSS_OPENED & Double = js.native
}
