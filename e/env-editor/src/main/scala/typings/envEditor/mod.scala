package typings.envEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("env-editor", "allEditors")
  @js.native
  def allEditors(): js.Array[Editor] = js.native
  
  @JSImport("env-editor", "defaultEditor")
  @js.native
  def defaultEditor(): Editor = js.native
  
  @JSImport("env-editor", "getEditor")
  @js.native
  def getEditor(editor: String): Editor = js.native
  
  @js.native
  trait Editor extends StObject {
    
    var binary: String = js.native
    
    var id: String = js.native
    
    var isTerminalEditor: Boolean = js.native
    
    var keywords: js.Array[String] = js.native
    
    var name: String = js.native
    
    var paths: js.Array[String] = js.native
  }
  object Editor {
    
    @scala.inline
    def apply(
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
    implicit class EditorMutableBuilder[Self <: Editor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTerminalEditor(value: Boolean): Self = StObject.set(x, "isTerminalEditor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
}
