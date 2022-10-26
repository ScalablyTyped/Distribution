package typings.devtoolsProtocol.mod.Protocol.Storage

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStorageMetadata extends StObject {
  
  var creationTime: TimeSinceEpoch
  
  var length: integer
  
  var remainingBudget: Double
}
object SharedStorageMetadata {
  
  inline def apply(creationTime: TimeSinceEpoch, length: integer, remainingBudget: Double): SharedStorageMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], remainingBudget = remainingBudget.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStorageMetadata]
  }
  
  extension [Self <: SharedStorageMetadata](x: Self) {
    
    inline def setCreationTime(value: TimeSinceEpoch): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setLength(value: integer): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRemainingBudget(value: Double): Self = StObject.set(x, "remainingBudget", value.asInstanceOf[js.Any])
  }
}
