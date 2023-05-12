package typings.ethers.anon

import typings.ethers.ethersStrings.getStorage
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position
  extends StObject
     with PerformActionRequest {
  
  var address: String
  
  var blockTag: typings.ethers.typesProvidersProviderMod.BlockTag
  
  var method: getStorage
  
  var position: js.BigInt
}
object Position {
  
  inline def apply(address: String, blockTag: typings.ethers.typesProvidersProviderMod.BlockTag, position: js.BigInt): Position = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blockTag = blockTag.asInstanceOf[js.Any], method = "getStorage", position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBlockTag(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "blockTag", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getStorage): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.BigInt): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
