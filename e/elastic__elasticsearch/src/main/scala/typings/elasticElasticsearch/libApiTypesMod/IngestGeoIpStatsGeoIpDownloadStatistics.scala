package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpStatsGeoIpDownloadStatistics extends StObject {
  
  var database_count: integer
  
  var failed_downloads: integer
  
  var skipped_updates: integer
  
  var successful_downloads: integer
  
  var total_download_time: DurationValue[UnitMillis]
}
object IngestGeoIpStatsGeoIpDownloadStatistics {
  
  inline def apply(
    database_count: integer,
    failed_downloads: integer,
    skipped_updates: integer,
    successful_downloads: integer,
    total_download_time: DurationValue[UnitMillis]
  ): IngestGeoIpStatsGeoIpDownloadStatistics = {
    val __obj = js.Dynamic.literal(database_count = database_count.asInstanceOf[js.Any], failed_downloads = failed_downloads.asInstanceOf[js.Any], skipped_updates = skipped_updates.asInstanceOf[js.Any], successful_downloads = successful_downloads.asInstanceOf[js.Any], total_download_time = total_download_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpStatsGeoIpDownloadStatistics]
  }
  
  extension [Self <: IngestGeoIpStatsGeoIpDownloadStatistics](x: Self) {
    
    inline def setDatabase_count(value: integer): Self = StObject.set(x, "database_count", value.asInstanceOf[js.Any])
    
    inline def setFailed_downloads(value: integer): Self = StObject.set(x, "failed_downloads", value.asInstanceOf[js.Any])
    
    inline def setSkipped_updates(value: integer): Self = StObject.set(x, "skipped_updates", value.asInstanceOf[js.Any])
    
    inline def setSuccessful_downloads(value: integer): Self = StObject.set(x, "successful_downloads", value.asInstanceOf[js.Any])
    
    inline def setTotal_download_time(value: DurationValue[UnitMillis]): Self = StObject.set(x, "total_download_time", value.asInstanceOf[js.Any])
  }
}
