package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscreteGenericResource extends GenericResource {
  
  var Kind: js.UndefOr[String] = js.native
  
  var Value: js.UndefOr[Double] = js.native
}
object DiscreteGenericResource {
  
  @scala.inline
  def apply(): DiscreteGenericResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscreteGenericResource]
  }
  
  @scala.inline
  implicit class DiscreteGenericResourceMutableBuilder[Self <: DiscreteGenericResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "Kind", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
