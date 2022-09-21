package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.devtoolsProtocolStrings.all
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableRequest extends StObject {
  
  /**
    * Whether to include whitespaces in the children array of returned Nodes. (EnableRequestIncludeWhitespace enum)
    */
  var includeWhitespace: js.UndefOr[none_ | all] = js.undefined
}
object EnableRequest {
  
  inline def apply(): EnableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableRequest]
  }
  
  extension [Self <: EnableRequest](x: Self) {
    
    inline def setIncludeWhitespace(value: none_ | all): Self = StObject.set(x, "includeWhitespace", value.asInstanceOf[js.Any])
    
    inline def setIncludeWhitespaceUndefined: Self = StObject.set(x, "includeWhitespace", js.undefined)
  }
}
