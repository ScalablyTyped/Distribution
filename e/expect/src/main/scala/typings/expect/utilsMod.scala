package typings.expect

import typings.std.Record
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("expect/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emptyObject(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getObjectSubset(`object`: js.Any, subset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getObjectSubset(`object`: js.Any, subset: js.Any, seenReferences: WeakMap[js.Object, Boolean]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getObjectSubset")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any], seenReferences.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getPath(`object`: Record[String, js.Any], propertyPath: String): GetPath_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[GetPath_]
  inline def getPath(`object`: Record[String, js.Any], propertyPath: js.Array[String]): GetPath_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(`object`.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[GetPath_]
  
  inline def isError(value: js.Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isOneline(expected: js.Any, received: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOneline")(expected.asInstanceOf[js.Any], received.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def iterableEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: js.Any, b: js.Any, aStack: js.Array[js.Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: js.Any, b: js.Any, aStack: js.Array[js.Any], bStack: js.Array[js.Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def iterableEquality(a: js.Any, b: js.Any, aStack: Unit, bStack: js.Array[js.Any]): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterableEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def partition[T](items: js.Array[T], predicate: js.Function1[/* arg */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("partition")(items.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[T], js.Array[T]]]
  
  inline def sparseArrayEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseArrayEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def subsetEquality(`object`: js.Any, subset: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("subsetEquality")(`object`.asInstanceOf[js.Any], subset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def typeEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("typeEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  trait GetPath_ extends StObject {
    
    var hasEndProp: js.UndefOr[Boolean] = js.undefined
    
    var lastTraversedObject: js.Any
    
    var traversedPath: js.Array[String]
    
    var value: js.UndefOr[js.Any] = js.undefined
  }
  object GetPath_ {
    
    inline def apply(lastTraversedObject: js.Any, traversedPath: js.Array[String]): GetPath_ = {
      val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPath_]
    }
    
    extension [Self <: GetPath_](x: Self) {
      
      inline def setHasEndProp(value: Boolean): Self = StObject.set(x, "hasEndProp", value.asInstanceOf[js.Any])
      
      inline def setHasEndPropUndefined: Self = StObject.set(x, "hasEndProp", js.undefined)
      
      inline def setLastTraversedObject(value: js.Any): Self = StObject.set(x, "lastTraversedObject", value.asInstanceOf[js.Any])
      
      inline def setTraversedPath(value: js.Array[String]): Self = StObject.set(x, "traversedPath", value.asInstanceOf[js.Any])
      
      inline def setTraversedPathVarargs(value: String*): Self = StObject.set(x, "traversedPath", js.Array(value :_*))
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
