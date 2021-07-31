package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var browseForFile: js.UndefOr[Boolean] = js.undefined
  
  var catalog: js.UndefOr[String] = js.undefined
  
  var cube: js.UndefOr[String] = js.undefined
  
  var customData: js.UndefOr[String] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var dataSourceInfo: js.UndefOr[String] = js.undefined
  
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  var effectiveUserName: js.UndefOr[String] = js.undefined
  
  var fieldSeparator: js.UndefOr[String] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  // elasticsearch
  var host: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
  
  var ignoreQuotedLineBreaks: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[String] = js.undefined
  
  var localeIdentifier: js.UndefOr[String] = js.undefined
  
  var mapping: js.UndefOr[js.Object] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var proxyUrl: js.UndefOr[String] = js.undefined
  
  var recordsetDelimiter: js.UndefOr[String] = js.undefined
  
  var requestHeaders: js.UndefOr[js.Object] = js.undefined
  
  var roles: js.UndefOr[String] = js.undefined
  
  var subquery: js.UndefOr[String | js.Object] = js.undefined
  
  var thousandSeparator: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setBrowseForFile(value: Boolean): Self = StObject.set(x, "browseForFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowseForFileUndefined: Self = StObject.set(x, "browseForFile", js.undefined)
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    @scala.inline
    def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceInfo(value: String): Self = StObject.set(x, "dataSourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceInfoUndefined: Self = StObject.set(x, "dataSourceInfo", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEffectiveUserName(value: String): Self = StObject.set(x, "effectiveUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveUserNameUndefined: Self = StObject.set(x, "effectiveUserName", js.undefined)
    
    @scala.inline
    def setFieldSeparator(value: String): Self = StObject.set(x, "fieldSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldSeparatorUndefined: Self = StObject.set(x, "fieldSeparator", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setHost(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHostVarargs(value: String*): Self = StObject.set(x, "host", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreQuotedLineBreaks(value: Boolean): Self = StObject.set(x, "ignoreQuotedLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreQuotedLineBreaksUndefined: Self = StObject.set(x, "ignoreQuotedLineBreaks", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLocaleIdentifier(value: String): Self = StObject.set(x, "localeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleIdentifierUndefined: Self = StObject.set(x, "localeIdentifier", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Object): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    @scala.inline
    def setRecordsetDelimiter(value: String): Self = StObject.set(x, "recordsetDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsetDelimiterUndefined: Self = StObject.set(x, "recordsetDelimiter", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: js.Object): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setRoles(value: String): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setSubquery(value: String | js.Object): Self = StObject.set(x, "subquery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubqueryUndefined: Self = StObject.set(x, "subquery", js.undefined)
    
    @scala.inline
    def setThousandSeparator(value: String): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousandSeparatorUndefined: Self = StObject.set(x, "thousandSeparator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
