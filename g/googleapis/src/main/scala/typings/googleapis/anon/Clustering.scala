package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaClustering
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTableReference
import typings.googleapis.bigqueryV2Mod.bigqueryV2.SchemaTimePartitioning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clustering extends js.Object {
  
  var clustering: js.UndefOr[SchemaClustering] = js.native
  
  var creationTime: js.UndefOr[String] = js.native
  
  var expirationTime: js.UndefOr[String] = js.native
  
  var friendlyName: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  var tableReference: js.UndefOr[SchemaTableReference] = js.native
  
  var timePartitioning: js.UndefOr[SchemaTimePartitioning] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var view: js.UndefOr[UseLegacySql] = js.native
}
object Clustering {
  
  @scala.inline
  def apply(): Clustering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clustering]
  }
  
  @scala.inline
  implicit class ClusteringOps[Self <: Clustering] (val x: Self) extends AnyVal {
    
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
    def setClustering(value: SchemaClustering): Self = this.set("clustering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClustering: Self = this.set("clustering", js.undefined)
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setTableReference(value: SchemaTableReference): Self = this.set("tableReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableReference: Self = this.set("tableReference", js.undefined)
    
    @scala.inline
    def setTimePartitioning(value: SchemaTimePartitioning): Self = this.set("timePartitioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimePartitioning: Self = this.set("timePartitioning", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setView(value: UseLegacySql): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
