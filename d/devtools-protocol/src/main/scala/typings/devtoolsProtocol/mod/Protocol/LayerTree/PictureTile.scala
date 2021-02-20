package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureTile extends StObject {
  
  /**
    * Base64-encoded snapshot data.
    */
  var picture: String = js.native
  
  /**
    * Offset from owning layer left boundary
    */
  var x: Double = js.native
  
  /**
    * Offset from owning layer top boundary
    */
  var y: Double = js.native
}
object PictureTile {
  
  @scala.inline
  def apply(picture: String, x: Double, y: Double): PictureTile = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureTile]
  }
  
  @scala.inline
  implicit class PictureTileMutableBuilder[Self <: PictureTile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
