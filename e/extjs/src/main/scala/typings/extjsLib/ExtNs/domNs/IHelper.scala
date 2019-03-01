package typings
package extjsLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelper extends IAbstractHelper {
  /** [Method] Creates new DOM element s without inserting them to the document
  		* @param o Object/String The DOM object spec (and children) or raw HTML blob
  		* @returns HTMLElement The new uninserted node
  		*/
  var createDom: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], stdLib.HTMLElement]] = js.undefined
  /** [Method] Alias for markup
  		* @param spec Object The DOM object spec (and children)
  		* @returns String
  		*/
  var createHtml: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Creates a new Ext Template from the DOM object spec
  		* @param o Object The DOM object spec (and children)
  		* @returns Ext.Template The new template
  		*/
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], extjsLib.ExtNs.ITemplate]] = js.undefined
  /** [Property] (Boolean) */
  var useDom: js.UndefOr[scala.Boolean] = js.undefined
}

object IHelper {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    append: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    applyStyles: js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    createDom: js.Function1[/* o */ js.UndefOr[js.Any], stdLib.HTMLElement] = null,
    createHtml: js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String] = null,
    createTemplate: js.Function1[/* o */ js.UndefOr[js.Any], extjsLib.ExtNs.ITemplate] = null,
    extend: java.lang.String = null,
    generateStyles: js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[extjsLib.ExtNs.Array], _] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IHelper] = null,
    insertAfter: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertBefore: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertFirst: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertHtml: js.Function3[
      /* where */ js.UndefOr[java.lang.String], 
      /* el */ js.UndefOr[js.Any], 
      /* html */ js.UndefOr[java.lang.String], 
      stdLib.HTMLElement
    ] = null,
    markup: js.Function1[/* spec */ js.UndefOr[js.Any], java.lang.String] = null,
    mixins: js.Any = null,
    overwrite: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    useDom: js.UndefOr[scala.Boolean] = js.undefined,
    uses: extjsLib.ExtNs.Array = null
  ): IHelper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (append != null) __obj.updateDynamic("append")(append)
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(applyStyles)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (createDom != null) __obj.updateDynamic("createDom")(createDom)
    if (createHtml != null) __obj.updateDynamic("createHtml")(createHtml)
    if (createTemplate != null) __obj.updateDynamic("createTemplate")(createTemplate)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (generateStyles != null) __obj.updateDynamic("generateStyles")(generateStyles)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(insertFirst)
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(insertHtml)
    if (markup != null) __obj.updateDynamic("markup")(markup)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (!js.isUndefined(useDom)) __obj.updateDynamic("useDom")(useDom)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHelper]
  }
}

