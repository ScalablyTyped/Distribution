package typings.firebaseFirestore.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionOptions extends StObject {
  
  /** Maximum number of attempts to commit, after which transaction fails. Default is 5. */
  val maxAttempts: js.UndefOr[Double] = js.undefined
}
object TransactionOptions {
  
  inline def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  extension [Self <: TransactionOptions](x: Self) {
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
  }
}
