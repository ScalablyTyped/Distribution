package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an Office held by one or more Officials.
  */
@js.native
trait SchemaOffice extends js.Object {
  
  /**
    * The OCD ID of the division with which this office is associated.
    */
  var divisionId: js.UndefOr[String] = js.native
  
  /**
    * The levels of government of which this office is part. There may be more
    * than one in cases where a jurisdiction effectively acts at two different
    * levels of government; for example, the mayor of the District of Columbia
    * acts at &quot;locality&quot; level, but also effectively at both
    * &quot;administrative-area-2&quot; and &quot;administrative-area-1&quot;.
    */
  var levels: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The human-readable name of the office.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * List of indices in the officials array of people who presently hold this
    * office.
    */
  var officialIndices: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The roles which this office fulfills. Roles are not meant to be
    * exhaustive, or to exactly specify the entire set of responsibilities of a
    * given office, but are meant to be rough categories that are useful for
    * general selection from or sorting of a list of offices.
    */
  var roles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of sources for this office. If multiple sources are listed, the
    * data has been aggregated from those sources.
    */
  var sources: js.UndefOr[js.Array[SchemaSource]] = js.native
}
object SchemaOffice {
  
  @scala.inline
  def apply(): SchemaOffice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOffice]
  }
  
  @scala.inline
  implicit class SchemaOfficeOps[Self <: SchemaOffice] (val x: Self) extends AnyVal {
    
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
    def setDivisionId(value: String): Self = this.set("divisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisionId: Self = this.set("divisionId", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: String*): Self = this.set("levels", js.Array(value :_*))
    
    @scala.inline
    def setLevels(value: js.Array[String]): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOfficialIndicesVarargs(value: Double*): Self = this.set("officialIndices", js.Array(value :_*))
    
    @scala.inline
    def setOfficialIndices(value: js.Array[Double]): Self = this.set("officialIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfficialIndices: Self = this.set("officialIndices", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = this.set("sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
}
