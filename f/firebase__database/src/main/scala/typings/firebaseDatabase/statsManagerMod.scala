package typings.firebaseDatabase

import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.statsCollectionMod.StatsCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsManagerMod {
  
  @JSImport("@firebase/database/dist/src/core/stats/StatsManager", "StatsManager")
  @js.native
  class StatsManager () extends StObject
  /* static members */
  object StatsManager {
    
    @JSImport("@firebase/database/dist/src/core/stats/StatsManager", "StatsManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/database/dist/src/core/stats/StatsManager", "StatsManager.collections_")
    @js.native
    def collections_ : js.Any = js.native
    inline def collections__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collections_")(x.asInstanceOf[js.Any])
    
    inline def getCollection(repoInfo: RepoInfo): StatsCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollection")(repoInfo.asInstanceOf[js.Any]).asInstanceOf[StatsCollection]
    
    inline def getOrCreateReporter[T](repoInfo: RepoInfo, creatorFunction: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateReporter")(repoInfo.asInstanceOf[js.Any], creatorFunction.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @JSImport("@firebase/database/dist/src/core/stats/StatsManager", "StatsManager.reporters_")
    @js.native
    def reporters_ : js.Any = js.native
    inline def reporters__=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reporters_")(x.asInstanceOf[js.Any])
  }
}
