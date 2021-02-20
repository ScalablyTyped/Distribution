package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A GitSourceContext denotes a particular revision in a third party Git
  * repository (e.g. GitHub).
  */
@js.native
trait SchemaGitSourceContext extends StObject {
  
  /**
    * Git commit hash. required.
    */
  var revisionId: js.UndefOr[String] = js.native
  
  /**
    * Git repository URL.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGitSourceContext {
  
  @scala.inline
  def apply(): SchemaGitSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGitSourceContext]
  }
  
  @scala.inline
  implicit class SchemaGitSourceContextMutableBuilder[Self <: SchemaGitSourceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
