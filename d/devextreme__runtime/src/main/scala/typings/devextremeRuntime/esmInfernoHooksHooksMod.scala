package typings.devextremeRuntime

import typings.devextremeRuntime.anon.DefaultValueId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoHooksHooksMod {
  
  @JSImport("@devextreme/runtime/esm/inferno-hooks/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCallback[T /* <: js.Function1[/* repeated */ scala.Nothing, Any] */](fn: T, dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useContext(consumer: DefaultValueId): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(consumer.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useEffect(fn: js.Function0[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def useEffect(fn: js.Function0[Any], dependencies: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def useImperativeHandle(ref: Any, init: js.Function0[Any], dependencies: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useMemo[T](fn: js.Function0[T], dependencies: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(fn.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useRef[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[Any]
  inline def useRef[T](initialValue: T): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  type Dispatch[A] = js.Function1[/* value */ A, Unit]
  
  trait Hook extends StObject {
    
    @JSName("$setState")
    def $setState(setter: Any): Any
    
    var dependencies: js.UndefOr[Double | js.Array[Any]] = js.undefined
    
    var didMount: Any
    
    var dispose: Any
    
    var effect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var id: String | Double
    
    var isNew: Boolean
    
    var newDeps: js.UndefOr[Double | js.Array[Any]] = js.undefined
    
    var value: Any
  }
  object Hook {
    
    inline def apply(
      $setState: Any => Any,
      didMount: Any,
      dispose: Any,
      id: String | Double,
      isNew: Boolean,
      value: Any
    ): Hook = {
      val __obj = js.Dynamic.literal($setState = js.Any.fromFunction1($setState), didMount = didMount.asInstanceOf[js.Any], dispose = dispose.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isNew = isNew.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hook]
    }
    
    extension [Self <: Hook](x: Self) {
      
      inline def set$setState(value: Any => Any): Self = StObject.set(x, "$setState", js.Any.fromFunction1(value))
      
      inline def setDependencies(value: Double | js.Array[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: Any*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDidMount(value: Any): Self = StObject.set(x, "didMount", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: Any): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setEffect(value: () => Unit): Self = StObject.set(x, "effect", js.Any.fromFunction0(value))
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsNew(value: Boolean): Self = StObject.set(x, "isNew", value.asInstanceOf[js.Any])
      
      inline def setNewDeps(value: Double | js.Array[Any]): Self = StObject.set(x, "newDeps", value.asInstanceOf[js.Any])
      
      inline def setNewDepsUndefined: Self = StObject.set(x, "newDeps", js.undefined)
      
      inline def setNewDepsVarargs(value: Any*): Self = StObject.set(x, "newDeps", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])
}
