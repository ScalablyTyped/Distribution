package typings
package discontinuousDashRangeLib.discontinuousDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscontinuousRange extends js.Object {
  /**
       * Adds the numbers from rangeStart to rangeEnd to the current range.
       * If rangeEnd is not defined, only rangeStart is added to the current range.
       * @param rangeStart The first number to add to the range.
       * @param rangeEnd   The last number to add to the range. Defaults to rangeStart.
       * @returns The range on which add was called. It contains the numbers from rangeStart to rangeEnd.
       */
  def add(rangeStart: scala.Double): DiscontinuousRange = js.native
  /**
       * Adds the numbers from rangeStart to rangeEnd to the current range.
       * If rangeEnd is not defined, only rangeStart is added to the current range.
       * @param rangeStart The first number to add to the range.
       * @param rangeEnd   The last number to add to the range. Defaults to rangeStart.
       * @returns The range on which add was called. It contains the numbers from rangeStart to rangeEnd.
       */
  def add(rangeStart: scala.Double, rangeEnd: scala.Double): DiscontinuousRange = js.native
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
  def index(index: scala.Double): scala.Double | scala.Null = js.native
  /**
       * Removes the numbers from rangeStart to rangeEnd to the current range.
       * If rangeEnd is not defined, only rangeStart is removed from the current range.
       * @param rangeStart The first number to remove from the range.
       * @param rangeEnd   The last number to remove from the range. Defaults to rangeStart.
       * @returns The range on which subtract was called. It does not contain the numbers from rangeStart to rangeEnd.
       */
  def subtract(rangeStart: scala.Double): DiscontinuousRange = js.native
  /**
       * Removes the numbers from rangeStart to rangeEnd to the current range.
       * If rangeEnd is not defined, only rangeStart is removed from the current range.
       * @param rangeStart The first number to remove from the range.
       * @param rangeEnd   The last number to remove from the range. Defaults to rangeStart.
       * @returns The range on which subtract was called. It does not contain the numbers from rangeStart to rangeEnd.
       */
  def subtract(rangeStart: scala.Double, rangeEnd: scala.Double): DiscontinuousRange = js.native
  /**
       * Removes rangeToRemove from the current range.
       * @param rangeToRemove The range to exclude from the current range.
       * @returns The range on which subtract was called. It contains the numbers in rangeToRemove.
       */
  def subtract(rangeToRemove: DiscontinuousRange): DiscontinuousRange = js.native
}

