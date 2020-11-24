package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes information about a regional election administrative area.
  */
@js.native
trait SchemaAdministrationRegion extends js.Object {
  
  /**
    * The election administration body for this area.
    */
  var electionAdministrationBody: js.UndefOr[SchemaAdministrativeBody] = js.native
  
  /**
    * An ID for this object. IDs may change in future requests and should not
    * be cached. Access to this field requires special access that can be
    * requested from the Request more link on the Quotas page.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The city or county that provides election information for this voter.
    * This object can have the same elements as state.
    */
  var local_jurisdiction: js.UndefOr[SchemaAdministrationRegion] = js.native
  
  /**
    * The name of the jurisdiction.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A list of sources for this area. If multiple sources are listed the data
    * has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}
object SchemaAdministrationRegion {
  
  @scala.inline
  def apply(): SchemaAdministrationRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministrationRegion]
  }
  
  @scala.inline
  implicit class SchemaAdministrationRegionOps[Self <: SchemaAdministrationRegion] (val x: Self) extends AnyVal {
    
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
    def setElectionAdministrationBody(value: SchemaAdministrativeBody): Self = this.set("electionAdministrationBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectionAdministrationBody: Self = this.set("electionAdministrationBody", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocal_jurisdiction(value: SchemaAdministrationRegion): Self = this.set("local_jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal_jurisdiction: Self = this.set("local_jurisdiction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
