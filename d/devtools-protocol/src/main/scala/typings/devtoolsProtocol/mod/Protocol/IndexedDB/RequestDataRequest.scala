package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDataRequest extends js.Object {
  /**
    * Database name.
    */
  var databaseName: String = js.native
  /**
    * Index name, empty string for object store data requests.
    */
  var indexName: String = js.native
  /**
    * Key range.
    */
  var keyRange: js.UndefOr[KeyRange] = js.native
  /**
    * Object store name.
    */
  var objectStoreName: String = js.native
  /**
    * Number of records to fetch.
    */
  var pageSize: integer = js.native
  /**
    * Security origin.
    */
  var securityOrigin: String = js.native
  /**
    * Number of records to skip.
    */
  var skipCount: integer = js.native
}

object RequestDataRequest {
  @scala.inline
  def apply(
    databaseName: String,
    indexName: String,
    objectStoreName: String,
    pageSize: integer,
    securityOrigin: String,
    skipCount: integer
  ): RequestDataRequest = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], objectStoreName = objectStoreName.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], skipCount = skipCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataRequest]
  }
  @scala.inline
  implicit class RequestDataRequestOps[Self <: RequestDataRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectStoreName(value: String): Self = this.set("objectStoreName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: integer): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipCount(value: integer): Self = this.set("skipCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyRange(value: KeyRange): Self = this.set("keyRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyRange: Self = this.set("keyRange", js.undefined)
  }
  
}

