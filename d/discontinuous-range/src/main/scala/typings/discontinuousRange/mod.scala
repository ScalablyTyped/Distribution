package typings.discontinuousRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("discontinuous-range", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DiscontinuousRange {
    /**
      * Creates a discontinuous range at rangeStart, and ending at
      * rangeEnd. If rangeEnd is not specified, a range containing
      * only rangeStart is created.
      * @param rangeStart The start of the range to create.
      * @param rangeEnd   The end of the range to create. Defaults to rangeStart.
      */
    def this(rangeStart: Double) = this()
    def this(rangeStart: Double, rangeEnd: Double) = this()
  }
  
  @js.native
  trait DiscontinuousRange extends StObject {
    
    /**
      * Adds the numbers from rangeStart to rangeEnd to the current range.
      * If rangeEnd is not defined, only rangeStart is added to the current range.
      * @param rangeStart The first number to add to the range.
      * @param rangeEnd   The last number to add to the range. Defaults to rangeStart.
      * @returns The range on which add was called. It contains the numbers from rangeStart to rangeEnd.
      */
    def add(rangeStart: Double): DiscontinuousRange = js.native
    def add(rangeStart: Double, rangeEnd: Double): DiscontinuousRange = js.native
    /**
      * Adds a range to the current range.
      * @param rangeToAdd The range to union with the current range.
      * @returns The range on which add was called. It contains the numbers in rangeToAdd.
      */
    def add(rangeToAdd: DiscontinuousRange): DiscontinuousRange = js.native
    
    /**
      * Returns the number in the discontinuous range at the specified index.
      * @param index The index to lookup a number.
      * @returns A number in the range. null if index is greater than the number of elements in the range.
      */
    def index(index: Double): Double | Null = js.native
    
    /**
      * Removes the numbers from rangeStart to rangeEnd to the current range.
      * If rangeEnd is not defined, only rangeStart is removed from the current range.
      * @param rangeStart The first number to remove from the range.
      * @param rangeEnd   The last number to remove from the range. Defaults to rangeStart.
      * @returns The range on which subtract was called. It does not contain the numbers from rangeStart to rangeEnd.
      */
    def subtract(rangeStart: Double): DiscontinuousRange = js.native
    def subtract(rangeStart: Double, rangeEnd: Double): DiscontinuousRange = js.native
    /**
      * Removes rangeToRemove from the current range.
      * @param rangeToRemove The range to exclude from the current range.
      * @returns The range on which subtract was called. It contains the numbers in rangeToRemove.
      */
    def subtract(rangeToRemove: DiscontinuousRange): DiscontinuousRange = js.native
  }
}
