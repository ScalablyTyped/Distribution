package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentPublish extends StObject {
  
  /**
    * A unique ID for the Salesforce object.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * An array of userIds that are mentioned directly in the body of a comment.
    */
  var mentions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies the text that is shown in the dropdown list.
    */
  var text: js.UndefOr[String] = js.undefined
  
  var threadAnchorKeys: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The unique identifier for the comment thread.
    */
  var threadId: js.UndefOr[String] = js.undefined
  
  var visibleTo: js.UndefOr[js.Array[String]] = js.undefined
}
object CommentPublish {
  
  inline def apply(): CommentPublish = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentPublish]
  }
  
  extension [Self <: CommentPublish](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThreadAnchorKeys(value: StringDictionary[String]): Self = StObject.set(x, "threadAnchorKeys", value.asInstanceOf[js.Any])
    
    inline def setThreadAnchorKeysUndefined: Self = StObject.set(x, "threadAnchorKeys", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
    
    inline def setVisibleTo(value: js.Array[String]): Self = StObject.set(x, "visibleTo", value.asInstanceOf[js.Any])
    
    inline def setVisibleToUndefined: Self = StObject.set(x, "visibleTo", js.undefined)
    
    inline def setVisibleToVarargs(value: String*): Self = StObject.set(x, "visibleTo", js.Array(value*))
  }
}
