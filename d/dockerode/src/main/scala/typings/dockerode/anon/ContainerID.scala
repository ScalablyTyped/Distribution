package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerID extends StObject {
  
  var ContainerID: String
}
object ContainerID {
  
  inline def apply(ContainerID: String): ContainerID = {
    val __obj = js.Dynamic.literal(ContainerID = ContainerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerID] (val x: Self) extends AnyVal {
    
    inline def setContainerID(value: String): Self = StObject.set(x, "ContainerID", value.asInstanceOf[js.Any])
  }
}
