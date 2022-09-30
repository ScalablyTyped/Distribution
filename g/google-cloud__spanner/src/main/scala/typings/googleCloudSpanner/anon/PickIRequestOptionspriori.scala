package typings.googleCloudSpanner.anon

import typings.googleCloudSpanner.protosMod.google.spanner.v1.RequestOptions.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@google-cloud/spanner.@google-cloud/spanner/build/protos/protos.google.spanner.v1.IRequestOptions, 'priority'> */
trait PickIRequestOptionspriori extends StObject {
  
  var priority: js.UndefOr[
    Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.RequestOptions.Priority * / any */ String) | Null
  ] = js.undefined
}
object PickIRequestOptionspriori {
  
  inline def apply(): PickIRequestOptionspriori = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIRequestOptionspriori]
  }
  
  extension [Self <: PickIRequestOptionspriori](x: Self) {
    
    inline def setPriority(
      value: Priority | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.RequestOptions.Priority * / any */ String)
    ): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
