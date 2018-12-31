package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPoint extends IRegion {
  /** [Method] Compare this point and another point
  		* @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with left and top properties
  		* @returns Boolean Returns whether they are equivalent
  		*/
  @JSName("equals")
  var equals_FIPoint: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Determins whether this Point contained by the passed Region Component or element
  		* @param region Ext.util.Region/Ext.Component/Ext.dom.Element/HTMLElement The rectangle to check that this Point is within.
  		* @returns Boolean
  		*/
  var isContainedBy: js.UndefOr[js.Function1[/* region */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Whether the given point is not away from this point within the given threshold amount
  		* @param p Ext.util.Point/Object The point to check with, either an instance of Ext.util.Point or an object with left and top properties
  		* @param threshold Object/Number Can be either an object with x and y properties or a number
  		* @returns Boolean
  		*/
  var isWithin: js.UndefOr[
    js.Function2[/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Compare this point with another point when the x and y values of both points are rounded
  		* @param p Ext.util.Point/Object The point to compare with, either an instance of Ext.util.Point or an object with x and y properties
  		* @returns Boolean
  		*/
  var roundedEquals: js.UndefOr[js.Function1[/* p */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Returns a human eye friendly string that represents this point useful for debugging
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIPoint: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Alias for translateBy
  		* @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
  		* @param y Number The y value unless using an Offset object.
  		* @returns Ext.util.Region this This Region
  		*/
  var translate: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], IRegion]
  ] = js.undefined
}

