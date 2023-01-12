package typings.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureTile extends StObject {
  
  /**
    * Base64-encoded snapshot data. (Encoded as a base64 string when passed over JSON)
    */
  var picture: String
  
  /**
    * Offset from owning layer left boundary
    */
  var x: Double
  
  /**
    * Offset from owning layer top boundary
    */
  var y: Double
}
object PictureTile {
  
  inline def apply(picture: String, x: Double, y: Double): PictureTile = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureTile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PictureTile] (val x: Self) extends AnyVal {
    
    inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
