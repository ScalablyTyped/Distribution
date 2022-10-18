package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpStatsGeoIpNodeDatabaseName extends StObject {
  
  var name: Name
}
object IngestGeoIpStatsGeoIpNodeDatabaseName {
  
  inline def apply(name: Name): IngestGeoIpStatsGeoIpNodeDatabaseName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpStatsGeoIpNodeDatabaseName]
  }
  
  extension [Self <: IngestGeoIpStatsGeoIpNodeDatabaseName](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
