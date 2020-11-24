package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the election that was queried.
  */
@js.native
trait SchemaElection extends js.Object {
  
  /**
    * Day of the election in YYYY-MM-DD format.
    */
  var electionDay: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of this election.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A displayable name for the election.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The political division of the election. Represented as an OCD Division
    * ID. Voters within these political jurisdictions are covered by this
    * election. This is typically a state such as
    * ocd-division/country:us/state:ca or for the midterms or general election
    * the entire US (i.e. ocd-division/country:us).
    */
  var ocdDivisionId: js.UndefOr[String] = js.native
}
object SchemaElection {
  
  @scala.inline
  def apply(): SchemaElection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElection]
  }
  
  @scala.inline
  implicit class SchemaElectionOps[Self <: SchemaElection] (val x: Self) extends AnyVal {
    
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
    def setElectionDay(value: String): Self = this.set("electionDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectionDay: Self = this.set("electionDay", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOcdDivisionId(value: String): Self = this.set("ocdDivisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcdDivisionId: Self = this.set("ocdDivisionId", js.undefined)
  }
}
