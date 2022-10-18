package typings.dirCompare

import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcTypesMod.DifferenceType
import typings.dirCompare.buildSrcTypesMod.Entry
import typings.dirCompare.buildSrcTypesMod.InitialStatistics
import typings.dirCompare.buildSrcTypesMod.Options
import typings.dirCompare.buildSrcTypesMod.PermissionDeniedState
import typings.dirCompare.buildSrcTypesMod.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStatisticsStatisticsUpdateMod {
  
  object StatisticsUpdate {
    
    @JSImport("dir-compare/build/src/Statistics/StatisticsUpdate", "StatisticsUpdate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def updateStatisticsBoth(
      entry1: Entry,
      entry2: Entry,
      same: Boolean,
      reason: Reason,
      `type`: DifferenceType,
      permissionDeniedState: PermissionDeniedState,
      statistics: InitialStatistics,
      options: ExtOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStatisticsBoth")(entry1.asInstanceOf[js.Any], entry2.asInstanceOf[js.Any], same.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], permissionDeniedState.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateStatisticsLeft(
      entry1: Entry,
      `type`: DifferenceType,
      permissionDeniedState: PermissionDeniedState,
      statistics: InitialStatistics,
      options: ExtOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStatisticsLeft")(entry1.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], permissionDeniedState.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateStatisticsRight(
      entry2: Entry,
      `type`: DifferenceType,
      permissionDeniedState: PermissionDeniedState,
      statistics: InitialStatistics,
      options: Options
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateStatisticsRight")(entry2.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], permissionDeniedState.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
