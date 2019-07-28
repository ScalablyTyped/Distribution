package typings.extjs.ExtNs.utilNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegion extends IBase {
  /** [Method] Modifies the current region to be adjusted by offsets
  		* @param top Number top offset
  		* @param right Number right offset
  		* @param bottom Number bottom offset
  		* @param left Number left offset
  		* @returns Ext.util.Region this
  		*/
  var adjust: js.UndefOr[
    js.Function4[
      /* top */ js.UndefOr[Double], 
      /* right */ js.UndefOr[Double], 
      /* bottom */ js.UndefOr[Double], 
      /* left */ js.UndefOr[Double], 
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
  var contains: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
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
  var equals_FIRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], Boolean]] = js.undefined
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
  var getOutOfBoundOffsetX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
  /** [Method] Get the offset amount on the y axis
  		* @param p Number the offset
  		* @returns Number
  		*/
  var getOutOfBoundOffsetY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Double]] = js.undefined
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
    js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any], Boolean]
  ] = js.undefined
  /** [Method] Check whether the offset is out of bound in the x axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundX: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Method] Check whether the offset is out of bound in the y axis
  		* @param p Number the offset
  		* @returns Boolean
  		*/
  var isOutOfBoundY: js.UndefOr[js.Function1[/* p */ js.UndefOr[Double], Boolean]] = js.undefined
  /** [Method] Round all the properties of this region
  		* @returns Ext.util.Region this This Region
  		*/
  var round: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Translate this region by the given offset amount
  		* @param x Ext.util.Offset/Object Object containing the x and y properties. Or the x value is using the two argument form.
  		* @param y Number The y value unless using an Offset object.
  		* @returns Ext.util.Region this This Region
  		*/
  var translateBy: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], this.type]] = js.undefined
  /** [Method] Returns the smallest region that contains the current AND targetRegion
  		* @param region Ext.util.Region
  		* @returns Ext.util.Region a new region
  		*/
  var union: js.UndefOr[js.Function1[/* region */ js.UndefOr[this.type], this.type]] = js.undefined
}

object IRegion {
  @scala.inline
  def apply(
    adjust: (/* top */ js.UndefOr[Double], /* right */ js.UndefOr[Double], /* bottom */ js.UndefOr[Double], /* left */ js.UndefOr[Double]) => IRegion = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    constrainTo: /* targetRegion */ js.UndefOr[IRegion] => IRegion = null,
    contains: /* region */ js.UndefOr[IRegion] => Boolean = null,
    copy: () => IRegion = null,
    copyFrom: /* p */ js.UndefOr[IRegion] => IRegion = null,
    equals: /* region */ js.UndefOr[IRegion] => Boolean = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getOutOfBoundOffset: (/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[IPoint]) => IOffset = null,
    getOutOfBoundOffsetX: /* p */ js.UndefOr[Double] => Double = null,
    getOutOfBoundOffsetY: /* p */ js.UndefOr[Double] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IRegion = null,
    intersect: /* region */ js.UndefOr[IRegion] => _ = null,
    isOutOfBound: (/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any]) => Boolean = null,
    isOutOfBoundX: /* p */ js.UndefOr[Double] => Boolean = null,
    isOutOfBoundY: /* p */ js.UndefOr[Double] => Boolean = null,
    mixins: js.Any = null,
    requires: Array = null,
    round: () => IRegion = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    translateBy: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => IRegion = null,
    union: /* region */ js.UndefOr[IRegion] => IRegion = null,
    uses: Array = null
  ): IRegion = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(js.Any.fromFunction4(adjust))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(js.Any.fromFunction1(constrainTo))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction0(copy))
    if (copyFrom != null) __obj.updateDynamic("copyFrom")(js.Any.fromFunction1(copyFrom))
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction1(equals))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getOutOfBoundOffset != null) __obj.updateDynamic("getOutOfBoundOffset")(js.Any.fromFunction2(getOutOfBoundOffset))
    if (getOutOfBoundOffsetX != null) __obj.updateDynamic("getOutOfBoundOffsetX")(js.Any.fromFunction1(getOutOfBoundOffsetX))
    if (getOutOfBoundOffsetY != null) __obj.updateDynamic("getOutOfBoundOffsetY")(js.Any.fromFunction1(getOutOfBoundOffsetY))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (intersect != null) __obj.updateDynamic("intersect")(js.Any.fromFunction1(intersect))
    if (isOutOfBound != null) __obj.updateDynamic("isOutOfBound")(js.Any.fromFunction2(isOutOfBound))
    if (isOutOfBoundX != null) __obj.updateDynamic("isOutOfBoundX")(js.Any.fromFunction1(isOutOfBoundX))
    if (isOutOfBoundY != null) __obj.updateDynamic("isOutOfBoundY")(js.Any.fromFunction1(isOutOfBoundY))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (round != null) __obj.updateDynamic("round")(js.Any.fromFunction0(round))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (translateBy != null) __obj.updateDynamic("translateBy")(js.Any.fromFunction2(translateBy))
    if (union != null) __obj.updateDynamic("union")(js.Any.fromFunction1(union))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IRegion]
  }
}

