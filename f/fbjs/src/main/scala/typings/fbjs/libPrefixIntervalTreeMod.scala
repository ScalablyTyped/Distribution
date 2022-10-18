package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPrefixIntervalTreeMod {
  
  @JSImport("fbjs/lib/PrefixIntervalTree", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PrefixIntervalTree {
    def this(xs: js.Array[Double]) = this()
    
    /**
      * Half the size of the heap. It is also the number of non-leaf nodes, and the
      * index of the first element in the heap. Always a power of 2.
      */
    /* CompleteClass */
    var _half: Double = js.native
    
    /**
      * Binary heap
      */
    /* CompleteClass */
    var _heap: js.typedarray.Int32Array = js.native
    
    /**
      * Number of elements in the array
      */
    /* CompleteClass */
    var _size: Double = js.native
    
    /* CompleteClass */
    override def get(index: Double): Double = js.native
    
    /* CompleteClass */
    override def getSize(): Double = js.native
    
    /**
      * Returns the smallest i such that 0 <= i <= size and sumUntil(i) <= t, or
      * -1 if no such i exists.
      */
    /* CompleteClass */
    override def greatestLowerBound(t: Double): Double = js.native
    
    /**
      * Returns the smallest i such that 0 <= i <= size and sumUntil(i) < t, or
      * -1 if no such i exists.
      */
    /* CompleteClass */
    override def greatestStrictLowerBound(t: Double): Double = js.native
    
    /**
      * Returns the smallest i such that 0 <= i <= size and t < sumUntil(i), or
      * size + 1 if no such i exists.
      */
    /* CompleteClass */
    override def leastStrictUpperBound(t: Double): Double = js.native
    
    /**
      * Returns the smallest i such that 0 <= i <= size and t <= sumUntil(i), or
      * size + 1 if no such i exists.
      */
    /* CompleteClass */
    override def leastUpperBound(t: Double): Double = js.native
    
    /* CompleteClass */
    override def set(index: Double, value: Double): Unit = js.native
    
    /**
      * Returns the sum get(begin) + get(begin + 1) + ... + get(end - 1).
      */
    /* CompleteClass */
    override def sum(begin: Double, end: Double): Double = js.native
    
    /**
      * Returns the sum get(0) + get(1) + ... + get(inclusiveEnd).
      */
    /* CompleteClass */
    override def sumTo(inclusiveEnd: Double): Double = js.native
    
    /**
      * Returns the sum get(0) + get(1) + ... + get(end - 1).
      */
    /* CompleteClass */
    override def sumUntil(end: Double): Double = js.native
  }
  @JSImport("fbjs/lib/PrefixIntervalTree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def uniform(size: Double, initialValue: Double): PrefixIntervalTree = (^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(size.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[PrefixIntervalTree]
  
  trait PrefixIntervalTree extends StObject {
    
    /**
      * Half the size of the heap. It is also the number of non-leaf nodes, and the
      * index of the first element in the heap. Always a power of 2.
      */
    var _half: Double
    
    /**
      * Binary heap
      */
    var _heap: js.typedarray.Int32Array
    
    /**
      * Number of elements in the array
      */
    var _size: Double
    
    def get(index: Double): Double
    
    def getSize(): Double
    
    /**
      * Returns the smallest i such that 0 <= i <= size and sumUntil(i) <= t, or
      * -1 if no such i exists.
      */
    def greatestLowerBound(t: Double): Double
    
    /**
      * Returns the smallest i such that 0 <= i <= size and sumUntil(i) < t, or
      * -1 if no such i exists.
      */
    def greatestStrictLowerBound(t: Double): Double
    
    /**
      * Returns the smallest i such that 0 <= i <= size and t < sumUntil(i), or
      * size + 1 if no such i exists.
      */
    def leastStrictUpperBound(t: Double): Double
    
    /**
      * Returns the smallest i such that 0 <= i <= size and t <= sumUntil(i), or
      * size + 1 if no such i exists.
      */
    def leastUpperBound(t: Double): Double
    
    def set(index: Double, value: Double): Unit
    
    /**
      * Returns the sum get(begin) + get(begin + 1) + ... + get(end - 1).
      */
    def sum(begin: Double, end: Double): Double
    
    /**
      * Returns the sum get(0) + get(1) + ... + get(inclusiveEnd).
      */
    def sumTo(inclusiveEnd: Double): Double
    
    /**
      * Returns the sum get(0) + get(1) + ... + get(end - 1).
      */
    def sumUntil(end: Double): Double
  }
  object PrefixIntervalTree {
    
    inline def apply(
      _half: Double,
      _heap: js.typedarray.Int32Array,
      _size: Double,
      get: Double => Double,
      getSize: () => Double,
      greatestLowerBound: Double => Double,
      greatestStrictLowerBound: Double => Double,
      leastStrictUpperBound: Double => Double,
      leastUpperBound: Double => Double,
      set: (Double, Double) => Unit,
      sum: (Double, Double) => Double,
      sumTo: Double => Double,
      sumUntil: Double => Double
    ): PrefixIntervalTree = {
      val __obj = js.Dynamic.literal(_half = _half.asInstanceOf[js.Any], _heap = _heap.asInstanceOf[js.Any], _size = _size.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getSize = js.Any.fromFunction0(getSize), greatestLowerBound = js.Any.fromFunction1(greatestLowerBound), greatestStrictLowerBound = js.Any.fromFunction1(greatestStrictLowerBound), leastStrictUpperBound = js.Any.fromFunction1(leastStrictUpperBound), leastUpperBound = js.Any.fromFunction1(leastUpperBound), set = js.Any.fromFunction2(set), sum = js.Any.fromFunction2(sum), sumTo = js.Any.fromFunction1(sumTo), sumUntil = js.Any.fromFunction1(sumUntil))
      __obj.asInstanceOf[PrefixIntervalTree]
    }
    
    extension [Self <: PrefixIntervalTree](x: Self) {
      
      inline def setGet(value: Double => Double): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGreatestLowerBound(value: Double => Double): Self = StObject.set(x, "greatestLowerBound", js.Any.fromFunction1(value))
      
      inline def setGreatestStrictLowerBound(value: Double => Double): Self = StObject.set(x, "greatestStrictLowerBound", js.Any.fromFunction1(value))
      
      inline def setLeastStrictUpperBound(value: Double => Double): Self = StObject.set(x, "leastStrictUpperBound", js.Any.fromFunction1(value))
      
      inline def setLeastUpperBound(value: Double => Double): Self = StObject.set(x, "leastUpperBound", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSum(value: (Double, Double) => Double): Self = StObject.set(x, "sum", js.Any.fromFunction2(value))
      
      inline def setSumTo(value: Double => Double): Self = StObject.set(x, "sumTo", js.Any.fromFunction1(value))
      
      inline def setSumUntil(value: Double => Double): Self = StObject.set(x, "sumUntil", js.Any.fromFunction1(value))
      
      inline def set_half(value: Double): Self = StObject.set(x, "_half", value.asInstanceOf[js.Any])
      
      inline def set_heap(value: js.typedarray.Int32Array): Self = StObject.set(x, "_heap", value.asInstanceOf[js.Any])
      
      inline def set_size(value: Double): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    }
  }
}
