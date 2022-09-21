package typings.devextremeRuntime

import typings.devextremeRuntime.effectMod.InfernoEffect
import typings.inferno.mod.Component
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseComponentMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/base_component", "BaseInfernoComponent")
  @js.native
  open class BaseInfernoComponent[P, S] () extends Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
    
    var _pendingContext: Any = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MBaseInfernoComponent(_underscore: Any, context: Any): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MBaseInfernoComponent(nextProps: P, nextState: S): Boolean = js.native
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno/base_component", "InfernoComponent")
  @js.native
  open class InfernoComponent[P, S] () extends BaseInfernoComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
    
    var _effects: js.Array[InfernoEffect] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInfernoComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfernoComponent(): Unit = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MInfernoComponent(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInfernoComponent(): Unit = js.native
    
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: P): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: P, _nextState: S): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: P, _nextState: S, _context: Any): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: P, _nextState: Unit, _context: Any): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: Unit, _nextState: S): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: Unit, _nextState: S, _context: Any): Unit = js.native
    @JSName("componentWillUpdate")
    def componentWillUpdate_MInfernoComponent(_nextProps: Unit, _nextState: Unit, _context: Any): Unit = js.native
    
    def createEffects(): js.Array[InfernoEffect] = js.native
    
    def destroyEffects(): Unit = js.native
    
    def updateEffects(): Unit = js.native
  }
  
  @JSImport("@devextreme/runtime/cjs/inferno/base_component", "InfernoWrapperComponent")
  @js.native
  open class InfernoWrapperComponent[P, S] () extends InfernoComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MInfernoWrapperComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfernoWrapperComponent(): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MInfernoWrapperComponent(nextProps: P, nextState: S): Boolean = js.native
    
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
