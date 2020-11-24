package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadSnapshotRequest extends js.Object {
  
  /**
    * An array of tiles composing the snapshot.
    */
  var tiles: js.Array[PictureTile] = js.native
}
object LoadSnapshotRequest {
  
  @scala.inline
  def apply(tiles: js.Array[PictureTile]): LoadSnapshotRequest = {
    val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSnapshotRequest]
  }
  
  @scala.inline
  implicit class LoadSnapshotRequestOps[Self <: LoadSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTilesVarargs(value: PictureTile*): Self = this.set("tiles", js.Array(value :_*))
    
    @scala.inline
    def setTiles(value: js.Array[PictureTile]): Self = this.set("tiles", value.asInstanceOf[js.Any])
  }
}
