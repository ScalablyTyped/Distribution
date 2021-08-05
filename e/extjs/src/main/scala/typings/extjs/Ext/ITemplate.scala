package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplate
  extends StObject
     with IBase {
  
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
      js.Any
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
  var compiled: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var disableFormats: js.UndefOr[Boolean] = js.undefined
  
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
      js.Any
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
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
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
      /* returnElement */ js.UndefOr[Boolean], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Property] (Boolean) */
  var isTemplate: js.UndefOr[Boolean] = js.undefined
  
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
      js.Any
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
      /* compile */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.undefined
}
object ITemplate {
  
  inline def apply(): ITemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplate]
  }
  
  extension [Self <: ITemplate](x: Self) {
    
    inline def setAppend(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "append", js.Any.fromFunction3(value))
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setApply(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setApplyOut(value: (/* values */ js.UndefOr[js.Any], /* out */ js.UndefOr[Array]) => Array): Self = StObject.set(x, "applyOut", js.Any.fromFunction2(value))
    
    inline def setApplyOutUndefined: Self = StObject.set(x, "applyOut", js.undefined)
    
    inline def setApplyTemplate(value: /* values */ js.UndefOr[js.Any] => java.lang.String): Self = StObject.set(x, "applyTemplate", js.Any.fromFunction1(value))
    
    inline def setApplyTemplateUndefined: Self = StObject.set(x, "applyTemplate", js.undefined)
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setCompile(value: () => ITemplate): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
    
    inline def setCompiledUndefined: Self = StObject.set(x, "compiled", js.undefined)
    
    inline def setDisableFormats(value: Boolean): Self = StObject.set(x, "disableFormats", value.asInstanceOf[js.Any])
    
    inline def setDisableFormatsUndefined: Self = StObject.set(x, "disableFormats", js.undefined)
    
    inline def setInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertAfter", js.Any.fromFunction3(value))
    
    inline def setInsertAfterUndefined: Self = StObject.set(x, "insertAfter", js.undefined)
    
    inline def setInsertBefore(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertBefore", js.Any.fromFunction3(value))
    
    inline def setInsertBeforeUndefined: Self = StObject.set(x, "insertBefore", js.undefined)
    
    inline def setInsertFirst(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "insertFirst", js.Any.fromFunction3(value))
    
    inline def setInsertFirstUndefined: Self = StObject.set(x, "insertFirst", js.undefined)
    
    inline def setIsTemplate(value: Boolean): Self = StObject.set(x, "isTemplate", value.asInstanceOf[js.Any])
    
    inline def setIsTemplateUndefined: Self = StObject.set(x, "isTemplate", js.undefined)
    
    inline def setOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* values */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => js.Any
    ): Self = StObject.set(x, "overwrite", js.Any.fromFunction3(value))
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setSet(value: (/* html */ js.UndefOr[java.lang.String], /* compile */ js.UndefOr[Boolean]) => ITemplate): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
