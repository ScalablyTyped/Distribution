package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes information about a regional election administrative area.
  */
@js.native
trait SchemaAdministrationRegion extends StObject {
  
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
  implicit class SchemaAdministrationRegionMutableBuilder[Self <: SchemaAdministrationRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElectionAdministrationBody(value: SchemaAdministrativeBody): Self = StObject.set(x, "electionAdministrationBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionAdministrationBodyUndefined: Self = StObject.set(x, "electionAdministrationBody", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocal_jurisdiction(value: SchemaAdministrationRegion): Self = StObject.set(x, "local_jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_jurisdictionUndefined: Self = StObject.set(x, "local_jurisdiction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
