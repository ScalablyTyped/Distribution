package typings.extjs.Ext.dom

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.ITemplate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelper extends IAbstractHelper {
  /** [Method] Creates new DOM element s without inserting them to the document
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @returns HTMLElement The new uninserted node
  		*/
  var createDom: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], HTMLElement]] = js.undefined
  /** [Method] Alias for markup
  		* @param spec Object The DOM object spec (and children)
  		* @returns String
  		*/
  var createHtml: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Creates a new Ext Template from the DOM object spec
  		* @param o Object The DOM object spec (and children)
  		* @returns Ext.Template The new template
  		*/
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.undefined
  /** [Property] (Boolean) */
  var useDom: js.UndefOr[Boolean] = js.undefined
}

object IHelper {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    append: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _ = null,
    applyStyles: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    createDom: /* o */ js.UndefOr[js.Any] => HTMLElement = null,
    createHtml: /* spec */ js.UndefOr[js.Any] => java.lang.String = null,
    createTemplate: /* o */ js.UndefOr[js.Any] => ITemplate = null,
    extend: java.lang.String = null,
    generateStyles: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IHelper = null,
    insertAfter: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _ = null,
    insertBefore: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _ = null,
    insertFirst: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _ = null,
    insertHtml: (/* where */ js.UndefOr[java.lang.String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[java.lang.String]) => HTMLElement = null,
    markup: /* spec */ js.UndefOr[js.Any] => java.lang.String = null,
    mixins: js.Any = null,
    overwrite: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _ = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    useDom: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IHelper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (append != null) __obj.updateDynamic("append")(js.Any.fromFunction3(append))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction2(applyStyles))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (createDom != null) __obj.updateDynamic("createDom")(js.Any.fromFunction1(createDom))
    if (createHtml != null) __obj.updateDynamic("createHtml")(js.Any.fromFunction1(createHtml))
    if (createTemplate != null) __obj.updateDynamic("createTemplate")(js.Any.fromFunction1(createTemplate))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (generateStyles != null) __obj.updateDynamic("generateStyles")(js.Any.fromFunction2(generateStyles))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction3(insertAfter))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction3(insertBefore))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction3(insertFirst))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3(insertHtml))
    if (markup != null) __obj.updateDynamic("markup")(js.Any.fromFunction1(markup))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (overwrite != null) __obj.updateDynamic("overwrite")(js.Any.fromFunction3(overwrite))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(useDom)) __obj.updateDynamic("useDom")(useDom)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHelper]
  }
}

