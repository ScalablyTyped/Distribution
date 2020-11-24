package typings.fastbitset.mod

import typings.fastbitset.fastbitsetNumbers.`0`
import typings.fastbitset.fastbitsetNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastBitSet extends js.Object {
  
  /** Add the value (Set the bit at `index` to `true`) */
  def add(index: Double): Unit = js.native
  
  /** Return an array with the set bit locations (values) */
  def array(): js.Array[Double] = js.native
  
  /**
    * Tries to add the value (Set the bit at `index` to `true`), returns `1` if the
    * value was added, returns `0` if the value was already present
    */
  def checkedAdd(index: Double): `1` | `0` = js.native
  
  /** Remove all values, reset memory usage */
  def clear(): Unit = js.native
  
  /**
    * Computes the difference between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def difference(otherbitmap: FastBitSet): FastBitSet = js.native
  
  /** Computes the size of the difference between this bitset and another one */
  def difference_size(otherbitmap: FastBitSet): Double = js.native
  
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified
    */
  def equals(otherbitmap: FastBitSet): Boolean = js.native
  
  /** If the value was not in the set, add it, otherwise remove it (flip bit at `index`) */
  def flip(index: Double): Unit = js.native
  
  /** Return an array with the set bit locations (values) */
  def forEach(fnc: js.Function1[/* index */ Double, Unit]): Unit = js.native
  
  /** fast function to compute the Hamming weight of a 32-bit unsigned integer */
  def hammingWeight(v: Double): Double = js.native
  
  /** fast function to compute the Hamming weight of four 32-bit unsigned integers */
  def hammingWeight4(v1: Double, v2: Double, v3: Double, v4: Double): Double = js.native
  
  /** Is the value contained in the set? Is the bit at `index` `true` or `false`? */
  def has(index: Double): Boolean = js.native
  
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified  (and returned by the function)
    */
  def intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  
  /** Computes the size of the intersection between this bitset and another one */
  def intersection_size(otherbitmap: FastBitSet): Double = js.native
  
  /**
    * Check if this bitset intersects with another one,
    * no bitmap is modified
    */
  def intersects(otherbitmap: FastBitSet): Boolean = js.native
  
  /** Return `true` if no bit is set */
  def isEmpty(index: Double): Boolean = js.native
  
  /**
    * Computes the difference between this bitset and another one,
    * a new bitmap is generated
    */
  def new_difference(otherbitmap: FastBitSet): FastBitSet = js.native
  
  /**
    * Computes the intersection between this bitset and another one,
    * a new bitmap is generated
    */
  def new_intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  
  def new_union(otherbitmap: FastBitSet): FastBitSet = js.native
  
  /** Set the bit at `index` to `false` */
  def remove(index: Double): Unit = js.native
  
  /** Resize the bitset so that we can write a value at `index` */
  def resize(index: Double): Unit = js.native
  
  /** How many values stored in the set? How many set bits? */
  def size(): Double = js.native
  
  /** Reduce the memory usage to a minimum */
  def trim(): Unit = js.native
  
  /**
    * Computes the union between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  def union(otherbitmap: FastBitSet): FastBitSet = js.native
  
  /** Computes the size union between this bitset and another one */
  def union_size(otherbitmap: FastBitSet): Double = js.native
}
object FastBitSet {
  
  @scala.inline
  def apply(
    add: Double => Unit,
    array: () => js.Array[Double],
    checkedAdd: Double => `1` | `0`,
    clear: () => Unit,
    difference: FastBitSet => FastBitSet,
    difference_size: FastBitSet => Double,
    equals: FastBitSet => Boolean,
    flip: Double => Unit,
    forEach: js.Function1[/* index */ Double, Unit] => Unit,
    hammingWeight: Double => Double,
    hammingWeight4: (Double, Double, Double, Double) => Double,
    has: Double => Boolean,
    intersection: FastBitSet => FastBitSet,
    intersection_size: FastBitSet => Double,
    intersects: FastBitSet => Boolean,
    isEmpty: Double => Boolean,
    new_difference: FastBitSet => FastBitSet,
    new_intersection: FastBitSet => FastBitSet,
    new_union: FastBitSet => FastBitSet,
    remove: Double => Unit,
    resize: Double => Unit,
    size: () => Double,
    trim: () => Unit,
    union: FastBitSet => FastBitSet,
    union_size: FastBitSet => Double
  ): FastBitSet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = js.Any.fromFunction0(array), checkedAdd = js.Any.fromFunction1(checkedAdd), clear = js.Any.fromFunction0(clear), difference = js.Any.fromFunction1(difference), difference_size = js.Any.fromFunction1(difference_size), equals = js.Any.fromFunction1(equals), flip = js.Any.fromFunction1(flip), forEach = js.Any.fromFunction1(forEach), hammingWeight = js.Any.fromFunction1(hammingWeight), hammingWeight4 = js.Any.fromFunction4(hammingWeight4), has = js.Any.fromFunction1(has), intersection = js.Any.fromFunction1(intersection), intersection_size = js.Any.fromFunction1(intersection_size), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction1(isEmpty), new_difference = js.Any.fromFunction1(new_difference), new_intersection = js.Any.fromFunction1(new_intersection), new_union = js.Any.fromFunction1(new_union), remove = js.Any.fromFunction1(remove), resize = js.Any.fromFunction1(resize), size = js.Any.fromFunction0(size), trim = js.Any.fromFunction0(trim), union = js.Any.fromFunction1(union), union_size = js.Any.fromFunction1(union_size))
    __obj.asInstanceOf[FastBitSet]
  }
  
  @scala.inline
  implicit class FastBitSetOps[Self <: FastBitSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Double => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setArray(value: () => js.Array[Double]): Self = this.set("array", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckedAdd(value: Double => `1` | `0`): Self = this.set("checkedAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDifference(value: FastBitSet => FastBitSet): Self = this.set("difference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDifference_size(value: FastBitSet => Double): Self = this.set("difference_size", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: FastBitSet => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFlip(value: Double => Unit): Self = this.set("flip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForEach(value: js.Function1[/* index */ Double, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHammingWeight(value: Double => Double): Self = this.set("hammingWeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHammingWeight4(value: (Double, Double, Double, Double) => Double): Self = this.set("hammingWeight4", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHas(value: Double => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersection(value: FastBitSet => FastBitSet): Self = this.set("intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersection_size(value: FastBitSet => Double): Self = this.set("intersection_size", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersects(value: FastBitSet => Boolean): Self = this.set("intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: Double => Boolean): Self = this.set("isEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNew_difference(value: FastBitSet => FastBitSet): Self = this.set("new_difference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNew_intersection(value: FastBitSet => FastBitSet): Self = this.set("new_intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNew_union(value: FastBitSet => FastBitSet): Self = this.set("new_union", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResize(value: Double => Unit): Self = this.set("resize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrim(value: () => Unit): Self = this.set("trim", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnion(value: FastBitSet => FastBitSet): Self = this.set("union", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnion_size(value: FastBitSet => Double): Self = this.set("union_size", js.Any.fromFunction1(value))
  }
}
