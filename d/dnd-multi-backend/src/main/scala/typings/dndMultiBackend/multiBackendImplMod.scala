package typings.dndMultiBackend

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndMultiBackend.typesMod.MultiBackendSwitcher
import typings.dndMultiBackend.typesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiBackendImplMod {
  
  @JSImport("dnd-multi-backend/dist/cjs/MultiBackendImpl", "MultiBackendImpl")
  @js.native
  open class MultiBackendImpl protected ()
    extends StObject
       with MultiBackendSwitcher {
    def this(manager: DragDropManager) = this()
    def this(manager: DragDropManager, context: MultiBackendContext) = this()
    def this(manager: DragDropManager, context: Unit, options: MultiBackendOptions) = this()
    def this(manager: DragDropManager, context: MultiBackendContext, options: MultiBackendOptions) = this()
    
    /* private */ var `private`: Any = js.native
  }
  /* static members */
  object MultiBackendImpl {
    
    @JSImport("dnd-multi-backend/dist/cjs/MultiBackendImpl", "MultiBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("dnd-multi-backend/dist/cjs/MultiBackendImpl", "MultiBackendImpl.isSetUp")
    @js.native
    def isSetUp: Any = js.native
    inline def isSetUp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
  
  type MultiBackendContext = Any
  
  trait MultiBackendOptions extends StObject {
    
    var backends: MultiBackendPipeline
  }
  object MultiBackendOptions {
    
    inline def apply(backends: MultiBackendPipeline): MultiBackendOptions = {
      val __obj = js.Dynamic.literal(backends = backends.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiBackendOptions]
    }
    
    extension [Self <: MultiBackendOptions](x: Self) {
      
      inline def setBackends(value: MultiBackendPipeline): Self = StObject.set(x, "backends", value.asInstanceOf[js.Any])
      
      inline def setBackendsVarargs(value: MultiBackendPipelineStep*): Self = StObject.set(x, "backends", js.Array(value*))
    }
  }
  
  type MultiBackendPipeline = js.Array[MultiBackendPipelineStep]
  
  trait MultiBackendPipelineStep extends StObject {
    
    def backend(manager: DragDropManager): Backend
    def backend(manager: DragDropManager, globalContext: Any): Backend
    def backend(manager: DragDropManager, globalContext: Any, configuration: Any): Backend
    def backend(manager: DragDropManager, globalContext: Unit, configuration: Any): Backend
    @JSName("backend")
    var backend_Original: BackendFactory
    
    var id: String
    
    var options: js.UndefOr[Any] = js.undefined
    
    var preview: js.UndefOr[Boolean] = js.undefined
    
    var skipDispatchOnTransition: js.UndefOr[Boolean] = js.undefined
    
    var transition: js.UndefOr[Transition] = js.undefined
  }
  object MultiBackendPipelineStep {
    
    inline def apply(
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => Backend,
      id: String
    ): MultiBackendPipelineStep = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiBackendPipelineStep]
    }
    
    extension [Self <: MultiBackendPipelineStep](x: Self) {
      
      inline def setBackend(
        value: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[Any], /* configuration */ js.UndefOr[Any]) => Backend
      ): Self = StObject.set(x, "backend", js.Any.fromFunction3(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setSkipDispatchOnTransition(value: Boolean): Self = StObject.set(x, "skipDispatchOnTransition", value.asInstanceOf[js.Any])
      
      inline def setSkipDispatchOnTransitionUndefined: Self = StObject.set(x, "skipDispatchOnTransition", js.undefined)
      
      inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
}
