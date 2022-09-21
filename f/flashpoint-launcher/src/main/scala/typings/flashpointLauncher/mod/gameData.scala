package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Collection of Game Data related API functions */
object gameData {
  
  @JSImport("flashpoint-launcher", "gameData")
  @js.native
  val ^ : js.Any = js.native
  
  inline def downloadGameData(gameDataId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadGameData")(gameDataId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def findGameData(gameId: String): js.Promise[js.Array[GameData_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findGameData")(gameId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GameData_]]]
  
  inline def findOne(id: Double): js.Promise[js.UndefOr[GameData_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[GameData_]]]
  
  inline def findSourceDataForHashes(hashes: js.Array[String]): js.Promise[js.Array[SourceData]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSourceDataForHashes")(hashes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[SourceData]]]
  
  inline def importGameData(gameId: String, filePath: String): js.Promise[GameData_] = (^.asInstanceOf[js.Dynamic].applyDynamic("importGameData")(gameId.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GameData_]]
  
  @JSImport("flashpoint-launcher", "gameData.onDidImportGameData")
  @js.native
  val onDidImportGameData: Event[GameData_] = js.native
  
  inline def save(gameData: GameData_): js.Promise[GameData_] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(gameData.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GameData_]]
}
