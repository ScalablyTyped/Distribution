package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RequestOptions. */
trait IRequestOptions extends StObject {
  
  /** RequestOptions priority */
  var priority: js.UndefOr[
    Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.RequestOptions.Priority * / any */ String) | Null
  ] = js.undefined
  
  /** RequestOptions requestTag */
  var requestTag: js.UndefOr[String | Null] = js.undefined
  
  /** RequestOptions transactionTag */
  var transactionTag: js.UndefOr[String | Null] = js.undefined
}
object IRequestOptions {
  
  inline def apply(): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRequestOptions]
  }
  
  extension [Self <: IRequestOptions](x: Self) {
    
    inline def setPriority(
      value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.RequestOptions.Priority * / any */ String)
    ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRequestTag(value: String): Self = StObject.set(x, "requestTag", value.asInstanceOf[js.Any])
    
    inline def setRequestTagNull: Self = StObject.set(x, "requestTag", null)
    
    inline def setRequestTagUndefined: Self = StObject.set(x, "requestTag", js.undefined)
    
    inline def setTransactionTag(value: String): Self = StObject.set(x, "transactionTag", value.asInstanceOf[js.Any])
    
    inline def setTransactionTagNull: Self = StObject.set(x, "transactionTag", null)
    
    inline def setTransactionTagUndefined: Self = StObject.set(x, "transactionTag", js.undefined)
  }
}
