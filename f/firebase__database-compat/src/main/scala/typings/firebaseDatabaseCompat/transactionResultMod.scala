package typings.firebaseDatabaseCompat

import typings.firebaseDatabaseCompat.referenceMod.DataSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionResultMod {
  
  @JSImport("@firebase/database-compat/dist/database-compat/src/api/TransactionResult", "TransactionResult")
  @js.native
  open class TransactionResult protected () extends StObject {
    /**
      * A type for the resolve value of Firebase.transaction.
      */
    def this(committed: Boolean, snapshot: DataSnapshot) = this()
    
    var committed: Boolean = js.native
    
    var snapshot: DataSnapshot = js.native
    
    def toJSON(): js.Object = js.native
  }
}
