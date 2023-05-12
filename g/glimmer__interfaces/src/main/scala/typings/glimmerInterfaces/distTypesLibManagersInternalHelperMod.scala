package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibManagersHelperMod.HelperManager
import typings.glimmerInterfaces.distTypesLibRuntimeHelperMod.Helper
import typings.glimmerInterfaces.distTypesLibRuntimeHelperMod.HelperDefinitionState
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibManagersInternalHelperMod {
  
  @js.native
  trait InternalHelperManager[TOwner /* <: Owner */] extends StObject {
    
    def getDelegateFor(): HelperManager[Any] = js.native
    def getDelegateFor(owner: TOwner): HelperManager[Any] = js.native
    
    def getHelper(definition: HelperDefinitionState): Helper[Owner] = js.native
  }
}
