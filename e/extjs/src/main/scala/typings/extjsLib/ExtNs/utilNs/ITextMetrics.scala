package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextMetrics
  extends extjsLib.ExtNs.IBase {
  /** [Method] Binds this TextMetrics instance to a new element
  		* @param el String/HTMLElement/Ext.Element The element or its ID.
  		*/
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the measured height of the specified text
  		* @param text String The text to measure
  		* @returns Number height The height in pixels
  		*/
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
  		* @param text String The text to measure
  		* @returns Object An object containing the text's size {width: (width), height: (height)}
  		*/
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the measured width of the specified text
  		* @param text String The text to measure
  		* @returns Number width The width in pixels
  		*/
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Sets a fixed width on the internal measurement element
  		* @param width Number The width to set on the element
  		*/
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

object ITextMetrics {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    bind: js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getHeight: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getSize: js.Function1[/* text */ js.UndefOr[java.lang.String], _] = null,
    getWidth: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITextMetrics] = null,
    mixins: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setFixedWidth: js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ITextMetrics = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getHeight != null) __obj.updateDynamic("getHeight")(getHeight)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getSize != null) __obj.updateDynamic("getSize")(getSize)
    if (getWidth != null) __obj.updateDynamic("getWidth")(getWidth)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFixedWidth != null) __obj.updateDynamic("setFixedWidth")(setFixedWidth)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITextMetrics]
  }
}

