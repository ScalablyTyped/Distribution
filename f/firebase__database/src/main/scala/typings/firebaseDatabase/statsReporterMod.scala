package typings.firebaseDatabase

import typings.firebaseDatabase.serverActionsMod.ServerActions
import typings.firebaseDatabase.statsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsReporterMod {
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsReporter", "StatsReporter")
  @js.native
  class StatsReporter protected () extends StObject {
    /**
      * @param collection
      * @param server_
      */
    def this(collection: StatsCollection, server_ : ServerActions) = this()
    
    def includeStat(stat: String): Unit = js.native
    
    /* private */ var reportStats_ : js.Any = js.native
    
    /* private */ var server_ : js.Any = js.native
    
    /* private */ var statsListener_ : js.Any = js.native
    
    /* private */ var statsToReport_ : js.Any = js.native
  }
}
