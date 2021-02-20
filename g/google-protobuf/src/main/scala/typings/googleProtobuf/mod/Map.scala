package typings.googleProtobuf.mod

import typings.googleProtobuf.anon.InstantiableV
import typings.googleProtobuf.mod.Map.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "Map")
@js.native
class Map[K, V] protected () extends StObject {
  def this(arr: js.Array[js.Tuple2[K, V]]) = this()
  def this(arr: js.Array[js.Tuple2[K, V]], valueCtor: InstantiableV[V]) = this()
  
  def clear(): Unit = js.native
  
  def del(key: K): Boolean = js.native
  
  def entries(): Iterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit]): Unit = js.native
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit], thisArg: js.Object): Unit = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def getEntryList(): js.Array[js.Tuple2[K, V]] = js.native
  
  def getLength(): Double = js.native
  
  def has(key: K): Boolean = js.native
  
  def keys(): Iterator[K] = js.native
  
  def set(key: K, value: V): this.type = js.native
  
  def toArray(): js.Array[js.Tuple2[K, V]] = js.native
  
  def toObject(): js.Array[js.Tuple2[K, V]] = js.native
  def toObject(includeInstance: Boolean): js.Array[js.Tuple2[K, V]] = js.native
  def toObject[VO](
    includeInstance: Boolean,
    valueToObject: js.Function2[/* includeInstance */ Boolean, /* valueWrapper */ V, VO]
  ): js.Array[js.Tuple2[K, VO]] = js.native
}
/* static members */
object Map {
  
  @JSImport("google-protobuf", "Map.fromObject")
  @js.native
  def fromObject[TK, TV](entries: js.Array[js.Tuple2[TK, TV]], valueCtor: js.Any, valueFromObject: js.Any): Map[TK, TV] = js.native
  
  // This is implemented by jspb.Map.ArrayIteratorIterable_, but that class shouldn't be exported
  @js.native
  trait Iterator[T] extends StObject {
    
    def next(): IteratorResult[T] = js.native
  }
  object Iterator {
    
    @scala.inline
    def apply[T](next: () => IteratorResult[T]): Iterator[T] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Iterator[T]]
    }
    
    @scala.inline
    implicit class IteratorMutableBuilder[Self <: Iterator[_], T] (val x: Self with Iterator[T]) extends AnyVal {
      
      @scala.inline
      def setNext(value: () => IteratorResult[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IteratorResult[T] extends StObject {
    
    var done: Boolean = js.native
    
    var value: T = js.native
  }
  object IteratorResult {
    
    @scala.inline
    def apply[T](done: Boolean, value: T): IteratorResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IteratorResult[T]]
    }
    
    @scala.inline
    implicit class IteratorResultMutableBuilder[Self <: IteratorResult[_], T] (val x: Self with IteratorResult[T]) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
