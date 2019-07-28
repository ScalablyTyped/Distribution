package typings.extjs.ExtNs.drawNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends IBase {
  /** [Method] Get the blue component of the color in the range 0 255
  		* @returns Number
  		*/
  var getBlue: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the green component of the color in the range 0 255
  		* @returns Number
  		*/
  var getGreen: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @returns Number[]
  		*/
  var getHSL: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[Double], _]] = js.undefined
  /** [Method] Get the RGB values
  		* @returns Number[]
  		*/
  var getRGB: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Get the red component of the color in the range 0 255
  		* @returns Number
  		*/
  var getRed: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[Double] = js.undefined
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IColor {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getBlue: () => Double = null,
    getDarker: /* factor */ js.UndefOr[Double] => _ = null,
    getGrayscale: () => Double = null,
    getGreen: () => Double = null,
    getHSL: () => Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getLighter: /* factor */ js.UndefOr[Double] => _ = null,
    getRGB: () => Array = null,
    getRed: () => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IColor = null,
    lightnessFactor: Int | Double = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    toString: () => java.lang.String = null,
    uses: Array = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getBlue != null) __obj.updateDynamic("getBlue")(js.Any.fromFunction0(getBlue))
    if (getDarker != null) __obj.updateDynamic("getDarker")(js.Any.fromFunction1(getDarker))
    if (getGrayscale != null) __obj.updateDynamic("getGrayscale")(js.Any.fromFunction0(getGrayscale))
    if (getGreen != null) __obj.updateDynamic("getGreen")(js.Any.fromFunction0(getGreen))
    if (getHSL != null) __obj.updateDynamic("getHSL")(js.Any.fromFunction0(getHSL))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLighter != null) __obj.updateDynamic("getLighter")(js.Any.fromFunction1(getLighter))
    if (getRGB != null) __obj.updateDynamic("getRGB")(js.Any.fromFunction0(getRGB))
    if (getRed != null) __obj.updateDynamic("getRed")(js.Any.fromFunction0(getRed))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(js.Any.fromFunction0(toString))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColor]
  }
}

