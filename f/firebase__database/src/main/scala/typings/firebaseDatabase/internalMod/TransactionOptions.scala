package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  /**
    * By default, events are raised each time the transaction update function
    * runs. So if it is run multiple times, you may see intermediate states. You
    * can set this to false to suppress these intermediate states and instead
    * wait until the transaction has completed before events are raised.
    */
  val applyLocally: js.UndefOr[Boolean] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setApplyLocally(value: Boolean): Self = StObject.set(x, "applyLocally", value.asInstanceOf[js.Any])
    
    inline def setApplyLocallyUndefined: Self = StObject.set(x, "applyLocally", js.undefined)
  }
}
