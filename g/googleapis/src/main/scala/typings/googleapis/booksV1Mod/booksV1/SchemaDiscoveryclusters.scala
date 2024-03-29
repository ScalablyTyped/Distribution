package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.Bannerwithcontentcontainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscoveryclusters extends StObject {
  
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer] | Null] = js.undefined
  
  /**
    * Resorce type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var totalClusters: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDiscoveryclusters {
  
  inline def apply(): SchemaDiscoveryclusters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscoveryclusters]
  }
  
  extension [Self <: SchemaDiscoveryclusters](x: Self) {
    
    inline def setClusters(value: js.Array[Bannerwithcontentcontainer]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersNull: Self = StObject.set(x, "clusters", null)
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: Bannerwithcontentcontainer*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTotalClusters(value: Double): Self = StObject.set(x, "totalClusters", value.asInstanceOf[js.Any])
    
    inline def setTotalClustersNull: Self = StObject.set(x, "totalClusters", null)
    
    inline def setTotalClustersUndefined: Self = StObject.set(x, "totalClusters", js.undefined)
  }
}
