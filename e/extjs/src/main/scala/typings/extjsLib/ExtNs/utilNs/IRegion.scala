package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRegion
  extends extjsLib.ExtNs.IBase {
  /** [Method] Modifies the current region to be adjusted by offsets
  		* @param top Number top offset
  		* @param right Number right offset
  		* @param bottom Number bottom offset
  		* @param left Number left offset
  		* @returns Ext.util.Region this
  		*/
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[scala.Double], 
      /* right */ js.UndefOr[scala.Double], 
      /* bottom */ js.UndefOr[scala.Double], 
      /* left */ js.UndefOr[scala.Double], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Modifies the current region to be constrained to the targetRegion
  		* @param targetRegion Ext.util.Region
  		* @returns Ext.util.Region this
  		*/
  var constrainTo: js.UndefOr[js.Function1[/* targetRegion */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Checks if this region completely contains the region that is passed in
  		* @param region Ext.util.Region
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Create a copy of this Region
  		* @returns Ext.util.Region
  		*/
  var copy: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Copy the values of another Region to this Region
  		* @param p Ext.util.Region The region to copy from.
  		* @returns Ext.util.Region This Region
  		*/
  var copyFrom: js.UndefOr[js.Function1[/* p */ js.UndefOr[this.type], this.type]] = js.undefined
  /** [Method] Check whether this region is equivalent to the given region
  		* @param region Ext.util.Region The region to compare with
  		* @returns Boolean
  		*/
  @JSName("equals")
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], scala.Boolean]] = js.undefined
  /** [Method] Get the offset amount of a point outside the region
  		* @param axis String
  		* @param p Ext.util.Point the point
  		* @returns Ext.util.Offset
  		*/
  var getOutOfBoundOffset: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[IPoint], IOffset]
  ] = js.undefined
  /** [Method] Get the offset amount on the x axis
  		* @param p Number the offset
  		* @returns Number
  		*/
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Get the offset amount on the y axis
  		* @param p Number the offset
  		* @returns Number
  		*/
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double]] = js.undefined
  /** [Method] Checks if this region intersects the region passed in
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region/Boolean Returns the intersected region or false if there is no intersection.
  		*/
  var intersect: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], _]] = js.undefined
  /** [Method] Check whether the point  offset is out of bound
  		* @param axis String
  		* @param p Ext.util.Point/Number the point / offset
  		* @returns Boolean
  		*/
  var isOutOfBound: js.UndefOr[
    js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** [Method] Check whether the offset is out of bound in the x axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean]] = js.undefined
  /** [Method] Check whether the offset is out of bound in the y axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean]] = js.undefined
  /** [Method] Round all the properties of this region
  		* @returns Ext.util.Region this This Region
  		*/
  var round: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Translate this region by the given offset amount
  		* @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
  		* @param y Number The y value unless using an Offset object.
  		* @returns Ext.util.Region this This Region
  		*/
  var translateBy: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], this.type]
  ] = js.undefined
  /** [Method] Returns the smallest region that contains the current AND targetRegion
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region a new region
  		*/
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.undefined
}

