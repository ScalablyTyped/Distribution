package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetUserProfileGetUserProfileErrors extends StObject {
  
  var count: long
  
  var details: Record[SecurityUserProfileId, ErrorCause]
}
object SecurityGetUserProfileGetUserProfileErrors {
  
  inline def apply(count: long, details: Record[SecurityUserProfileId, ErrorCause]): SecurityGetUserProfileGetUserProfileErrors = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetUserProfileGetUserProfileErrors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGetUserProfileGetUserProfileErrors] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: Record[SecurityUserProfileId, ErrorCause]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
  }
}
