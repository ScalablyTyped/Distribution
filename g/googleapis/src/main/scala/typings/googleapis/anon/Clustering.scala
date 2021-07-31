package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaClustering
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTableReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTimePartitioning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clustering extends StObject {
  
  var clustering: js.UndefOr[SchemaClustering] = js.undefined
  
  var creationTime: js.UndefOr[String] = js.undefined
  
  var expirationTime: js.UndefOr[String] = js.undefined
  
  var friendlyName: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var tableReference: js.UndefOr[SchemaTableReference] = js.undefined
  
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var view: js.UndefOr[UseLegacySql] = js.undefined
}
object Clustering {
  
  @scala.inline
  def apply(): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clustering]
  }
  
  @scala.inline
  implicit class ClusteringMutableBuilder[Self <: Clustering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClustering(value: SchemaClustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setTableReference(value: SchemaTableReference): Self = StObject.set(x, "tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableReferenceUndefined: Self = StObject.set(x, "tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: SchemaTimePartitioning): Self = StObject.set(x, "timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePartitioningUndefined: Self = StObject.set(x, "timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: UseLegacySql): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
