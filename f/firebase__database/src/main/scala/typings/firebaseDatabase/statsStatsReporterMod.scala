package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.coreServerActionsMod.ServerActions
import typings.firebaseDatabase.statsStatsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsStatsReporterMod {
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsReporter", "StatsReporter")
  @js.native
  open class StatsReporter protected () extends StObject {
    def this(collection: StatsCollection, server_ : ServerActions) = this()
    
    /* private */ var reportStats_ : Any = js.native
    
    /* private */ var server_ : Any = js.native
    
    /* private */ var statsListener_ : Any = js.native
    
    var statsToReport_ : StringDictionary[Boolean] = js.native
  }
  
  inline def statsReporterIncludeStat(reporter: StatsReporter, stat: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("statsReporterIncludeStat")(reporter.asInstanceOf[js.Any], stat.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
