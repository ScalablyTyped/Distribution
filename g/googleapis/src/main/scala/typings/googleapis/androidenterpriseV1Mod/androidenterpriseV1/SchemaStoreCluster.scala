package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a managed Google Play store cluster, a list of products
  * displayed as part of a store page.
  */
trait SchemaStoreCluster extends StObject {
  
  /**
    * Unique ID of this cluster. Assigned by the server. Immutable once
    * assigned.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#storeCluster&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Ordered list of localized strings giving the name of this page. The text
    * displayed is the one that best matches the user locale, or the first
    * entry if there is no good match. There needs to be at least one entry.
    */
  var name: js.UndefOr[js.Array[SchemaLocalizedText]] = js.undefined
  
  /**
    * String (US-ASCII only) used to determine order of this cluster within the
    * parent page&#39;s elements. Page elements are sorted in lexicographic
    * order of this field. Duplicated values are allowed, but ordering between
    * elements with duplicate order is undefined.  The value of this field is
    * never visible to a user, it is used solely for the purpose of defining an
    * ordering. Maximum length is 256 characters.
    */
  var orderInPage: js.UndefOr[String] = js.undefined
  
  /**
    * List of products in the order they are displayed in the cluster. There
    * should not be duplicates within a cluster.
    */
  var productId: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaStoreCluster {
  
  inline def apply(): SchemaStoreCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreCluster]
  }
  
  extension [Self <: SchemaStoreCluster](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: js.Array[SchemaLocalizedText]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: SchemaLocalizedText*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    inline def setOrderInPage(value: String): Self = StObject.set(x, "orderInPage", value.asInstanceOf[js.Any])
    
    inline def setOrderInPageUndefined: Self = StObject.set(x, "orderInPage", js.undefined)
    
    inline def setProductId(value: js.Array[String]): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductIdVarargs(value: String*): Self = StObject.set(x, "productId", js.Array(value :_*))
  }
}
