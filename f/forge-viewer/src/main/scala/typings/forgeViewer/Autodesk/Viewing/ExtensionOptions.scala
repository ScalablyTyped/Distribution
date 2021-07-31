package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var defaultModelStructureTitle: String
  
  var extensions: js.Array[String]
  
  var startOnInitialize: Boolean
  
  var viewableName: String
}
object ExtensionOptions {
  
  @scala.inline
  def apply(
    defaultModelStructureTitle: String,
    extensions: js.Array[String],
    startOnInitialize: Boolean,
    viewableName: String
  ): ExtensionOptions = {
    val __obj = js.Dynamic.literal(defaultModelStructureTitle = defaultModelStructureTitle.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], startOnInitialize = startOnInitialize.asInstanceOf[js.Any], viewableName = viewableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionOptions]
  }
  
  @scala.inline
  implicit class ExtensionOptionsMutableBuilder[Self <: ExtensionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultModelStructureTitle(value: String): Self = StObject.set(x, "defaultModelStructureTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setStartOnInitialize(value: Boolean): Self = StObject.set(x, "startOnInitialize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewableName(value: String): Self = StObject.set(x, "viewableName", value.asInstanceOf[js.Any])
  }
}
