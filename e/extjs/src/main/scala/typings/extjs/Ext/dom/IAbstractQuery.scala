package typings.extjs.Ext.dom

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractQuery extends IBase {
  /** [Method] Returns true if the passed element s match the passed simple selector e g
  		* @param el String/HTMLElement/Array An element id, element or array of elements
  		* @param selector String The simple selector to test
  		* @returns Boolean
  		*/
  var is: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String], Boolean]
  ] = js.undefined
  /** [Method] Selects a group of elements
  		* @param selector String The selector/xpath query (can be a comma separated list of selectors)
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
  		*/
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any], Array]
  ] = js.undefined
  /** [Method] Selects a single element
  		* @param selector String The selector/xpath query
  		* @param root HTMLElement/String The start of the query (defaults to document).
  		* @returns HTMLElement The DOM element which matched the selector.
  		*/
  var selectNode: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[java.lang.String], 
      /* root */ js.UndefOr[js.Any], 
      HTMLElement
    ]
  ] = js.undefined
}

object IAbstractQuery {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAbstractQuery = null,
    is: (/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[java.lang.String]) => Boolean = null,
    mixins: js.Any = null,
    requires: Array = null,
    select: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any]) => Array = null,
    selectNode: (/* selector */ js.UndefOr[java.lang.String], /* root */ js.UndefOr[js.Any]) => HTMLElement = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstractQuery = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction2(is))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (selectNode != null) __obj.updateDynamic("selectNode")(js.Any.fromFunction2(selectNode))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbstractQuery]
  }
}

