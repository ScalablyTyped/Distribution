package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The store page resources for the enterprise.
  */
trait SchemaStoreLayoutPagesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutPagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * A store page of an enterprise.
    */
  var page: js.UndefOr[js.Array[SchemaStorePage]] = js.undefined
}
object SchemaStoreLayoutPagesListResponse {
  
  @scala.inline
  def apply(): SchemaStoreLayoutPagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutPagesListResponse]
  }
  
  @scala.inline
  implicit class SchemaStoreLayoutPagesListResponseMutableBuilder[Self <: SchemaStoreLayoutPagesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPage(value: js.Array[SchemaStorePage]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: SchemaStorePage*): Self = StObject.set(x, "page", js.Array(value :_*))
  }
}
