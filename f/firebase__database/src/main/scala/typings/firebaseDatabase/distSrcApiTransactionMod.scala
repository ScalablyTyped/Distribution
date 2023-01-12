package typings.firebaseDatabase

import typings.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot
import typings.firebaseDatabase.distSrcApiReferenceMod.DatabaseReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiTransactionMod {
  
  @JSImport("@firebase/database/dist/src/api/Transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/api/Transaction", "TransactionResult")
  @js.native
  open class TransactionResult protected () extends StObject {
    /** @hideconstructor */
    def this(
      /** Whether the transaction was successfully committed. */
    committed: Boolean,
      /** The resulting data snapshot. */
    snapshot: DataSnapshot
    ) = this()
    
    /** Whether the transaction was successfully committed. */
    val committed: Boolean = js.native
    
    /** The resulting data snapshot. */
    val snapshot: DataSnapshot = js.native
    
    /** Returns a JSON-serializable representation of this object. */
    def toJSON(): js.Object = js.native
  }
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransactionResult]]
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      inline def setApplyLocally(value: Boolean): Self = StObject.set(x, "applyLocally", value.asInstanceOf[js.Any])
      
      inline def setApplyLocallyUndefined: Self = StObject.set(x, "applyLocally", js.undefined)
    }
  }
}
