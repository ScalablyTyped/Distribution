package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceSettings extends StObject {
  
  /**
    * When **true**, commenting on the documents in the workspace is allowed.
    */
  var commentsAllowed: js.UndefOr[String] = js.undefined
}
object WorkspaceSettings {
  
  inline def apply(): WorkspaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceSettings] (val x: Self) extends AnyVal {
    
    inline def setCommentsAllowed(value: String): Self = StObject.set(x, "commentsAllowed", value.asInstanceOf[js.Any])
    
    inline def setCommentsAllowedUndefined: Self = StObject.set(x, "commentsAllowed", js.undefined)
  }
}
