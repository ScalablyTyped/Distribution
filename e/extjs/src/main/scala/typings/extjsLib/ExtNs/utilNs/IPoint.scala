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
    adjust: (/* top */ js.UndefOr[scala.Double], /* right */ js.UndefOr[scala.Double], /* bottom */ js.UndefOr[scala.Double], /* left */ js.UndefOr[scala.Double]) => IPoint = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    constrainTo: /* targetRegion */ js.UndefOr[IPoint] => IPoint = null,
    contains: /* region */ js.UndefOr[IPoint] => scala.Boolean = null,
    copy: () => IPoint = null,
    copyFrom: /* p */ js.UndefOr[IPoint] => IPoint = null,
    equals: /* p */ js.UndefOr[js.Any] => scala.Boolean = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getOutOfBoundOffset: (/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[IPoint]) => IOffset = null,
    getOutOfBoundOffsetX: /* p */ js.UndefOr[scala.Double] => scala.Double = null,
    getOutOfBoundOffsetY: /* p */ js.UndefOr[scala.Double] => scala.Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IPoint = null,
    intersect: /* region */ js.UndefOr[IPoint] => _ = null,
    isContainedBy: /* region */ js.UndefOr[js.Any] => scala.Boolean = null,
    isOutOfBound: (/* axis */ js.UndefOr[java.lang.String], /* p */ js.UndefOr[js.Any]) => scala.Boolean = null,
    isOutOfBoundX: /* p */ js.UndefOr[scala.Double] => scala.Boolean = null,
    isOutOfBoundY: /* p */ js.UndefOr[scala.Double] => scala.Boolean = null,
    isWithin: (/* p */ js.UndefOr[js.Any], /* threshold */ js.UndefOr[js.Any]) => scala.Boolean = null,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    round: () => IPoint = null,
    roundedEquals: /* p */ js.UndefOr[js.Any] => scala.Boolean = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toString: () => java.lang.String = null,
    translate: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double]) => IRegion = null,
    translateBy: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double]) => IPoint = null,
    union: /* region */ js.UndefOr[IPoint] => IPoint = null,
    uses: extjsLib.ExtNs.Array = null
  ): IPoint = {
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
    if (isContainedBy != null) __obj.updateDynamic("isContainedBy")(js.Any.fromFunction1(isContainedBy))
    if (isOutOfBound != null) __obj.updateDynamic("isOutOfBound")(js.Any.fromFunction2(isOutOfBound))
    if (isOutOfBoundX != null) __obj.updateDynamic("isOutOfBoundX")(js.Any.fromFunction1(isOutOfBoundX))
    if (isOutOfBoundY != null) __obj.updateDynamic("isOutOfBoundY")(js.Any.fromFunction1(isOutOfBoundY))
    if (isWithin != null) __obj.updateDynamic("isWithin")(js.Any.fromFunction2(isWithin))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (round != null) __obj.updateDynamic("round")(js.Any.fromFunction0(round))
    if (roundedEquals != null) __obj.updateDynamic("roundedEquals")(js.Any.fromFunction1(roundedEquals))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (translate != null) __obj.updateDynamic("translate")(js.Any.fromFunction2(translate))
    if (translateBy != null) __obj.updateDynamic("translateBy")(js.Any.fromFunction2(translateBy))
    if (union != null) __obj.updateDynamic("union")(js.Any.fromFunction1(union))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IPoint]
  }
}

