package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchVersionInfo extends StObject {
  
  var build_date: DateTime
  
  var build_flavor: String
  
  var build_hash: String
  
  var build_snapshot: Boolean
  
  var build_type: String
  
  var lucene_version: VersionString
  
  var minimum_index_compatibility_version: VersionString
  
  var minimum_wire_compatibility_version: VersionString
  
  var number: String
}
object ElasticsearchVersionInfo {
  
  inline def apply(
    build_date: DateTime,
    build_flavor: String,
    build_hash: String,
    build_snapshot: Boolean,
    build_type: String,
    lucene_version: VersionString,
    minimum_index_compatibility_version: VersionString,
    minimum_wire_compatibility_version: VersionString,
    number: String
  ): ElasticsearchVersionInfo = {
    val __obj = js.Dynamic.literal(build_date = build_date.asInstanceOf[js.Any], build_flavor = build_flavor.asInstanceOf[js.Any], build_hash = build_hash.asInstanceOf[js.Any], build_snapshot = build_snapshot.asInstanceOf[js.Any], build_type = build_type.asInstanceOf[js.Any], lucene_version = lucene_version.asInstanceOf[js.Any], minimum_index_compatibility_version = minimum_index_compatibility_version.asInstanceOf[js.Any], minimum_wire_compatibility_version = minimum_wire_compatibility_version.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchVersionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticsearchVersionInfo] (val x: Self) extends AnyVal {
    
    inline def setBuild_date(value: DateTime): Self = StObject.set(x, "build_date", value.asInstanceOf[js.Any])
    
    inline def setBuild_flavor(value: String): Self = StObject.set(x, "build_flavor", value.asInstanceOf[js.Any])
    
    inline def setBuild_hash(value: String): Self = StObject.set(x, "build_hash", value.asInstanceOf[js.Any])
    
    inline def setBuild_snapshot(value: Boolean): Self = StObject.set(x, "build_snapshot", value.asInstanceOf[js.Any])
    
    inline def setBuild_type(value: String): Self = StObject.set(x, "build_type", value.asInstanceOf[js.Any])
    
    inline def setLucene_version(value: VersionString): Self = StObject.set(x, "lucene_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_index_compatibility_version(value: VersionString): Self = StObject.set(x, "minimum_index_compatibility_version", value.asInstanceOf[js.Any])
    
    inline def setMinimum_wire_compatibility_version(value: VersionString): Self = StObject.set(x, "minimum_wire_compatibility_version", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
