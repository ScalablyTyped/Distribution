package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegerBufferSetMod {
  
  @JSImport("fbjs/lib/IntegerBufferSet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IntegerBufferSet {
    
    /* CompleteClass */
    override def _cleanHeap(/*object*/
    heap: Any): Unit = js.native
    
    /* CompleteClass */
    override def _cleanHeaps(): Unit = js.native
    
    /* CompleteClass */
    override def _greaterComparator(/*object*/
    lhs: Any, /*object*/
    rhs: Any): Boolean = js.native
    
    /* CompleteClass */
    override def _pushToHeaps(/*number*/
    position: Double, /*number*/
    value: Double): Unit = js.native
    
    /* CompleteClass */
    override def _recreateHeaps(): Unit = js.native
    
    /* CompleteClass */
    override def _smallerComparator(/*object*/
    lhs: Any, /*object*/
    rhs: Any): Boolean = js.native
    
    /* CompleteClass */
    override def getNewPositionForValue(/*number*/
    value: Double): Double = js.native
    
    /* CompleteClass */
    override def getSize(): Double = js.native
    
    /* CompleteClass */
    override def getValuePosition(/*number*/
    value: Double): Double = js.native
    
    /* CompleteClass */
    override def replaceFurthestValuePosition(/*number*/
    lowValue: Double, /*number*/
    highValue: Double, /*number*/
    newValue: Double): js.UndefOr[Double | Null] = js.native
  }
  
  trait IntegerBufferSet extends StObject {
    
    def _cleanHeap(/*object*/
    heap: Any): Unit
    
    def _cleanHeaps(): Unit
    
    def _greaterComparator(/*object*/
    lhs: Any, /*object*/
    rhs: Any): Boolean
    
    def _pushToHeaps(/*number*/
    position: Double, /*number*/
    value: Double): Unit
    
    def _recreateHeaps(): Unit
    
    def _smallerComparator(/*object*/
    lhs: Any, /*object*/
    rhs: Any): Boolean
    
    def getNewPositionForValue(/*number*/
    value: Double): Double
    
    def getSize(): Double
    
    def getValuePosition(/*number*/
    value: Double): Double
    
    def replaceFurthestValuePosition(/*number*/
    lowValue: Double, /*number*/
    highValue: Double, /*number*/
    newValue: Double): js.UndefOr[Double | Null]
  }
  object IntegerBufferSet {
    
    inline def apply(
      _cleanHeap: Any => Unit,
      _cleanHeaps: () => Unit,
      _greaterComparator: (Any, Any) => Boolean,
      _pushToHeaps: (Double, Double) => Unit,
      _recreateHeaps: () => Unit,
      _smallerComparator: (Any, Any) => Boolean,
      getNewPositionForValue: Double => Double,
      getSize: () => Double,
      getValuePosition: Double => Double,
      replaceFurthestValuePosition: (Double, Double, Double) => js.UndefOr[Double | Null]
    ): IntegerBufferSet = {
      val __obj = js.Dynamic.literal(_cleanHeap = js.Any.fromFunction1(_cleanHeap), _cleanHeaps = js.Any.fromFunction0(_cleanHeaps), _greaterComparator = js.Any.fromFunction2(_greaterComparator), _pushToHeaps = js.Any.fromFunction2(_pushToHeaps), _recreateHeaps = js.Any.fromFunction0(_recreateHeaps), _smallerComparator = js.Any.fromFunction2(_smallerComparator), getNewPositionForValue = js.Any.fromFunction1(getNewPositionForValue), getSize = js.Any.fromFunction0(getSize), getValuePosition = js.Any.fromFunction1(getValuePosition), replaceFurthestValuePosition = js.Any.fromFunction3(replaceFurthestValuePosition))
      __obj.asInstanceOf[IntegerBufferSet]
    }
    
    extension [Self <: IntegerBufferSet](x: Self) {
      
      inline def setGetNewPositionForValue(value: Double => Double): Self = StObject.set(x, "getNewPositionForValue", js.Any.fromFunction1(value))
      
      inline def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetValuePosition(value: Double => Double): Self = StObject.set(x, "getValuePosition", js.Any.fromFunction1(value))
      
      inline def setReplaceFurthestValuePosition(value: (Double, Double, Double) => js.UndefOr[Double | Null]): Self = StObject.set(x, "replaceFurthestValuePosition", js.Any.fromFunction3(value))
      
      inline def set_cleanHeap(value: Any => Unit): Self = StObject.set(x, "_cleanHeap", js.Any.fromFunction1(value))
      
      inline def set_cleanHeaps(value: () => Unit): Self = StObject.set(x, "_cleanHeaps", js.Any.fromFunction0(value))
      
      inline def set_greaterComparator(value: (Any, Any) => Boolean): Self = StObject.set(x, "_greaterComparator", js.Any.fromFunction2(value))
      
      inline def set_pushToHeaps(value: (Double, Double) => Unit): Self = StObject.set(x, "_pushToHeaps", js.Any.fromFunction2(value))
      
      inline def set_recreateHeaps(value: () => Unit): Self = StObject.set(x, "_recreateHeaps", js.Any.fromFunction0(value))
      
      inline def set_smallerComparator(value: (Any, Any) => Boolean): Self = StObject.set(x, "_smallerComparator", js.Any.fromFunction2(value))
    }
  }
}
