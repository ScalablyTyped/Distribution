package typings.googleCloudFirestore.FirebaseFirestore

import typings.googleCloudFirestore.googleCloudFirestoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadOnlyTransactionOptions extends StObject {
  
  /** Set to true to indicate a read-only transaction. */
  var readOnly: `true`
  
  /**
    * If specified, documents are read at the given time. This may not be more
    * than 60 seconds in the past from when the request is processed by the
    * server.
    */
  var readTime: js.UndefOr[Timestamp] = js.undefined
}
object ReadOnlyTransactionOptions {
  
  inline def apply(): ReadOnlyTransactionOptions = {
    val __obj = js.Dynamic.literal(readOnly = true)
    __obj.asInstanceOf[ReadOnlyTransactionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOnlyTransactionOptions] (val x: Self) extends AnyVal {
    
    inline def setReadOnly(value: `true`): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadTime(value: Timestamp): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
