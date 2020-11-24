package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait NumberRangeFilterBuilder extends js.Object {
  
  def setMaxValue(maxValue: Integer): NumberRangeFilterBuilder = js.native
  
  def setMinValue(minValue: Integer): NumberRangeFilterBuilder = js.native
  
  def setOrientation(orientation: Orientation): NumberRangeFilterBuilder = js.native
  
  def setShowRangeValues(showRangeValues: Boolean): NumberRangeFilterBuilder = js.native
  
  def setTicks(ticks: Integer): NumberRangeFilterBuilder = js.native
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
  implicit class NumberRangeFilterBuilderOps[Self <: NumberRangeFilterBuilder] (val x: Self) extends AnyVal {
    
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
    def setSetMaxValue(value: Integer => NumberRangeFilterBuilder): Self = this.set("setMaxValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinValue(value: Integer => NumberRangeFilterBuilder): Self = this.set("setMinValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOrientation(value: Orientation => NumberRangeFilterBuilder): Self = this.set("setOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetShowRangeValues(value: Boolean => NumberRangeFilterBuilder): Self = this.set("setShowRangeValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTicks(value: Integer => NumberRangeFilterBuilder): Self = this.set("setTicks", js.Any.fromFunction1(value))
  }
}
