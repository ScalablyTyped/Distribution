package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XYZ extends XY {
  
  var z: Double = js.native
}
object XYZ {
  
  @scala.inline
  def apply(x: Double, y: Double, z: Double): XYZ = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[XYZ]
  }
  
  @scala.inline
  implicit class XYZMutableBuilder[Self <: XYZ] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
