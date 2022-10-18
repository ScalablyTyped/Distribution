package typings.devextremeRuntime

import typings.devextremeRuntime.anon.RenderFn
import typings.devextremeRuntime.cjsInfernoHooksContainerMod.HookContainer
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoHooksBaseHooksComponentMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno-hooks/base-hooks-component", "InfernoWrapperComponent")
  @js.native
  open class InfernoWrapperComponent () extends HookContainer {
    def this(props: RenderFn) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: RenderFn, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInfernoWrapperComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfernoWrapperComponent(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MInfernoWrapperComponent(nextProps: Record[String, Any], nextState: Record[String, Any]): Boolean = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MInfernoWrapperComponent(nextProps: Record[String, Any], nextState: Record[String, Any], context: Record[String, Any]): Boolean = js.native
    
    var vDomElement: ElementWithCustomClassesData | Null = js.native
    
    def vDomUpdateClasses(): Unit = js.native
  }
  
  @js.native
  trait ElementWithCustomClassesData
    extends StObject
       with Element {
    
    var dxClasses: VDomCustomClassesData = js.native
  }
  
  trait VDomCustomClassesData extends StObject {
    
    var added: js.Array[String]
    
    var previous: js.Array[String]
    
    var removed: js.Array[String]
  }
  object VDomCustomClassesData {
    
    inline def apply(added: js.Array[String], previous: js.Array[String], removed: js.Array[String]): VDomCustomClassesData = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[VDomCustomClassesData]
    }
    
    extension [Self <: VDomCustomClassesData](x: Self) {
      
      inline def setAdded(value: js.Array[String]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: String*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setPrevious(value: js.Array[String]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousVarargs(value: String*): Self = StObject.set(x, "previous", js.Array(value*))
      
      inline def setRemoved(value: js.Array[String]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: String*): Self = StObject.set(x, "removed", js.Array(value*))
    }
  }
}
