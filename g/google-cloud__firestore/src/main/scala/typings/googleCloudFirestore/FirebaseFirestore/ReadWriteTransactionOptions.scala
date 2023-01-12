package typings.googleCloudFirestore.FirebaseFirestore

import typings.googleCloudFirestore.googleCloudFirestoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadWriteTransactionOptions extends StObject {
  
  /**
    * The maximum number of attempts for this transaction. Defaults to 5.
    */
  var maxAttempts: js.UndefOr[Double] = js.undefined
  
  /** Set to false or omit to indicate a read-write transaction. */
  var readOnly: js.UndefOr[`false`] = js.undefined
}
object ReadWriteTransactionOptions {
  
  inline def apply(): ReadWriteTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadWriteTransactionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadWriteTransactionOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    
    inline def setReadOnly(value: `false`): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
