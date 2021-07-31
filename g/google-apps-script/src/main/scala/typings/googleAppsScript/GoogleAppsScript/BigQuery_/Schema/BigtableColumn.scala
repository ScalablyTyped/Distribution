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
  
  @scala.inline
  def apply(): BigtableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigtableColumn]
  }
  
  @scala.inline
  implicit class BigtableColumnMutableBuilder[Self <: BigtableColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setOnlyReadLatest(value: Boolean): Self = StObject.set(x, "onlyReadLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyReadLatestUndefined: Self = StObject.set(x, "onlyReadLatest", js.undefined)
    
    @scala.inline
    def setQualifierEncoded(value: String): Self = StObject.set(x, "qualifierEncoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierEncodedUndefined: Self = StObject.set(x, "qualifierEncoded", js.undefined)
    
    @scala.inline
    def setQualifierString(value: String): Self = StObject.set(x, "qualifierString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifierStringUndefined: Self = StObject.set(x, "qualifierString", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
