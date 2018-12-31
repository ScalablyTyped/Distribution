package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICartesianChart
  extends extjsLib.ExtNs.chartNs.seriesNs.ISeries {
  /** [Config Option] (String/String[]) */
  var axis: js.UndefOr[js.Any] = js.undefined
  /** [Method] Iterates over a given record s values for each of this series s yFields executing a given function for each value
  		* @param record Ext.data.Model
  		* @param fn Function
  		* @param scope Object
  		*/
  var eachYValue: js.UndefOr[
    js.Function3[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Calculate the min and max values for this series s xField
  		* @returns Array [min, max]
  		*/
  var getMinMaxXValues: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Calculate the min and max values for this series s yField s
  		* @returns Array [min, max]
  		*/
  var getMinMaxYValues: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns an array of functions each of which returns the value of the yField corresponding to function s index in the
  		* @returns Array array of accessor functions
  		*/
  var getYValueAccessors: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the number of yField values taking into account fields combined via legend drag drop
  		* @returns Number
  		*/
  var getYValueCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (String) */
  var xField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/String[]) */
  var yField: js.UndefOr[js.Any] = js.undefined
}

