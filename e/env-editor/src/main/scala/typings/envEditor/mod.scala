package typings.envEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("env-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allEditors(): js.Array[Editor] = ^.asInstanceOf[js.Dynamic].applyDynamic("allEditors")().asInstanceOf[js.Array[Editor]]
  
  inline def defaultEditor(): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEditor")().asInstanceOf[Editor]
  
  inline def getEditor(editor: String): Editor = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditor")(editor.asInstanceOf[js.Any]).asInstanceOf[Editor]
  
  trait Editor extends StObject {
    
    var binary: String
    
    var id: String
    
    var isTerminalEditor: Boolean
    
    var keywords: js.Array[String]
    
    var name: String
    
    var paths: js.Array[String]
  }
  object Editor {
    
    inline def apply(
      binary: String,
      id: String,
      isTerminalEditor: Boolean,
      keywords: js.Array[String],
      name: String,
      paths: js.Array[String]
    ): Editor = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Editor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Editor] (val x: Self) extends AnyVal {
      
      inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsTerminalEditor(value: Boolean): Self = StObject.set(x, "isTerminalEditor", value.asInstanceOf[js.Any])
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
}
