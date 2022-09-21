package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerRemoveOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var link: js.UndefOr[Boolean] = js.undefined
  
  var v: js.UndefOr[Boolean] = js.undefined
}
object ContainerRemoveOptions {
  
  inline def apply(): ContainerRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerRemoveOptions]
  }
  
  extension [Self <: ContainerRemoveOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
  }
}
