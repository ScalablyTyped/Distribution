package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplateParser extends IBase {
  /** [Method] This method is called to process lt tpl case action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doCase: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl default gt */
  var doDefault: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl else gt */
  var doElse: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl elseif action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doElseIf: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl gt
  		* @param type String The type of action that is being ended.
  		* @param actions Object The other actions keyed by the attribute name (such as 'exec').
  		*/
  var doEnd: js.UndefOr[
    js.Function2[
      /* type */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process text
  		* @param text String
  		*/
  var doEval: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl exec action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name.
  		*/
  var doExec: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process expressions like  expr
  		* @param expr String The body of the expression (inside "{[" and "]}").
  		*/
  var doExpr: js.UndefOr[js.Function1[/* expr */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process lt tpl for action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doFor: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl foreach action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doForEach: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl if action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doIf: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process lt tpl switch action gt
  		* @param action String
  		* @param actions Object Other actions keyed by the attribute name (such as 'exec').
  		*/
  var doSwitch: js.UndefOr[
    js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method is called to process simple tags like tag  */
  var doTag: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] This method is called to process a piece of raw text from the tpl
  		* @param text String
  		*/
  var doText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] This method is called to process an empty lt tpl gt */
  var doTpl: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Number) */
  var level: js.UndefOr[scala.Double] = js.undefined
}

object IXTemplateParser {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    doCase: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doDefault: js.Function0[scala.Unit] = null,
    doElse: js.Function0[scala.Unit] = null,
    doElseIf: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doEnd: js.Function2[
      /* type */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doEval: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit] = null,
    doExec: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doExpr: js.Function1[/* expr */ js.UndefOr[java.lang.String], scala.Unit] = null,
    doFor: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doForEach: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doIf: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doSwitch: js.Function2[
      /* action */ js.UndefOr[java.lang.String], 
      /* actions */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    doTag: js.Function0[scala.Unit] = null,
    doText: js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit] = null,
    doTpl: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IXTemplateParser] = null,
    level: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IXTemplateParser = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (doCase != null) __obj.updateDynamic("doCase")(doCase)
    if (doDefault != null) __obj.updateDynamic("doDefault")(doDefault)
    if (doElse != null) __obj.updateDynamic("doElse")(doElse)
    if (doElseIf != null) __obj.updateDynamic("doElseIf")(doElseIf)
    if (doEnd != null) __obj.updateDynamic("doEnd")(doEnd)
    if (doEval != null) __obj.updateDynamic("doEval")(doEval)
    if (doExec != null) __obj.updateDynamic("doExec")(doExec)
    if (doExpr != null) __obj.updateDynamic("doExpr")(doExpr)
    if (doFor != null) __obj.updateDynamic("doFor")(doFor)
    if (doForEach != null) __obj.updateDynamic("doForEach")(doForEach)
    if (doIf != null) __obj.updateDynamic("doIf")(doIf)
    if (doSwitch != null) __obj.updateDynamic("doSwitch")(doSwitch)
    if (doTag != null) __obj.updateDynamic("doTag")(doTag)
    if (doText != null) __obj.updateDynamic("doText")(doText)
    if (doTpl != null) __obj.updateDynamic("doTpl")(doTpl)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IXTemplateParser]
  }
}

