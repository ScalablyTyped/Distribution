package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameData_ extends StObject {
  
  /** Expected CRC32 of this data pack */
  var crc32: Double
  
  /** Date this data pack was added on */
  var dateAdded: js.Date
  
  /** ID of the related game */
  var game: js.UndefOr[Game] = js.undefined
  
  var gameId: String
  
  var id: Double
  
  /** Parameters passed to the mounter */
  var parameters: js.UndefOr[String] = js.undefined
  
  /** Path this data pack should reside at, if present on disk */
  var path: js.UndefOr[String] = js.undefined
  
  /** Is the data pack present on disk */
  var presentOnDisk: Boolean
  
  /** Expected SHA256 hash of this data pack */
  var sha256: String
  
  /** Size of this data pack */
  var size: Double
  
  /** Title of this data pack */
  var title: String
}
object GameData_ {
  
  inline def apply(
    crc32: Double,
    dateAdded: js.Date,
    gameId: String,
    id: Double,
    presentOnDisk: Boolean,
    sha256: String,
    size: Double,
    title: String
  ): GameData_ = {
    val __obj = js.Dynamic.literal(crc32 = crc32.asInstanceOf[js.Any], dateAdded = dateAdded.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], presentOnDisk = presentOnDisk.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameData_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameData_] (val x: Self) extends AnyVal {
    
    inline def setCrc32(value: Double): Self = StObject.set(x, "crc32", value.asInstanceOf[js.Any])
    
    inline def setDateAdded(value: js.Date): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    inline def setGameId(value: String): Self = StObject.set(x, "gameId", value.asInstanceOf[js.Any])
    
    inline def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPresentOnDisk(value: Boolean): Self = StObject.set(x, "presentOnDisk", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
