package typings.ethers.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockNumber extends StObject {
  
  var blockHash: String
  
  var blockNumber: Double
  
  var hash: String
}
object BlockNumber {
  
  inline def apply(blockHash: String, blockNumber: Double, hash: String): BlockNumber = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockNumber] (val x: Self) extends AnyVal {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
