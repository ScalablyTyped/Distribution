package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesMigrateToDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var name: IndexName
}
object IndicesMigrateToDataStreamRequest {
  
  inline def apply(name: IndexName): IndicesMigrateToDataStreamRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesMigrateToDataStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesMigrateToDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: IndexName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
