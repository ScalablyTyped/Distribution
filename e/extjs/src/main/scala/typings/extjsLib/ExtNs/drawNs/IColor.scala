package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor
  extends extjsLib.ExtNs.IBase {
  /** [Method] Get the blue component of the color in the range 0 255
  		* @returns Number
  		*/
  var getBlue: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Return a new color that is darker than this color
  		* @param factor Number Darker factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getDarker: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Returns the gray value 0 to 255 of the color
  		* @returns Number
  		*/
  var getGrayscale: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the green component of the color in the range 0 255
  		* @returns Number
  		*/
  var getGreen: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Get the equivalent HSL components of the color
  		* @returns Number[]
  		*/
  var getHSL: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Return a new color that is lighter than this color
  		* @param factor Number Lighter factor (0..1), default to 0.2
  		* @returns Object Ext.draw.Color
  		*/
  var getLighter: js.UndefOr[js.Function1[/* factor */ js.UndefOr[scala.Double], _]] = js.undefined
  /** [Method] Get the RGB values
  		* @returns Number[]
  		*/
  var getRGB: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Get the red component of the color in the range 0 255
  		* @returns Number
  		*/
  var getRed: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Config Option] (Number) */
  var lightnessFactor: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Return the color in the hex format i e
  		* @returns String
  		*/
  @JSName("toString")
  var toString_FIColor: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IColor {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getBlue: js.Function0[scala.Double] = null,
    getDarker: js.Function1[/* factor */ js.UndefOr[scala.Double], _] = null,
    getGrayscale: js.Function0[scala.Double] = null,
    getGreen: js.Function0[scala.Double] = null,
    getHSL: js.Function0[extjsLib.ExtNs.Array] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getLighter: js.Function1[/* factor */ js.UndefOr[scala.Double], _] = null,
    getRGB: js.Function0[extjsLib.ExtNs.Array] = null,
    getRed: js.Function0[scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IColor] = null,
    lightnessFactor: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toString: js.Function0[java.lang.String] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IColor = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getBlue != null) __obj.updateDynamic("getBlue")(getBlue)
    if (getDarker != null) __obj.updateDynamic("getDarker")(getDarker)
    if (getGrayscale != null) __obj.updateDynamic("getGrayscale")(getGrayscale)
    if (getGreen != null) __obj.updateDynamic("getGreen")(getGreen)
    if (getHSL != null) __obj.updateDynamic("getHSL")(getHSL)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getLighter != null) __obj.updateDynamic("getLighter")(getLighter)
    if (getRGB != null) __obj.updateDynamic("getRGB")(getRGB)
    if (getRed != null) __obj.updateDynamic("getRed")(getRed)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (lightnessFactor != null) __obj.updateDynamic("lightnessFactor")(lightnessFactor.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toString != null) __obj.updateDynamic("toString")(toString)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColor]
  }
}

