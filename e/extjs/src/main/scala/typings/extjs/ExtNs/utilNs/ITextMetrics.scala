package typings.extjs.ExtNs.utilNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextMetrics extends IBase {
  /** [Method] Binds this TextMetrics instance to a new element
  		* @param el String/HTMLElement/Ext.Element The element or its ID.
  		*/
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Returns the measured height of the specified text
  		* @param text String The text to measure
  		* @returns Number height The height in pixels
  		*/
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
  		* @param text String The text to measure
  		* @returns Object An object containing the text's size {width: (width), height: (height)}
  		*/
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the measured width of the specified text
  		* @param text String The text to measure
  		* @returns Number width The width in pixels
  		*/
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], Double]] = js.undefined
  /** [Method] Sets a fixed width on the internal measurement element
  		* @param width Number The width to set on the element
  		*/
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[Double], Unit]] = js.undefined
}

object ITextMetrics {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    bind: /* el */ js.UndefOr[js.Any] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getHeight: /* text */ js.UndefOr[java.lang.String] => Double = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getSize: /* text */ js.UndefOr[java.lang.String] => _ = null,
    getWidth: /* text */ js.UndefOr[java.lang.String] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ITextMetrics = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    setFixedWidth: /* width */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITextMetrics = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bind != null) __obj.updateDynamic("bind")(js.Any.fromFunction1(bind))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1(getHeight))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1(getWidth))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFixedWidth != null) __obj.updateDynamic("setFixedWidth")(js.Any.fromFunction1(setFixedWidth))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITextMetrics]
  }
}

