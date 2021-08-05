package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigtableColumn extends StObject {
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fieldName: js.UndefOr[String] = js.undefined
  
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  
  var qualifierEncoded: js.UndefOr[String] = js.undefined
  
  var qualifierString: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object BigtableColumn {
  
  inline def apply(): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumn]
  }
  
  extension [Self <: BigtableColumn](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    inline def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    inline def setQualifierEncoded(value: String): Self = StObject.set(x, "qualifierEncoded", value.asInstanceOf[js.Any])
    
    inline def setQualifierEncodedUndefined: Self = StObject.set(x, "qualifierEncoded", js.undefined)
    
    inline def setQualifierString(value: String): Self = StObject.set(x, "qualifierString", value.asInstanceOf[js.Any])
    
    inline def setQualifierStringUndefined: Self = StObject.set(x, "qualifierString", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
