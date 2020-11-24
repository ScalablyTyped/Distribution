package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends js.Object {
  
  var binary: js.UndefOr[Boolean] = js.native
  
  var browseForFile: js.UndefOr[Boolean] = js.native
  
  var catalog: js.UndefOr[String] = js.native
  
  var cube: js.UndefOr[String] = js.native
  
  var customData: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  
  var dataSourceInfo: js.UndefOr[String] = js.native
  
  var dataSourceType: js.UndefOr[String] = js.native
  
  var effectiveUserName: js.UndefOr[String] = js.native
  
  var fieldSeparator: js.UndefOr[String] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  // elasticsearch
  var host: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  
  var ignoreQuotedLineBreaks: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[String] = js.native
  
  var localeIdentifier: js.UndefOr[String] = js.native
  
  var mapping: js.UndefOr[js.Object] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
  
  var recordsetDelimiter: js.UndefOr[String] = js.native
  
  var requestHeaders: js.UndefOr[js.Object] = js.native
  
  var roles: js.UndefOr[String] = js.native
  
  var subquery: js.UndefOr[String | js.Object] = js.native
  
  var thousandSeparator: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceOps[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinary(value: Boolean): Self = this.set("binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinary: Self = this.set("binary", js.undefined)
    
    @scala.inline
    def setBrowseForFile(value: Boolean): Self = this.set("browseForFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowseForFile: Self = this.set("browseForFile", js.undefined)
    
    @scala.inline
    def setCatalog(value: String): Self = this.set("catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalog: Self = this.set("catalog", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = this.set("cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCube: Self = this.set("cube", js.undefined)
    
    @scala.inline
    def setCustomData(value: String): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataSourceInfo(value: String): Self = this.set("dataSourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceInfo: Self = this.set("dataSourceInfo", js.undefined)
    
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    
    @scala.inline
    def setEffectiveUserName(value: String): Self = this.set("effectiveUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveUserName: Self = this.set("effectiveUserName", js.undefined)
    
    @scala.inline
    def setFieldSeparator(value: String): Self = this.set("fieldSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSeparator: Self = this.set("fieldSeparator", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHostVarargs(value: String*): Self = this.set("host", js.Array(value :_*))
    
    @scala.inline
    def setHost(value: String | js.Array[String] | js.Object): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIgnoreQuotedLineBreaks(value: Boolean): Self = this.set("ignoreQuotedLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreQuotedLineBreaks: Self = this.set("ignoreQuotedLineBreaks", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLocaleIdentifier(value: String): Self = this.set("localeIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleIdentifier: Self = this.set("localeIdentifier", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Object): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapping: Self = this.set("mapping", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    
    @scala.inline
    def setRecordsetDelimiter(value: String): Self = this.set("recordsetDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsetDelimiter: Self = this.set("recordsetDelimiter", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: js.Object): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    
    @scala.inline
    def setRoles(value: String): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setSubquery(value: String | js.Object): Self = this.set("subquery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubquery: Self = this.set("subquery", js.undefined)
    
    @scala.inline
    def setThousandSeparator(value: String): Self = this.set("thousandSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousandSeparator: Self = this.set("thousandSeparator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
