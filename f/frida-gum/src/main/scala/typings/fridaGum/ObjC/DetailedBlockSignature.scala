package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailedBlockSignature
  extends StObject
     with BlockSignature {
  
  /**
    * Signature.
    */
  var types: String
}
object DetailedBlockSignature {
  
  @scala.inline
  def apply(types: String): DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedBlockSignature]
  }
  
  @scala.inline
  implicit class DetailedBlockSignatureMutableBuilder[Self <: DetailedBlockSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
