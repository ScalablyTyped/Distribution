package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Returns an HTML fragment of this template with the specified values applied
    * @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
    * @returns String The HTML fragment
    */
  @JSName("apply")
  var apply: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Appends the result of this template to the provided output array
    * @param values Object/Array The template values. See apply.
    * @param out Array The array to which output is pushed.
    * @returns Array The given out array.
    */
  var applyOut: js.UndefOr[
    js.Function2[/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array], Array]
  ] = js.native
  /** [Method] Alias for apply
    * @param values Object/Array The template values. Can be an array if your params are numeric:  var tpl = new Ext.Template('Name: {0}, Age: {1}'); tpl.apply(['John', 25]); or an object:  var tpl = new Ext.Template('Name: {name}, Age: {age}'); tpl.apply({name: 'John', age: 25});
    * @returns String The HTML fragment
    */
  var applyTemplate: js.UndefOr[js.Function1[/* values */ js.UndefOr[js.Any], java.lang.String]] = js.native
  /** [Method] Compiles the template into an internal function eliminating the RegEx overhead
    * @returns Ext.Template this
    */
  var compile: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var compiled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[Boolean] = js.native
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
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
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
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
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
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[Boolean] = js.native
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
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Sets the HTML used as the template and optionally compiles it
    * @param html String
    * @param compile Boolean True to compile the template.
    * @returns Ext.Template this
    */
  var set: js.UndefOr[
    js.Function2[
      /* html */ js.UndefOr[java.lang.String], 
      /* compile */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
}

object ITemplate {
  @scala.inline
  def apply(): ITemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplate]
  }
  @scala.inline
  implicit class ITemplateOps[Self <: ITemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("append", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setApply(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = this.set("apply", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    @scala.inline
    def setApplyOut(value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array]) => Array): Self = this.set("applyOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteApplyOut: Self = this.set("applyOut", js.undefined)
    @scala.inline
    def setApplyTemplate(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = this.set("applyTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteApplyTemplate: Self = this.set("applyTemplate", js.undefined)
    @scala.inline
    def setCompile(value: () => ITemplate): Self = this.set("compile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    @scala.inline
    def setCompiled(value: Boolean): Self = this.set("compiled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    @scala.inline
    def setDisableFormats(value: Boolean): Self = this.set("disableFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFormats: Self = this.set("disableFormats", js.undefined)
    @scala.inline
    def setInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertAfter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    @scala.inline
    def setInsertBefore(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertBefore", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setInsertFirst(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertFirst", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    @scala.inline
    def setIsTemplate(value: Boolean): Self = this.set("isTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTemplate: Self = this.set("isTemplate", js.undefined)
    @scala.inline
    def setOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("overwrite", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
    @scala.inline
    def setSet(value: (/* html */ js.UndefOr[java.lang.String], /* compile */ js.UndefOr[Boolean]) => ITemplate): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
  
}

