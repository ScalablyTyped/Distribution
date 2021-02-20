package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The store page resources for the enterprise.
  */
@js.native
trait SchemaStoreLayoutClustersListResponse extends StObject {
  
  /**
    * A store cluster of an enterprise.
    */
  var cluster: js.UndefOr[js.Array[SchemaStoreCluster]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeLayoutClustersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaStoreLayoutClustersListResponse {
  
  @scala.inline
  def apply(): SchemaStoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutClustersListResponse]
  }
  
  @scala.inline
  implicit class SchemaStoreLayoutClustersListResponseMutableBuilder[Self <: SchemaStoreLayoutClustersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: js.Array[SchemaStoreCluster]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setClusterVarargs(value: SchemaStoreCluster*): Self = StObject.set(x, "cluster", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
