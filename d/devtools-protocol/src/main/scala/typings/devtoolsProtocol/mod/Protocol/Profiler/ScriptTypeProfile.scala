package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptTypeProfile extends StObject {
  
  /**
    * Type profile entries for parameters and return values of the functions in the script.
    */
  var entries: js.Array[TypeProfileEntry]
  
  /**
    * JavaScript script id.
    */
  var scriptId: ScriptId
  
  /**
    * JavaScript script name or url.
    */
  var url: String
}
object ScriptTypeProfile {
  
  inline def apply(entries: js.Array[TypeProfileEntry], scriptId: ScriptId, url: String): ScriptTypeProfile = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTypeProfile]
  }
  
  extension [Self <: ScriptTypeProfile](x: Self) {
    
    inline def setEntries(value: js.Array[TypeProfileEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: TypeProfileEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
