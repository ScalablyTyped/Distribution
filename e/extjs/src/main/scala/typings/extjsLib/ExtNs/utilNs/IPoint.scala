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

object IPoint {
  @scala.inline
  def apply(
    adjust: js.Function4[
      /* top */ js.UndefOr[scala.Double], 
      /* right */ js.UndefOr[scala.Double], 
      /* bottom */ js.UndefOr[scala.Double], 
      /* left */ js.UndefOr[scala.Double], 
      IPoint
    ] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    constrainTo: js.Function1[/* targetRegion */ js.UndefOr[IPoint], IPoint] = null,
    contains: js.Function1[/* region */ js.UndefOr[IPoint], scala.Boolean] = null,
    copy: js.Function0[IPoint] = null,
    copyFrom: js.Function1[/* p */ js.UndefOr[IPoint], IPoint] = null,
    equals: js.Function1[/* p */ js.UndefOr[js.Any], scala.Boolean] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getOutOfBoundOffset: js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[IPoint], IOffset] = null,
    getOutOfBoundOffsetX: js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double] = null,
    getOutOfBoundOffsetY: js.Function1[/* p */ js.UndefOr[scala.Double], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IPoint] = null,
    intersect: js.Function1[/* region */ js.UndefOr[IPoint], _] = null,
    isContainedBy: js.Function1[/* region */ js.UndefOr[js.Any], scala.Boolean] = null,
    isOutOfBound: js.Function2[/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any], scala.Boolean] = null,
    isOutOfBoundX: js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean] = null,
    isOutOfBoundY: js.Function1[/* p */ js.UndefOr[scala.Double], scala.Boolean] = null,
    isWithin: js.Function2[/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any], scala.Boolean] = null,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    round: js.Function0[IPoint] = null,
    roundedEquals: js.Function1[/* p */ js.UndefOr[js.Any], scala.Boolean] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.Function0[java.lang.String] = null,
    translate: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], IRegion] = null,
    translateBy: js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double], IPoint] = null,
    union: js.Function1[/* region */ js.UndefOr[IPoint], IPoint] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPoint = {
    val __obj = js.Dynamic.literal()
    if (adjust != null) __obj.updateDynamic("adjust")(adjust)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (constrainTo != null) __obj.updateDynamic("constrainTo")(constrainTo)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (copy != null) __obj.updateDynamic("copy")(copy)
    if (copyFrom != null) __obj.updateDynamic("copyFrom")(copyFrom)
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getOutOfBoundOffset != null) __obj.updateDynamic("getOutOfBoundOffset")(getOutOfBoundOffset)
    if (getOutOfBoundOffsetX != null) __obj.updateDynamic("getOutOfBoundOffsetX")(getOutOfBoundOffsetX)
    if (getOutOfBoundOffsetY != null) __obj.updateDynamic("getOutOfBoundOffsetY")(getOutOfBoundOffsetY)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (intersect != null) __obj.updateDynamic("intersect")(intersect)
    if (isContainedBy != null) __obj.updateDynamic("isContainedBy")(isContainedBy)
    if (isOutOfBound != null) __obj.updateDynamic("isOutOfBound")(isOutOfBound)
    if (isOutOfBoundX != null) __obj.updateDynamic("isOutOfBoundX")(isOutOfBoundX)
    if (isOutOfBoundY != null) __obj.updateDynamic("isOutOfBoundY")(isOutOfBoundY)
    if (isWithin != null) __obj.updateDynamic("isWithin")(isWithin)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (round != null) __obj.updateDynamic("round")(round)
    if (roundedEquals != null) __obj.updateDynamic("roundedEquals")(roundedEquals)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (translate != null) __obj.updateDynamic("translate")(translate)
    if (translateBy != null) __obj.updateDynamic("translateBy")(translateBy)
    if (union != null) __obj.updateDynamic("union")(union)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPoint]
  }
}

