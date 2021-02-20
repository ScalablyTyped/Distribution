package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.ActiveTabChanged event that concerns manipulations on tabs.
  */
@js.native
trait ASPxClientHtmlEditorTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name that uniquely identifies an editor tab.
    */
  var name: String = js.native
}
object ASPxClientHtmlEditorTabEventArgs {
  
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorTabEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTabEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorTabEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorTabEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
