package typings.googleCloudSpanner.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IRequestOptions * / any, 'transactionTag'> */
trait PickanytransactionTag extends StObject {
  
  var transactionTag: js.UndefOr[Any] = js.undefined
}
object PickanytransactionTag {
  
  inline def apply(): PickanytransactionTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickanytransactionTag]
  }
  
  extension [Self <: PickanytransactionTag](x: Self) {
    
    inline def setTransactionTag(value: Any): Self = StObject.set(x, "transactionTag", value.asInstanceOf[js.Any])
    
    inline def setTransactionTagUndefined: Self = StObject.set(x, "transactionTag", js.undefined)
  }
}
