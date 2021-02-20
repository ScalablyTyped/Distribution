package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an Office held by one or more Officials.
  */
@js.native
trait SchemaOffice extends StObject {
  
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
  implicit class SchemaOfficeMutableBuilder[Self <: SchemaOffice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisionId(value: String): Self = StObject.set(x, "divisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisionIdUndefined: Self = StObject.set(x, "divisionId", js.undefined)
    
    @scala.inline
    def setLevels(value: js.Array[String]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
    
    @scala.inline
    def setLevelsVarargs(value: String*): Self = StObject.set(x, "levels", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOfficialIndices(value: js.Array[Double]): Self = StObject.set(x, "officialIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialIndicesUndefined: Self = StObject.set(x, "officialIndices", js.undefined)
    
    @scala.inline
    def setOfficialIndicesVarargs(value: Double*): Self = StObject.set(x, "officialIndices", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[String]): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
    
    @scala.inline
    def setRolesVarargs(value: String*): Self = StObject.set(x, "roles", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[SchemaSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: SchemaSource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
