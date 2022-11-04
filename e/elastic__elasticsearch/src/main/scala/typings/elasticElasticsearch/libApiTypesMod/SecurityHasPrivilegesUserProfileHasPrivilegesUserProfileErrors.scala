package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors extends StObject {
  
  var count: long
  
  var details: Record[SecurityUserProfileId, ErrorCause]
}
object SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors {
  
  inline def apply(count: long, details: Record[SecurityUserProfileId, ErrorCause]): SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors]
  }
  
  extension [Self <: SecurityHasPrivilegesUserProfileHasPrivilegesUserProfileErrors](x: Self) {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Record[SecurityUserProfileId, ErrorCause]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
