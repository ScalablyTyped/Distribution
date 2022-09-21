package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSnapshotRequest extends StObject {
  
  /**
    * An array of tiles composing the snapshot.
    */
  var tiles: js.Array[PictureTile]
}
object LoadSnapshotRequest {
  
  inline def apply(tiles: js.Array[PictureTile]): LoadSnapshotRequest = {
    val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSnapshotRequest]
  }
  
  extension [Self <: LoadSnapshotRequest](x: Self) {
    
    inline def setTiles(value: js.Array[PictureTile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
    
    inline def setTilesVarargs(value: PictureTile*): Self = StObject.set(x, "tiles", js.Array(value*))
  }
}
