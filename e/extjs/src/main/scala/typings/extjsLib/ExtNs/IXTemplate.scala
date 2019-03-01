package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXTemplate extends ITemplate {
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object
  		* @param out Object
  		* @param parent Object
  		* @returns Array The given out array.
  		*/
  @JSName("applyOut")
  var applyOut_IXTemplate: js.UndefOr[
    js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  /** [Config Option] (String/Array) */
  var definitions: js.UndefOr[js.Any] = js.undefined
}

object IXTemplate {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    append: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    apply: js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String] = null,
    applyOut: js.Function3[
      /* values */ js.UndefOr[js.Any], 
      /* out */ js.UndefOr[js.Any], 
      /* parent */ js.UndefOr[js.Any], 
      Array
    ] = null,
    applyTemplate: js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    compile: js.Function0[IXTemplate] = null,
    compiled: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    definitions: js.Any = null,
    disableFormats: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IXTemplate] = null,
    insertAfter: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertBefore: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    insertFirst: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    isTemplate: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    overwrite: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    requires: Array = null,
    self: IClass = null,
    set: js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[scala.Boolean], 
      IXTemplate
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IXTemplate = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (append != null) __obj.updateDynamic("append")(append)
    if (apply != null) __obj.updateDynamic("apply")(apply)
    if (applyOut != null) __obj.updateDynamic("applyOut")(applyOut)
    if (applyTemplate != null) __obj.updateDynamic("applyTemplate")(applyTemplate)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (compile != null) __obj.updateDynamic("compile")(compile)
    if (!js.isUndefined(compiled)) __obj.updateDynamic("compiled")(compiled)
    if (config != null) __obj.updateDynamic("config")(config)
    if (definitions != null) __obj.updateDynamic("definitions")(definitions)
    if (!js.isUndefined(disableFormats)) __obj.updateDynamic("disableFormats")(disableFormats)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(insertAfter)
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(insertBefore)
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(insertFirst)
    if (!js.isUndefined(isTemplate)) __obj.updateDynamic("isTemplate")(isTemplate)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (overwrite != null) __obj.updateDynamic("overwrite")(overwrite)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (set != null) __obj.updateDynamic("set")(set)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IXTemplate]
  }
}

