package typings.emberRouting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/routing/location", JSImport.Namespace)
@js.native
object locationMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * This is deprecated in favor of using the container to lookup the location
      * implementation as desired.
      * @deprecated Use the container to lookup the location implementation that you need.
      */
    def create(): js.Any = js.native
    def create(options: js.Object): js.Any = js.native
  }
}
