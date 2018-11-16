package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.draw.Draw")
@js.native
class Draw () extends js.Object

@JSGlobal("Ext.draw.Draw")
@js.native
object Draw extends js.Object {
  /** [Property] (Ext.Class) */
  var self: extjsLib.ExtNs.IClass = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  /** [Method] Call the original method that was previously overridden with override Ext define My Cat  constructor functi
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(): js.Any = js.native
  /** [Method] Returns the initial configuration passed to constructor when instantiating this class
  		* @param name String Name of the config option to return.
  		* @returns Object/Mixed The full config object or a single config value when name parameter specified.
  		*/
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(): extjsLib.ExtNs.IBase = js.native
  /** [Method] Initialize configuration for this class
  		* @param config Object
  		* @returns Ext.Base this
  		*/
  def initConfig(config: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param stepsMax Number The maximum number of ticks
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDate(): js.Any = js.native
  /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param stepsMax Number The maximum number of ticks
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDate(from: js.Any): js.Any = js.native
  /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param stepsMax Number The maximum number of ticks
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDate(from: js.Any, to: js.Any): js.Any = js.native
  /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param stepsMax Number The maximum number of ticks
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: scala.Double): js.Any = js.native
  /** [Method] snapEndsByDate is a utility method to deduce an appropriate tick configuration for the data set of given feature
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param stepsMax Number The maximum number of ticks
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDate(from: js.Any, to: js.Any, stepsMax: scala.Double, lockEnds: scala.Boolean): js.Any = js.native
  /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDateAndStep(): js.Any = js.native
  /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDateAndStep(from: js.Any): js.Any = js.native
  /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDateAndStep(from: js.Any, to: js.Any): js.Any = js.native
  /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: extjsLib.ExtNs.Array): js.Any = js.native
  /** [Method] snapEndsByDateAndStep is a utility method to deduce an appropriate tick configuration for the data set of given featu
  		* @param from Date The minimum value in the data
  		* @param to Date The maximum value in the data
  		* @param step Array An array with two components: The first is the unit of the step (day, month, year, etc). The second is the number of units for the step (1, 2, etc.). If the number is an integer, it represents the number of units for the step ([Ext.Date.DAY, 2] means "Every other day"). If the number is a fraction, it represents the number of steps per unit ([Ext.Date.DAY, 1/2] means "Twice a day"). If the unit is the month, the steps may be adjusted depending on the month. For instance [Ext.Date.MONTH, 1/3], which means "Three times a month", generates steps on the 1st, the 10th and the 20th of every month regardless of whether a month has 28 days or 31 days. The steps are generated as follows: - [Ext.Date.MONTH, n]: on the current date every 'n' months, maxed to the number of days in the month. - [Ext.Date.MONTH, 1/2]: on the 1st and 15th of every month. - [Ext.Date.MONTH, 1/3]: on the 1st, 10th and 20th of every month. - [Ext.Date.MONTH, 1/4]: on the 1st, 8th, 15th and 22nd of every month.
  		* @param lockEnds Boolean If true, the 'from' and 'to' parameters will be used as fixed end values  and will not be adjusted
  		* @returns Object The calculated step and ends info; properties are: - from: The result start value, which may be lower than the original start value - to: The result end value, which may be higher than the original end value - step: The fixed value size of each step, or undefined if the steps are not fixed. - steps: The number of steps if the steps are fixed, or an array of step values. NOTE: Even when the steps have a fixed value, they may not divide the from/to range perfectly evenly; there may be a smaller distance between the last step and the end value than between prior steps, particularly when the endsLocked param is true. Therefore it is best to not use the steps result when finding the axis tick points, instead use the step, to, and from to find the correct point for each tick.
  		*/
  def snapEndsByDateAndStep(from: js.Any, to: js.Any, step: extjsLib.ExtNs.Array, lockEnds: scala.Boolean): js.Any = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): extjsLib.ExtNs.IClass = js.native
}

