package typings.firebaseDatabase

import typings.firebaseDatabase.changeMod.Change
import typings.firebaseDatabase.nodeFilterMod.NodeFilter
import typings.firebaseDatabase.nodeMod.Node
import typings.firebaseDatabase.operationMod.Operation
import typings.firebaseDatabase.viewCacheMod.ViewCache
import typings.firebaseDatabase.writeTreeMod.WriteTreeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewProcessorMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/ViewProcessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newViewProcessor(filter: NodeFilter): ViewProcessor = ^.asInstanceOf[js.Dynamic].applyDynamic("newViewProcessor")(filter.asInstanceOf[js.Any]).asInstanceOf[ViewProcessor]
  
  inline def viewProcessorApplyOperation(
    viewProcessor: ViewProcessor,
    oldViewCache: ViewCache,
    operation: Operation,
    writesCache: WriteTreeRef
  ): ProcessorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("viewProcessorApplyOperation")(viewProcessor.asInstanceOf[js.Any], oldViewCache.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any])).asInstanceOf[ProcessorResult]
  inline def viewProcessorApplyOperation(
    viewProcessor: ViewProcessor,
    oldViewCache: ViewCache,
    operation: Operation,
    writesCache: WriteTreeRef,
    completeCache: Node
  ): ProcessorResult = (^.asInstanceOf[js.Dynamic].applyDynamic("viewProcessorApplyOperation")(viewProcessor.asInstanceOf[js.Any], oldViewCache.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], writesCache.asInstanceOf[js.Any], completeCache.asInstanceOf[js.Any])).asInstanceOf[ProcessorResult]
  
  inline def viewProcessorAssertIndexed(viewProcessor: ViewProcessor, viewCache: ViewCache): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("viewProcessorAssertIndexed")(viewProcessor.asInstanceOf[js.Any], viewCache.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ProcessorResult extends StObject {
    
    val changes: js.Array[Change]
    
    val viewCache: ViewCache
  }
  object ProcessorResult {
    
    inline def apply(changes: js.Array[Change], viewCache: ViewCache): ProcessorResult = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], viewCache = viewCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorResult]
    }
    
    extension [Self <: ProcessorResult](x: Self) {
      
      inline def setChanges(value: js.Array[Change]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: Change*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setViewCache(value: ViewCache): Self = StObject.set(x, "viewCache", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewProcessor extends StObject {
    
    val filter: NodeFilter
  }
  object ViewProcessor {
    
    inline def apply(filter: NodeFilter): ViewProcessor = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewProcessor]
    }
    
    extension [Self <: ViewProcessor](x: Self) {
      
      inline def setFilter(value: NodeFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
}
