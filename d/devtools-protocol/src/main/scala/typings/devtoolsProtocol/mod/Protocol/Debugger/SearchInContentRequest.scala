package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInContentRequest extends StObject {
  
  /**
    * If true, search is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, treats string parameter as regex.
    */
  var isRegex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String to search for.
    */
  var query: String
  
  /**
    * Id of the script to search in.
    */
  var scriptId: ScriptId
}
object SearchInContentRequest {
  
  inline def apply(query: String, scriptId: ScriptId): SearchInContentRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInContentRequest]
  }
  
  extension [Self <: SearchInContentRequest](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setIsRegex(value: Boolean): Self = StObject.set(x, "isRegex", value.asInstanceOf[js.Any])
    
    inline def setIsRegexUndefined: Self = StObject.set(x, "isRegex", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
  }
}
