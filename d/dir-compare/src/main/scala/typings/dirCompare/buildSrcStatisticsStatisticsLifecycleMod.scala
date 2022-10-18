package typings.dirCompare

import typings.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typings.dirCompare.buildSrcTypesMod.InitialStatistics
import typings.dirCompare.buildSrcTypesMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStatisticsStatisticsLifecycleMod {
  
  object StatisticsLifecycle {
    
    @JSImport("dir-compare/build/src/Statistics/StatisticsLifecycle", "StatisticsLifecycle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def completeStatistics(initialStatistics: InitialStatistics, options: ExtOptions): Statistics = (^.asInstanceOf[js.Dynamic].applyDynamic("completeStatistics")(initialStatistics.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Statistics]
    
    inline def initStats(options: ExtOptions): InitialStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("initStats")(options.asInstanceOf[js.Any]).asInstanceOf[InitialStatistics]
  }
}
