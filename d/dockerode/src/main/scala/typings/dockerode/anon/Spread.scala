package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spread extends StObject {
  
  var Spread: SpreadDescriptor
}
object Spread {
  
  @scala.inline
  def apply(Spread: SpreadDescriptor): Spread = {
    val __obj = js.Dynamic.literal(Spread = Spread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spread]
  }
  
  @scala.inline
  implicit class SpreadMutableBuilder[Self <: Spread] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpread(value: SpreadDescriptor): Self = StObject.set(x, "Spread", value.asInstanceOf[js.Any])
  }
}
