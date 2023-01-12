package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcCoreTransactionOptionsMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/transaction_options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/core/transaction_options", "DEFAULT_TRANSACTION_OPTIONS")
  @js.native
  val DEFAULT_TRANSACTION_OPTIONS: TransactionOptions = js.native
  
  inline def validateTransactionOptions(options: TransactionOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTransactionOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait TransactionOptions extends StObject {
    
    /** Maximum number of attempts to commit, after which transaction fails. Default is 5. */
    val maxAttempts: Double
  }
  object TransactionOptions {
    
    inline def apply(maxAttempts: Double): TransactionOptions = {
      val __obj = js.Dynamic.literal(maxAttempts = maxAttempts.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    }
  }
}
