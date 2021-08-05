package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A SourceContext referring to a Gerrit project.
  */
trait SchemaGerritSourceContext extends StObject {
  
  /**
    * An alias, which may be a branch or tag.
    */
  var aliasContext: js.UndefOr[SchemaAliasContext] = js.undefined
  
  /**
    * The name of an alias (branch, tag, etc.).
    */
  var aliasName: js.UndefOr[String] = js.undefined
  
  /**
    * The full project name within the host. Projects may be nested, so
    * &quot;project/subproject&quot; is a valid project name. The &quot;repo
    * name&quot; is hostURI/project.
    */
  var gerritProject: js.UndefOr[String] = js.undefined
  
  /**
    * The URI of a running Gerrit instance.
    */
  var hostUri: js.UndefOr[String] = js.undefined
  
  /**
    * A revision (commit) ID.
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object SchemaGerritSourceContext {
  
  inline def apply(): SchemaGerritSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGerritSourceContext]
  }
  
  extension [Self <: SchemaGerritSourceContext](x: Self) {
    
    inline def setAliasContext(value: SchemaAliasContext): Self = StObject.set(x, "aliasContext", value.asInstanceOf[js.Any])
    
    inline def setAliasContextUndefined: Self = StObject.set(x, "aliasContext", js.undefined)
    
    inline def setAliasName(value: String): Self = StObject.set(x, "aliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "aliasName", js.undefined)
    
    inline def setGerritProject(value: String): Self = StObject.set(x, "gerritProject", value.asInstanceOf[js.Any])
    
    inline def setGerritProjectUndefined: Self = StObject.set(x, "gerritProject", js.undefined)
    
    inline def setHostUri(value: String): Self = StObject.set(x, "hostUri", value.asInstanceOf[js.Any])
    
    inline def setHostUriUndefined: Self = StObject.set(x, "hostUri", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
