package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for number range filter controls.
  *
  * A number range filter is a slider with two thumbs that lets the user select ranges of numeric
  * values. Given a column of type number and matching options, this control filters out the rows
  * that don't match the range that was selected.
  *
  * For more details, see the Gviz
  * documentation.
  */
trait NumberRangeFilterBuilder extends StObject {
  
  def setMaxValue(maxValue: Integer): NumberRangeFilterBuilder
  
  def setMinValue(minValue: Integer): NumberRangeFilterBuilder
  
  def setOrientation(orientation: Orientation): NumberRangeFilterBuilder
  
  def setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder
  
  def setTicks(ticks: Integer): NumberRangeFilterBuilder
}
object NumberRangeFilterBuilder {
  
  @scala.inline
  def apply(
    setMaxValue: Integer => NumberRangeFilterBuilder,
    setMinValue: Integer => NumberRangeFilterBuilder,
    setOrientation: Orientation => NumberRangeFilterBuilder,
    setShowRangeValues: Boolean => NumberRangeFilterBuilder,
    setTicks: Integer => NumberRangeFilterBuilder
  ): NumberRangeFilterBuilder = {
    val __obj = js.Dynamic.literal(setMaxValue = js.Any.fromFunction1(setMaxValue), setMinValue = js.Any.fromFunction1(setMinValue), setOrientation = js.Any.fromFunction1(setOrientation), setShowRangeValues = js.Any.fromFunction1(setShowRangeValues), setTicks = js.Any.fromFunction1(setTicks))
    __obj.asInstanceOf[NumberRangeFilterBuilder]
  }
  
  @scala.inline
  implicit class NumberRangeFilterBuilderMutableBuilder[Self <: NumberRangeFilterBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetMaxValue(value: Integer => NumberRangeFilterBuilder): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValue(value: Integer => NumberRangeFilterBuilder): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientation(value: Orientation => NumberRangeFilterBuilder): Self = StObject.set(x, "setOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetShowRangeValues(value: Boolean => NumberRangeFilterBuilder): Self = StObject.set(x, "setShowRangeValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTicks(value: Integer => NumberRangeFilterBuilder): Self = StObject.set(x, "setTicks", js.Any.fromFunction1(value))
  }
}
