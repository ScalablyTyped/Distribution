package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpStatsGeoIpNodeDatabases extends StObject {
  
  var databases: js.Array[IngestGeoIpStatsGeoIpNodeDatabaseName]
  
  var files_in_temp: js.Array[String]
}
object IngestGeoIpStatsGeoIpNodeDatabases {
  
  inline def apply(databases: js.Array[IngestGeoIpStatsGeoIpNodeDatabaseName], files_in_temp: js.Array[String]): IngestGeoIpStatsGeoIpNodeDatabases = {
    val __obj = js.Dynamic.literal(databases = databases.asInstanceOf[js.Any], files_in_temp = files_in_temp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpStatsGeoIpNodeDatabases]
  }
  
  extension [Self <: IngestGeoIpStatsGeoIpNodeDatabases](x: Self) {
    
    inline def setDatabases(value: js.Array[IngestGeoIpStatsGeoIpNodeDatabaseName]): Self = StObject.set(x, "databases", value.asInstanceOf[js.Any])
    
    inline def setDatabasesVarargs(value: IngestGeoIpStatsGeoIpNodeDatabaseName*): Self = StObject.set(x, "databases", js.Array(value*))
    
    inline def setFiles_in_temp(value: js.Array[String]): Self = StObject.set(x, "files_in_temp", value.asInstanceOf[js.Any])
    
    inline def setFiles_in_tempVarargs(value: String*): Self = StObject.set(x, "files_in_temp", js.Array(value*))
  }
}
