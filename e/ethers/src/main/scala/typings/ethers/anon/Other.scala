package typings.ethers.anon

import typings.ethers.ethersStrings.`reorder-transaction`
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Other
  extends StObject
     with OrphanFilter {
  
  var orphan: `reorder-transaction`
  
  var other: js.UndefOr[BlockNumber] = js.undefined
  
  var tx: BlockNumber
}
object Other {
  
  inline def apply(tx: BlockNumber): Other = {
    val __obj = js.Dynamic.literal(orphan = "reorder-transaction", tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Other]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Other] (val x: Self) extends AnyVal {
    
    inline def setOrphan(value: `reorder-transaction`): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
    
    inline def setOther(value: BlockNumber): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setTx(value: BlockNumber): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
