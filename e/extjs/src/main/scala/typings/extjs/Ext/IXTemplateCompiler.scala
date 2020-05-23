package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplateCompiler extends IXTemplateParser {
  /** [Method] This method is called to process lt tpl case action gt
    * @param action Object
    */
  @JSName("doCase")
  var doCase_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl elseif action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doElseIf")
  var doElseIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl gt
    * @param type Object
    * @param actions Object
    */
  @JSName("doEnd")
  var doEnd_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process text
    * @param text Object
    */
  @JSName("doEval")
  var doEval_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl exec action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doExec")
  var doExec_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process expressions like  expr
    * @param expr Object
    */
  @JSName("doExpr")
  var doExpr_IXTemplateCompiler: js.UndefOr[js.Function1[/* expr */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl foreach action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doForEach")
  var doForEach_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl for action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doFor")
  var doFor_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl if action gt
    * @param action Object
    * @param actions Object
    */
  @JSName("doIf")
  var doIf_IXTemplateCompiler: js.UndefOr[
    js.Function2[/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl switch action gt
    * @param action Object
    */
  @JSName("doSwitch")
  var doSwitch_IXTemplateCompiler: js.UndefOr[js.Function1[/* action */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method is called to process simple tags like tag
    * @param tag Object
    */
  @JSName("doTag")
  var doTag_IXTemplateCompiler: js.UndefOr[js.Function1[/* tag */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] XTemplateParser callouts
    * @param text Object
    */
  @JSName("doText")
  var doText_IXTemplateCompiler: js.UndefOr[js.Function1[/* text */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IXTemplateCompiler {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    doCase: /* action */ js.UndefOr[js.Any] => Unit = null,
    doDefault: () => Unit = null,
    doElse: () => Unit = null,
    doElseIf: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doEnd: (/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doEval: /* text */ js.UndefOr[js.Any] => Unit = null,
    doExec: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doExpr: /* expr */ js.UndefOr[js.Any] => Unit = null,
    doFor: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doForEach: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doIf: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit = null,
    doSwitch: /* action */ js.UndefOr[js.Any] => Unit = null,
    doTag: /* tag */ js.UndefOr[js.Any] => Unit = null,
    doText: /* text */ js.UndefOr[js.Any] => Unit = null,
    doTpl: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IXTemplateCompiler = null,
    level: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IXTemplateCompiler = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (doCase != null) __obj.updateDynamic("doCase")(js.Any.fromFunction1(doCase))
    if (doDefault != null) __obj.updateDynamic("doDefault")(js.Any.fromFunction0(doDefault))
    if (doElse != null) __obj.updateDynamic("doElse")(js.Any.fromFunction0(doElse))
    if (doElseIf != null) __obj.updateDynamic("doElseIf")(js.Any.fromFunction2(doElseIf))
    if (doEnd != null) __obj.updateDynamic("doEnd")(js.Any.fromFunction2(doEnd))
    if (doEval != null) __obj.updateDynamic("doEval")(js.Any.fromFunction1(doEval))
    if (doExec != null) __obj.updateDynamic("doExec")(js.Any.fromFunction2(doExec))
    if (doExpr != null) __obj.updateDynamic("doExpr")(js.Any.fromFunction1(doExpr))
    if (doFor != null) __obj.updateDynamic("doFor")(js.Any.fromFunction2(doFor))
    if (doForEach != null) __obj.updateDynamic("doForEach")(js.Any.fromFunction2(doForEach))
    if (doIf != null) __obj.updateDynamic("doIf")(js.Any.fromFunction2(doIf))
    if (doSwitch != null) __obj.updateDynamic("doSwitch")(js.Any.fromFunction1(doSwitch))
    if (doTag != null) __obj.updateDynamic("doTag")(js.Any.fromFunction1(doTag))
    if (doText != null) __obj.updateDynamic("doText")(js.Any.fromFunction1(doText))
    if (doTpl != null) __obj.updateDynamic("doTpl")(js.Any.fromFunction0(doTpl))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXTemplateCompiler]
  }
}

