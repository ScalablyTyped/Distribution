package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseAccount extends StObject {
  
  var ConsistencyPolicy: typings.documentdb.mod.ConsistencyPolicy
  
  var CurrentMediaStorageUsageInMB: Double
  
  var DatabasesLink: String
  
  var MaxMediaStorageUsageInMB: Double
  
  var MediaLink: String
  
  var ReadableLocations: js.Array[String]
  
  var WritableLocations: js.Array[String]
}
object DatabaseAccount {
  
  inline def apply(
    ConsistencyPolicy: ConsistencyPolicy,
    CurrentMediaStorageUsageInMB: Double,
    DatabasesLink: String,
    MaxMediaStorageUsageInMB: Double,
    MediaLink: String,
    ReadableLocations: js.Array[String],
    WritableLocations: js.Array[String]
  ): DatabaseAccount = {
    val __obj = js.Dynamic.literal(ConsistencyPolicy = ConsistencyPolicy.asInstanceOf[js.Any], CurrentMediaStorageUsageInMB = CurrentMediaStorageUsageInMB.asInstanceOf[js.Any], DatabasesLink = DatabasesLink.asInstanceOf[js.Any], MaxMediaStorageUsageInMB = MaxMediaStorageUsageInMB.asInstanceOf[js.Any], MediaLink = MediaLink.asInstanceOf[js.Any], ReadableLocations = ReadableLocations.asInstanceOf[js.Any], WritableLocations = WritableLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseAccount]
  }
  
  extension [Self <: DatabaseAccount](x: Self) {
    
    inline def setConsistencyPolicy(value: ConsistencyPolicy): Self = StObject.set(x, "ConsistencyPolicy", value.asInstanceOf[js.Any])
    
    inline def setCurrentMediaStorageUsageInMB(value: Double): Self = StObject.set(x, "CurrentMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    inline def setDatabasesLink(value: String): Self = StObject.set(x, "DatabasesLink", value.asInstanceOf[js.Any])
    
    inline def setMaxMediaStorageUsageInMB(value: Double): Self = StObject.set(x, "MaxMediaStorageUsageInMB", value.asInstanceOf[js.Any])
    
    inline def setMediaLink(value: String): Self = StObject.set(x, "MediaLink", value.asInstanceOf[js.Any])
    
    inline def setReadableLocations(value: js.Array[String]): Self = StObject.set(x, "ReadableLocations", value.asInstanceOf[js.Any])
    
    inline def setReadableLocationsVarargs(value: String*): Self = StObject.set(x, "ReadableLocations", js.Array(value*))
    
    inline def setWritableLocations(value: js.Array[String]): Self = StObject.set(x, "WritableLocations", value.asInstanceOf[js.Any])
    
    inline def setWritableLocationsVarargs(value: String*): Self = StObject.set(x, "WritableLocations", js.Array(value*))
  }
}
