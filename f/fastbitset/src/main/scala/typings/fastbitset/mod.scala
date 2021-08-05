package typings.fastbitset

import typings.fastbitset.fastbitsetNumbers.`0`
import typings.fastbitset.fastbitsetNumbers.`1`
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastbitset", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with FastBitSet {
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
  
  trait FastBitSet extends StObject {
    
    /** Add the value (Set the bit at `index` to `true`) */
    def add(index: Double): Unit
    
    /** Return an array with the set bit locations (values) */
    def array(): js.Array[Double]
    
    /**
      * Tries to add the value (Set the bit at `index` to `true`), returns `1` if the
      * value was added, returns `0` if the value was already present
      */
    def checkedAdd(index: Double): `1` | `0`
    
    /** Remove all values, reset memory usage */
    def clear(): Unit
    
    /**
      * Computes the difference between this bitset and another one,
      * the current bitset is modified (and returned by the function)
      */
    def difference(otherbitmap: FastBitSet): FastBitSet
    
    /** Computes the size of the difference between this bitset and another one */
    def difference_size(otherbitmap: FastBitSet): Double
    
    /**
      * Computes the intersection between this bitset and another one,
      * the current bitmap is modified
      */
    def equals(otherbitmap: FastBitSet): Boolean
    
    /** If the value was not in the set, add it, otherwise remove it (flip bit at `index`) */
    def flip(index: Double): Unit
    
    /** Return an array with the set bit locations (values) */
    def forEach(fnc: js.Function1[/* index */ Double, Unit]): Unit
    
    /** fast function to compute the Hamming weight of a 32-bit unsigned integer */
    def hammingWeight(v: Double): Double
    
    /** fast function to compute the Hamming weight of four 32-bit unsigned integers */
    def hammingWeight4(v1: Double, v2: Double, v3: Double, v4: Double): Double
    
    /** Is the value contained in the set? Is the bit at `index` `true` or `false`? */
    def has(index: Double): Boolean
    
    /**
      * Computes the intersection between this bitset and another one,
      * the current bitmap is modified  (and returned by the function)
      */
    def intersection(otherbitmap: FastBitSet): FastBitSet
    
    /** Computes the size of the intersection between this bitset and another one */
    def intersection_size(otherbitmap: FastBitSet): Double
    
    /**
      * Check if this bitset intersects with another one,
      * no bitmap is modified
      */
    def intersects(otherbitmap: FastBitSet): Boolean
    
    /** Return `true` if no bit is set */
    def isEmpty(index: Double): Boolean
    
    /**
      * Computes the difference between this bitset and another one,
      * a new bitmap is generated
      */
    def new_difference(otherbitmap: FastBitSet): FastBitSet
    
    /**
      * Computes the intersection between this bitset and another one,
      * a new bitmap is generated
      */
    def new_intersection(otherbitmap: FastBitSet): FastBitSet
    
    def new_union(otherbitmap: FastBitSet): FastBitSet
    
    /** Set the bit at `index` to `false` */
    def remove(index: Double): Unit
    
    /** Resize the bitset so that we can write a value at `index` */
    def resize(index: Double): Unit
    
    /** How many values stored in the set? How many set bits? */
    def size(): Double
    
    /** Reduce the memory usage to a minimum */
    def trim(): Unit
    
    /**
      * Computes the union between this bitset and another one,
      * the current bitset is modified (and returned by the function)
      */
    def union(otherbitmap: FastBitSet): FastBitSet
    
    /** Computes the size union between this bitset and another one */
    def union_size(otherbitmap: FastBitSet): Double
  }
  object FastBitSet {
    
    inline def apply(
      add: Double => Unit,
      array: () => js.Array[Double],
      checkedAdd: Double => `1` | `0`,
      clear: () => Unit,
      difference: FastBitSet => FastBitSet,
      difference_size: FastBitSet => Double,
      equals_ : FastBitSet => Boolean,
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
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), array = js.Any.fromFunction0(array), checkedAdd = js.Any.fromFunction1(checkedAdd), clear = js.Any.fromFunction0(clear), difference = js.Any.fromFunction1(difference), difference_size = js.Any.fromFunction1(difference_size), flip = js.Any.fromFunction1(flip), forEach = js.Any.fromFunction1(forEach), hammingWeight = js.Any.fromFunction1(hammingWeight), hammingWeight4 = js.Any.fromFunction4(hammingWeight4), has = js.Any.fromFunction1(has), intersection = js.Any.fromFunction1(intersection), intersection_size = js.Any.fromFunction1(intersection_size), intersects = js.Any.fromFunction1(intersects), isEmpty = js.Any.fromFunction1(isEmpty), new_difference = js.Any.fromFunction1(new_difference), new_intersection = js.Any.fromFunction1(new_intersection), new_union = js.Any.fromFunction1(new_union), remove = js.Any.fromFunction1(remove), resize = js.Any.fromFunction1(resize), size = js.Any.fromFunction0(size), trim = js.Any.fromFunction0(trim), union = js.Any.fromFunction1(union), union_size = js.Any.fromFunction1(union_size))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[FastBitSet]
    }
    
    extension [Self <: FastBitSet](x: Self) {
      
      inline def setAdd(value: Double => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setArray(value: () => js.Array[Double]): Self = StObject.set(x, "array", js.Any.fromFunction0(value))
      
      inline def setCheckedAdd(value: Double => `1` | `0`): Self = StObject.set(x, "checkedAdd", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setDifference(value: FastBitSet => FastBitSet): Self = StObject.set(x, "difference", js.Any.fromFunction1(value))
      
      inline def setDifference_size(value: FastBitSet => Double): Self = StObject.set(x, "difference_size", js.Any.fromFunction1(value))
      
      inline def setEquals_(value: FastBitSet => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setFlip(value: Double => Unit): Self = StObject.set(x, "flip", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function1[/* index */ Double, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHammingWeight(value: Double => Double): Self = StObject.set(x, "hammingWeight", js.Any.fromFunction1(value))
      
      inline def setHammingWeight4(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "hammingWeight4", js.Any.fromFunction4(value))
      
      inline def setHas(value: Double => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setIntersection(value: FastBitSet => FastBitSet): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
      
      inline def setIntersection_size(value: FastBitSet => Double): Self = StObject.set(x, "intersection_size", js.Any.fromFunction1(value))
      
      inline def setIntersects(value: FastBitSet => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: Double => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      inline def setNew_difference(value: FastBitSet => FastBitSet): Self = StObject.set(x, "new_difference", js.Any.fromFunction1(value))
      
      inline def setNew_intersection(value: FastBitSet => FastBitSet): Self = StObject.set(x, "new_intersection", js.Any.fromFunction1(value))
      
      inline def setNew_union(value: FastBitSet => FastBitSet): Self = StObject.set(x, "new_union", js.Any.fromFunction1(value))
      
      inline def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setResize(value: Double => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setTrim(value: () => Unit): Self = StObject.set(x, "trim", js.Any.fromFunction0(value))
      
      inline def setUnion(value: FastBitSet => FastBitSet): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
      
      inline def setUnion_size(value: FastBitSet => Double): Self = StObject.set(x, "union_size", js.Any.fromFunction1(value))
    }
  }
}
