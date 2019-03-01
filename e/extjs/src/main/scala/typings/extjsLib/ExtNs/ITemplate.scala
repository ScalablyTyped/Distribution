package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITemplate extends IBase {
  /** [Method] Applies the supplied values to the template and appends the new node s to the specified el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return an Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns an HTML fragment of this template with the specified values applied
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment
  		*/
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Appends the result of this template to the provided output array
  		* @param values Object/Array The template values. See apply.
  		* @param out Array The array to which output is pushed.
  		* @returns Array The given out array.
  		*/
  var applyOut: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] Alias for apply
  		* @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
  		* @returns String The HTML fragment
  		*/
  var applyTemplate: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.undefined
  /** [Method] Compiles the template into an internal function eliminating the RegEx overhead
  		* @returns Ext.Template this
  		*/
  var compile: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var compiled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s after el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s before el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Applies the supplied values to the template and inserts the new node s as the first child of el
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Applies the supplied values to the template and overwrites the content of el with the new node s
  		* @param el String/HTMLElement/Ext.Element The context element
  		* @param values Object/Array The template values. See applyTemplate for details.
  		* @param returnElement Boolean true to return a Ext.Element.
  		* @returns HTMLElement/Ext.Element The new node or Element
  		*/
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* values */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Sets the HTML used as the template and optionally compiles it
  		* @param html String
  		* @param compile Boolean True to compile the template.
  		* @returns Ext.Template this
  		*/
  var set: js.UndefOr[
    js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
}

object ITemplate {
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
    applyOut: js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array] = null,
    applyTemplate: js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    compile: js.Function0[ITemplate] = null,
    compiled: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    disableFormats: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITemplate] = null,
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
      ITemplate
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ITemplate = {
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
    __obj.asInstanceOf[ITemplate]
  }
}

