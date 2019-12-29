package typings.fastbitset.fastbitsetMod

import typings.fastbitset.fastbitsetNumbers.`0`
import typings.fastbitset.fastbitsetNumbers.`1`
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fastbitset", JSImport.Namespace)
@js.native
class ^ () extends FastBitSet {
  def this(iterable: Iterable[Double]) = this()
  /** Add the value (Set the bit at `index` to `true`) */
  /* CompleteClass */
  override def add(index: Double): Unit = js.native
  /** Return an array with the set bit locations (values) */
  /* CompleteClass */
  override def array(): js.Array[Double] = js.native
  /**
    * Tries to add the value (Set the bit at `index` to `true`), returns `1` if the
    * value was added, returns `0` if the value was already present
    */
  /* CompleteClass */
  override def checkedAdd(index: Double): `1` | `0` = js.native
  /** Remove all values, reset memory usage */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Computes the difference between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  /* CompleteClass */
  override def difference(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size of the difference between this bitset and another one */
  /* CompleteClass */
  override def difference_size(otherbitmap: FastBitSet): Double = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified
    */
  /* CompleteClass */
  override def equals(otherbitmap: FastBitSet): Boolean = js.native
  /** If the value was not in the set, add it, otherwise remove it (flip bit at `index`) */
  /* CompleteClass */
  override def flip(index: Double): Unit = js.native
  /** Return an array with the set bit locations (values) */
  /* CompleteClass */
  override def forEach(fnc: js.Function1[/* index */ Double, Unit]): Unit = js.native
  /** fast function to compute the Hamming weight of a 32-bit unsigned integer */
  /* CompleteClass */
  override def hammingWeight(v: Double): Double = js.native
  /** fast function to compute the Hamming weight of four 32-bit unsigned integers */
  /* CompleteClass */
  override def hammingWeight4(v1: Double, v2: Double, v3: Double, v4: Double): Double = js.native
  /** Is the value contained in the set? Is the bit at `index` `true` or `false`? */
  /* CompleteClass */
  override def has(index: Double): Boolean = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * the current bitmap is modified  (and returned by the function)
    */
  /* CompleteClass */
  override def intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size of the intersection between this bitset and another one */
  /* CompleteClass */
  override def intersection_size(otherbitmap: FastBitSet): Double = js.native
  /**
    * Check if this bitset intersects with another one,
    * no bitmap is modified
    */
  /* CompleteClass */
  override def intersects(otherbitmap: FastBitSet): Boolean = js.native
  /** Return `true` if no bit is set */
  /* CompleteClass */
  override def isEmpty(index: Double): Boolean = js.native
  /**
    * Computes the difference between this bitset and another one,
    * a new bitmap is generated
    */
  /* CompleteClass */
  override def new_difference(otherbitmap: FastBitSet): FastBitSet = js.native
  /**
    * Computes the intersection between this bitset and another one,
    * a new bitmap is generated
    */
  /* CompleteClass */
  override def new_intersection(otherbitmap: FastBitSet): FastBitSet = js.native
  /* CompleteClass */
  override def new_union(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Set the bit at `index` to `false` */
  /* CompleteClass */
  override def remove(index: Double): Unit = js.native
  /** Resize the bitset so that we can write a value at `index` */
  /* CompleteClass */
  override def resize(index: Double): Unit = js.native
  /** How many values stored in the set? How many set bits? */
  /* CompleteClass */
  override def size(): Double = js.native
  /** Reduce the memory usage to a minimum */
  /* CompleteClass */
  override def trim(): Unit = js.native
  /**
    * Computes the union between this bitset and another one,
    * the current bitset is modified (and returned by the function)
    */
  /* CompleteClass */
  override def union(otherbitmap: FastBitSet): FastBitSet = js.native
  /** Computes the size union between this bitset and another one */
  /* CompleteClass */
  override def union_size(otherbitmap: FastBitSet): Double = js.native
}

