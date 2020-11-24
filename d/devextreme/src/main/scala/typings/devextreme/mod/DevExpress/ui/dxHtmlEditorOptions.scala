package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentElementEvent
import typings.devextreme.devextremeStrings.html
import typings.devextreme.devextremeStrings.markdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditorOptions extends EditorOptions[dxHtmlEditor] {
  
  /**
    * [descr:dxHtmlEditor.Options.customizeModules]
    */
  var customizeModules: js.UndefOr[js.Function1[/* config */ js.Any, _]] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.mediaResizing]
    */
  var mediaResizing: js.UndefOr[dxHtmlEditorMediaResizing] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.mentions]
    */
  var mentions: js.UndefOr[js.Array[dxHtmlEditorMention]] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.onFocusIn]
    */
  var onFocusIn: js.UndefOr[js.Function1[/* e */ ComponentElementEvent, _]] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.onFocusOut]
    */
  var onFocusOut: js.UndefOr[js.Function1[/* e */ ComponentElementEvent, _]] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.placeholder]
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.toolbar]
    */
  var toolbar: js.UndefOr[dxHtmlEditorToolbar] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.valueType]
    */
  var valueType: js.UndefOr[html | markdown] = js.native
  
  /**
    * [descr:dxHtmlEditor.Options.variables]
    */
  var variables: js.UndefOr[dxHtmlEditorVariables] = js.native
}
object dxHtmlEditorOptions {
  
  @scala.inline
  def apply(): dxHtmlEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorOptions]
  }
  
  @scala.inline
  implicit class dxHtmlEditorOptionsOps[Self <: dxHtmlEditorOptions] (val x: Self) extends AnyVal {
    
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
    def setCustomizeModules(value: /* config */ js.Any => _): Self = this.set("customizeModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeModules: Self = this.set("customizeModules", js.undefined)
    
    @scala.inline
    def setMediaResizing(value: dxHtmlEditorMediaResizing): Self = this.set("mediaResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaResizing: Self = this.set("mediaResizing", js.undefined)
    
    @scala.inline
    def setMentionsVarargs(value: dxHtmlEditorMention*): Self = this.set("mentions", js.Array(value :_*))
    
    @scala.inline
    def setMentions(value: js.Array[dxHtmlEditorMention]): Self = this.set("mentions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMentions: Self = this.set("mentions", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnFocusIn(value: /* e */ ComponentElementEvent => _): Self = this.set("onFocusIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusIn: Self = this.set("onFocusIn", js.undefined)
    
    @scala.inline
    def setOnFocusOut(value: /* e */ ComponentElementEvent => _): Self = this.set("onFocusOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocusOut: Self = this.set("onFocusOut", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setToolbar(value: dxHtmlEditorToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setValueType(value: html | markdown): Self = this.set("valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("valueType", js.undefined)
    
    @scala.inline
    def setVariables(value: dxHtmlEditorVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
