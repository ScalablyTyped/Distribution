package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRemoveOptions extends StObject {
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var noprune: js.UndefOr[Boolean] = js.undefined
}
object ImageRemoveOptions {
  
  inline def apply(): ImageRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRemoveOptions]
  }
  
  extension [Self <: ImageRemoveOptions](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setNoprune(value: Boolean): Self = StObject.set(x, "noprune", value.asInstanceOf[js.Any])
    
    inline def setNopruneUndefined: Self = StObject.set(x, "noprune", js.undefined)
  }
}
