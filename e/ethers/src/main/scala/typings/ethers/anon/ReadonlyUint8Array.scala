package typings.ethers.anon

import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Uint8Array> */
trait ReadonlyUint8Array extends StObject {
  
  val BYTES_PER_ELEMENT: Double
  
  def at(index: Double): js.UndefOr[Double]
  
  val buffer: ArrayBufferLike
  
  val byteLength: Double
  
  val byteOffset: Double
  
  def copyWithin(target: Double, start: Double): this.type
  
  def entries(): IterableIterator[js.Tuple2[Double, Double]]
  
  def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
  
  def fill(value: Double): this.type
  
  def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): js.typedarray.Uint8Array
  
  def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double]
  
  def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double
  
  def findLast[S /* <: Double */](
    predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, /* is S */ Boolean]
  ): js.UndefOr[S]
  
  def findLastIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Double
  
  def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit
  
  def includes(searchElement: Double): Boolean
  
  def indexOf(searchElement: Double): Double
  
  def join(): String
  
  def keys(): IterableIterator[Double]
  
  def lastIndexOf(searchElement: Double): Double
  
  val length: Double
  
  def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): js.typedarray.Uint8Array
  
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double
  
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double
  
  def reverse(): js.typedarray.Uint8Array
  
  def set(array: ArrayLike[Double]): Unit
  
  def slice(): js.typedarray.Uint8Array
  
  def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Any]): Boolean
  
  def sort(): this.type
  
  def subarray(): js.typedarray.Uint8Array
  
  def values(): IterableIterator[Double]
}
object ReadonlyUint8Array {
  
  inline def apply(
    BYTES_PER_ELEMENT: Double,
    at: Double => js.UndefOr[Double],
    buffer: ArrayBufferLike,
    byteLength: Double,
    byteOffset: Double,
    copyWithin: (Double, Double) => ReadonlyUint8Array,
    entries: () => IterableIterator[js.Tuple2[Double, Double]],
    every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Boolean,
    fill: Double => ReadonlyUint8Array,
    filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => js.typedarray.Uint8Array,
    find: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Boolean] => js.UndefOr[Double],
    findIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Boolean] => Double,
    findLast: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, /* is S */ Boolean] => js.UndefOr[Any],
    findLastIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Double,
    forEach: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Unit] => Unit,
    includes: Double => Boolean,
    indexOf: Double => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: Double => Double,
    length: Double,
    map: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Double] => js.typedarray.Uint8Array,
    reduce: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      ReadonlyUint8Array, 
      Double
    ] => Double,
    reduceRight: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      ReadonlyUint8Array, 
      Double
    ] => Double,
    reverse: () => js.typedarray.Uint8Array,
    set: ArrayLike[Double] => Unit,
    slice: () => js.typedarray.Uint8Array,
    some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Boolean,
    sort: () => ReadonlyUint8Array,
    subarray: () => js.typedarray.Uint8Array,
    values: () => IterableIterator[Double]
  ): ReadonlyUint8Array = {
    val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], at = js.Any.fromFunction1(at), buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), findLast = js.Any.fromFunction1(findLast), findLastIndex = js.Any.fromFunction1(findLastIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyUint8Array]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyUint8Array] (val x: Self) extends AnyVal {
    
    inline def setAt(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    inline def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
    
    inline def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
    
    inline def setCopyWithin(value: (Double, Double) => ReadonlyUint8Array): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
    
    inline def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
    
    inline def setEvery(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
    
    inline def setFill(value: Double => ReadonlyUint8Array): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
    
    inline def setFilter(
      value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => js.typedarray.Uint8Array
    ): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFind(
      value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Boolean] => js.UndefOr[Double]
    ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setFindIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Boolean] => Double): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
    
    inline def setFindLast(
      value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, /* is S */ Boolean] => js.UndefOr[Any]
    ): Self = StObject.set(x, "findLast", js.Any.fromFunction1(value))
    
    inline def setFindLastIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Double): Self = StObject.set(x, "findLastIndex", js.Any.fromFunction1(value))
    
    inline def setForEach(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setIncludes(value: Double => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
    
    inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    inline def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
    
    inline def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    
    inline def setLastIndexOf(value: Double => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMap(
      value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Double] => js.typedarray.Uint8Array
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyUint8Array, 
          Double
        ] => Double
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
    
    inline def setReduceRight(
      value: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyUint8Array, 
          Double
        ] => Double
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
    
    inline def setReverse(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
    
    inline def setSet(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setSlice(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
    
    inline def setSome(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyUint8Array, Any] => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    
    inline def setSort(value: () => ReadonlyUint8Array): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
    
    inline def setSubarray(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "subarray", js.Any.fromFunction0(value))
    
    inline def setValues(value: () => IterableIterator[Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
