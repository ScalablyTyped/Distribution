package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.serverActionsMod.ServerActions
import typings.firebaseDatabase.statsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsReporterMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/stats/StatsReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/stats/StatsReporter", "StatsReporter")
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
