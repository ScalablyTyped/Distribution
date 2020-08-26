package typings.extjs.Ext.dom

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractHelper extends IBase {
  /** [Method] Creates new DOM element s and appends them to el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var append: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Applies a style specification to an element
    * @param el String/HTMLElement The element to apply styles to
    * @param styles String/Object/Function A style specification string e.g. 'width:100px', or object in the form {width:'100px'}, or a function which returns such a specification.
    */
  var applyStyles: js.UndefOr[js.Function2[/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Converts the styles from the given object to text
    * @param styles Object The object describing the styles.
    * @param buffer String[] The output buffer.
    * @returns String/String[] If buffer is passed, it is returned. Otherwise the style string is returned.
    */
  var generateStyles: js.UndefOr[js.Function2[/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array], _]] = js.native
  /** [Method] Creates new DOM element s and inserts them after el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object The DOM object spec (and children)
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertAfter: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Creates new DOM element s and inserts them before el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertBefore: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Creates new DOM element s and inserts them as the first child of el
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var insertFirst: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  /** [Method] Inserts an HTML fragment into the DOM
    * @param where String Where to insert the html in relation to el - beforeBegin, afterBegin, beforeEnd, afterEnd. For example take the following HTML: &lt;div&gt;Contents&lt;/div&gt; Using different where values inserts element to the following places:  beforeBegin: &lt;HERE&gt;&lt;div&gt;Contents&lt;/div&gt; afterBegin: &lt;div&gt;&lt;HERE&gt;Contents&lt;/div&gt; beforeEnd: &lt;div&gt;Contents&lt;HERE&gt;&lt;/div&gt; afterEnd: &lt;div&gt;Contents&lt;/div&gt;&lt;HERE&gt;
    * @param el HTMLElement/TextNode The context element
    * @param html String The HTML fragment
    * @returns HTMLElement The new node
    */
  var insertHtml: js.UndefOr[
    js.Function3[
      /* where */ js.UndefOr[String], 
      /* el */ js.UndefOr[js.Any], 
      /* html */ js.UndefOr[String], 
      HTMLElement
    ]
  ] = js.native
  /** [Method] Returns the markup for the passed Element s config
    * @param spec Object The DOM object spec (and children)
    * @returns String
    */
  var markup: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], String]] = js.native
  /** [Method] Creates new DOM element s and overwrites the contents of el with them
    * @param el String/HTMLElement/Ext.Element The context element
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @param returnElement Boolean true to return a Ext.Element
    * @returns HTMLElement/Ext.Element The new node
    */
  var overwrite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      /* returnElement */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
}

object IAbstractHelper {
  @scala.inline
  def apply(): IAbstractHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractHelper]
  }
  @scala.inline
  implicit class IAbstractHelperOps[Self <: IAbstractHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("append", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    @scala.inline
    def setApplyStyles(value: (/* el */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any]) => Unit): Self = this.set("applyStyles", js.Any.fromFunction2(value))
    @scala.inline
    def deleteApplyStyles: Self = this.set("applyStyles", js.undefined)
    @scala.inline
    def setGenerateStyles(value: (/* styles */ js.UndefOr[js.Any], /* buffer */ js.UndefOr[Array]) => _): Self = this.set("generateStyles", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGenerateStyles: Self = this.set("generateStyles", js.undefined)
    @scala.inline
    def setInsertAfter(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertAfter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    @scala.inline
    def setInsertBefore(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertBefore", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    @scala.inline
    def setInsertFirst(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("insertFirst", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertFirst: Self = this.set("insertFirst", js.undefined)
    @scala.inline
    def setInsertHtml(
      value: (/* where */ js.UndefOr[String], /* el */ js.UndefOr[js.Any], /* html */ js.UndefOr[String]) => HTMLElement
    ): Self = this.set("insertHtml", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertHtml: Self = this.set("insertHtml", js.undefined)
    @scala.inline
    def setMarkup(value: /* spec */ js.UndefOr[js.Any] => String): Self = this.set("markup", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMarkup: Self = this.set("markup", js.undefined)
    @scala.inline
    def setOverwrite(
      value: (/* el */ js.UndefOr[js.Any], /* o */ js.UndefOr[js.Any], /* returnElement */ js.UndefOr[Boolean]) => _
    ): Self = this.set("overwrite", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOverwrite: Self = this.set("overwrite", js.undefined)
  }
  
}

