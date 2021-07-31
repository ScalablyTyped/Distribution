package typings.extjs.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXTemplateCompiler
  extends StObject
     with IXTemplateParser {
  
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
  def apply(): IXTemplateCompiler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXTemplateCompiler]
  }
  
  @scala.inline
  implicit class IXTemplateCompilerMutableBuilder[Self <: IXTemplateCompiler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoCase(value: /* action */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doCase", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoCaseUndefined: Self = StObject.set(x, "doCase", js.undefined)
    
    @scala.inline
    def setDoElseIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doElseIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoElseIfUndefined: Self = StObject.set(x, "doElseIf", js.undefined)
    
    @scala.inline
    def setDoEnd(value: (/* type */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoEndUndefined: Self = StObject.set(x, "doEnd", js.undefined)
    
    @scala.inline
    def setDoEval(value: /* text */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doEval", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoEvalUndefined: Self = StObject.set(x, "doEval", js.undefined)
    
    @scala.inline
    def setDoExec(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doExec", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoExecUndefined: Self = StObject.set(x, "doExec", js.undefined)
    
    @scala.inline
    def setDoExpr(value: /* expr */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoExprUndefined: Self = StObject.set(x, "doExpr", js.undefined)
    
    @scala.inline
    def setDoFor(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doFor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoForEach(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doForEach", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoForEachUndefined: Self = StObject.set(x, "doForEach", js.undefined)
    
    @scala.inline
    def setDoForUndefined: Self = StObject.set(x, "doFor", js.undefined)
    
    @scala.inline
    def setDoIf(value: (/* action */ js.UndefOr[js.Any], /* actions */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "doIf", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDoIfUndefined: Self = StObject.set(x, "doIf", js.undefined)
    
    @scala.inline
    def setDoSwitch(value: /* action */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doSwitch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoSwitchUndefined: Self = StObject.set(x, "doSwitch", js.undefined)
    
    @scala.inline
    def setDoTag(value: /* tag */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doTag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoTagUndefined: Self = StObject.set(x, "doTag", js.undefined)
    
    @scala.inline
    def setDoText(value: /* text */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "doText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoTextUndefined: Self = StObject.set(x, "doText", js.undefined)
  }
}
