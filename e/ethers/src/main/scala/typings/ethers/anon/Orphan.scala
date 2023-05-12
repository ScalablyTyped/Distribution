package typings.ethers.anon

import typings.ethers.ethersStrings.`drop-transaction`
import typings.ethers.typesProvidersProviderMod.OrphanFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orphan
  extends StObject
     with OrphanFilter {
  
  var orphan: `drop-transaction`
  
  var other: js.UndefOr[BlockNumber] = js.undefined
  
  var tx: BlockNumber
}
object Orphan {
  
  inline def apply(tx: BlockNumber): Orphan = {
    val __obj = js.Dynamic.literal(orphan = "drop-transaction", tx = tx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orphan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Orphan] (val x: Self) extends AnyVal {
    
    inline def setOrphan(value: `drop-transaction`): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
    
    inline def setOther(value: BlockNumber): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setTx(value: BlockNumber): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
  }
}
