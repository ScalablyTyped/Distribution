package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a political geographic division that matches the requested
  * query.
  */
@js.native
trait SchemaDivisionSearchResult extends js.Object {
  
  /**
    * Other Open Civic Data identifiers that refer to the same division -- for
    * example, those that refer to other political divisions whose boundaries
    * are defined to be coterminous with this one. For example,
    * ocd-division/country:us/state:wy will include an alias of
    * ocd-division/country:us/state:wy/cd:1, since Wyoming has only one
    * Congressional district.
    */
  var aliases: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The unique Open Civic Data identifier for this division.
    */
  var ocdId: js.UndefOr[String] = js.native
}
object SchemaDivisionSearchResult {
  
  @scala.inline
  def apply(): SchemaDivisionSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDivisionSearchResult]
  }
  
  @scala.inline
  implicit class SchemaDivisionSearchResultOps[Self <: SchemaDivisionSearchResult] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("aliases", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOcdId(value: String): Self = this.set("ocdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOcdId: Self = this.set("ocdId", js.undefined)
  }
}
