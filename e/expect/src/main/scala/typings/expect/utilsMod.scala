package typings.expect

import typings.std.Record
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("expect/build/utils", "emptyObject")
  @js.native
  def emptyObject(obj: js.Any): Boolean = js.native
  
  @JSImport("expect/build/utils", "getObjectSubset")
  @js.native
  def getObjectSubset(`object`: js.Any, subset: js.Any): js.Any = js.native
  @JSImport("expect/build/utils", "getObjectSubset")
  @js.native
  def getObjectSubset(`object`: js.Any, subset: js.Any, seenReferences: WeakMap[js.Object, Boolean]): js.Any = js.native
  
  @JSImport("expect/build/utils", "getPath")
  @js.native
  def getPath(`object`: Record[String, _], propertyPath: String): GetPath_ = js.native
  @JSImport("expect/build/utils", "getPath")
  @js.native
  def getPath(`object`: Record[String, _], propertyPath: js.Array[String]): GetPath_ = js.native
  
  @JSImport("expect/build/utils", "isError")
  @js.native
  def isError(value: js.Any): /* is std.Error */ Boolean = js.native
  
  @JSImport("expect/build/utils", "isOneline")
  @js.native
  def isOneline(expected: js.Any, received: js.Any): Boolean = js.native
  
  @JSImport("expect/build/utils", "iterableEquality")
  @js.native
  def iterableEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = js.native
  @JSImport("expect/build/utils", "iterableEquality")
  @js.native
  def iterableEquality(a: js.Any, b: js.Any, aStack: js.UndefOr[scala.Nothing], bStack: js.Array[_]): js.UndefOr[Boolean] = js.native
  @JSImport("expect/build/utils", "iterableEquality")
  @js.native
  def iterableEquality(a: js.Any, b: js.Any, aStack: js.Array[_]): js.UndefOr[Boolean] = js.native
  @JSImport("expect/build/utils", "iterableEquality")
  @js.native
  def iterableEquality(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): js.UndefOr[Boolean] = js.native
  
  @JSImport("expect/build/utils", "partition")
  @js.native
  def partition[T](items: js.Array[T], predicate: js.Function1[/* arg */ T, Boolean]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  
  @JSImport("expect/build/utils", "sparseArrayEquality")
  @js.native
  def sparseArrayEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = js.native
  
  @JSImport("expect/build/utils", "subsetEquality")
  @js.native
  def subsetEquality(`object`: js.Any, subset: js.Any): js.UndefOr[Boolean] = js.native
  
  @JSImport("expect/build/utils", "typeEquality")
  @js.native
  def typeEquality(a: js.Any, b: js.Any): js.UndefOr[Boolean] = js.native
  
  @js.native
  trait GetPath_ extends StObject {
    
    var hasEndProp: js.UndefOr[Boolean] = js.native
    
    var lastTraversedObject: js.Any = js.native
    
    var traversedPath: js.Array[String] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object GetPath_ {
    
    @scala.inline
    def apply(lastTraversedObject: js.Any, traversedPath: js.Array[String]): GetPath_ = {
      val __obj = js.Dynamic.literal(lastTraversedObject = lastTraversedObject.asInstanceOf[js.Any], traversedPath = traversedPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPath_]
    }
    
    @scala.inline
    implicit class GetPath_MutableBuilder[Self <: GetPath_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasEndProp(value: Boolean): Self = StObject.set(x, "hasEndProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasEndPropUndefined: Self = StObject.set(x, "hasEndProp", js.undefined)
      
      @scala.inline
      def setLastTraversedObject(value: js.Any): Self = StObject.set(x, "lastTraversedObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraversedPath(value: js.Array[String]): Self = StObject.set(x, "traversedPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraversedPathVarargs(value: String*): Self = StObject.set(x, "traversedPath", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
