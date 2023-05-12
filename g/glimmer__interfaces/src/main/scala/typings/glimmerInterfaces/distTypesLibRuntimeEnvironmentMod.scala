package typings.glimmerInterfaces

import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentDefinitionState
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentInstance
import typings.glimmerInterfaces.distTypesLibComponentsMod.ComponentInstanceState
import typings.glimmerInterfaces.distTypesLibDomChangesMod.GlimmerTreeChanges
import typings.glimmerInterfaces.distTypesLibDomChangesMod.GlimmerTreeConstruction
import typings.glimmerInterfaces.distTypesLibManagersInternalComponentMod.WithCreateInstance
import typings.glimmerInterfaces.distTypesLibRuntimeDebugRenderTreeMod.DebugRenderTree
import typings.glimmerInterfaces.distTypesLibRuntimeModifierMod.ModifierInstance
import typings.glimmerInterfaces.distTypesLibRuntimeOwnerMod.Owner
import typings.simpleDomInterface.mod.SimpleDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibRuntimeEnvironmentMod {
  
  @JSImport("@glimmer/interfaces/dist/types/lib/runtime/environment", "TransactionSymbol")
  @js.native
  val TransactionSymbol: js.Symbol = js.native
  type TransactionSymbol = js.Symbol
  
  type ComponentInstanceWithCreate = ComponentInstance[
    ComponentDefinitionState, 
    ComponentInstanceState, 
    WithCreateInstance[Any, Any, Owner]
  ]
  
  @js.native
  trait Environment extends StObject {
    
    def begin(): Unit = js.native
    
    def commit(): Unit = js.native
    
    var debugRenderTree: js.UndefOr[DebugRenderTree[js.Object]] = js.native
    
    def didCreate(component: ComponentInstanceWithCreate): Unit = js.native
    
    def didUpdate(component: ComponentInstanceWithCreate): Unit = js.native
    
    def getAppendOperations(): GlimmerTreeConstruction = js.native
    
    def getDOM(): GlimmerTreeChanges = js.native
    
    var isInteractive: Boolean = js.native
    
    def scheduleInstallModifier(modifier: ModifierInstance): Unit = js.native
    
    def scheduleUpdateModifier(modifier: ModifierInstance): Unit = js.native
  }
  
  trait EnvironmentOptions extends StObject {
    
    var appendOperations: js.UndefOr[GlimmerTreeConstruction] = js.undefined
    
    var document: js.UndefOr[SimpleDocument] = js.undefined
    
    var updateOperations: js.UndefOr[GlimmerTreeChanges] = js.undefined
  }
  object EnvironmentOptions {
    
    inline def apply(): EnvironmentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvironmentOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendOperations(value: GlimmerTreeConstruction): Self = StObject.set(x, "appendOperations", value.asInstanceOf[js.Any])
      
      inline def setAppendOperationsUndefined: Self = StObject.set(x, "appendOperations", js.undefined)
      
      inline def setDocument(value: SimpleDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setUpdateOperations(value: GlimmerTreeChanges): Self = StObject.set(x, "updateOperations", value.asInstanceOf[js.Any])
      
      inline def setUpdateOperationsUndefined: Self = StObject.set(x, "updateOperations", js.undefined)
    }
  }
  
  trait Transaction extends StObject
}
