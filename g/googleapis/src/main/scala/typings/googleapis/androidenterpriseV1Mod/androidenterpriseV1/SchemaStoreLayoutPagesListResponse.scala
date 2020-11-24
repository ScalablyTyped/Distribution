package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The store page resources for the enterprise.
  */
@js.native
trait SchemaStoreLayoutPagesListResponse extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A store page of an enterprise.
    */
  var page: js.UndefOr[js.Array[SchemaStorePage]] = js.native
}
object SchemaStoreLayoutPagesListResponse {
  
  @scala.inline
  def apply(): SchemaStoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutPagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaStoreLayoutPagesListResponseOps[Self <: SchemaStoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: SchemaStorePage*): Self = this.set("page", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: js.Array[SchemaStorePage]): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
}
