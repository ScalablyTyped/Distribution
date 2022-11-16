package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTextEditor[TProperties]
  extends StObject
     with Editor[TProperties] {
  
  /**
    * Removes focus from the input element.
    */
  def blur(): Unit = js.native
  
  /**
    * Gets an instance of a custom action button.
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
}
object dxTextEditor {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type Properties = dxTextEditorOptions[TextEditorInstance]
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TextEditorInstance = devextreme.devextreme.DevExpress.ui.dxTextEditor<devextreme.devextreme.DevExpress.ui.dxTextEditor.Properties>
  }}}
  to avoid circular code involving: 
  - devextreme.devextreme.DevExpress.ui.dxTextEditor.Properties
  - devextreme.devextreme.DevExpress.ui.dxTextEditor.TextEditorInstance
  */
  @js.native
  trait TextEditorInstance
    extends StObject
       with dxTextEditor[Properties]
}
