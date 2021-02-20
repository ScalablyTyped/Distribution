package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a political geography.
  */
@js.native
trait SchemaGeographicDivision extends StObject {
  
  /**
    * Any other valid OCD IDs that refer to the same division.  Because OCD IDs
    * are meant to be human-readable and at least somewhat predictable, there
    * are occasionally several identifiers for a single division. These
    * identifiers are defined to be equivalent to one another, and one is
    * always indicated as the primary identifier. The primary identifier will
    * be returned in ocd_id above, and any other equivalent valid identifiers
    * will be returned in this list.  For example, if this division&#39;s OCD
    * ID is ocd-division/country:us/district:dc, this will contain
    * ocd-division/country:us/state:dc.
    */
  var alsoKnownAs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the division.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * List of indices in the offices array, one for each office elected from
    * this division. Will only be present if includeOffices was true (or
    * absent) in the request.
    */
  var officeIndices: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaGeographicDivision {
  
  @scala.inline
  def apply(): SchemaGeographicDivision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeographicDivision]
  }
  
  @scala.inline
  implicit class SchemaGeographicDivisionMutableBuilder[Self <: SchemaGeographicDivision] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlsoKnownAs(value: js.Array[String]): Self = StObject.set(x, "alsoKnownAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlsoKnownAsUndefined: Self = StObject.set(x, "alsoKnownAs", js.undefined)
    
    @scala.inline
    def setAlsoKnownAsVarargs(value: String*): Self = StObject.set(x, "alsoKnownAs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOfficeIndices(value: js.Array[Double]): Self = StObject.set(x, "officeIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeIndicesUndefined: Self = StObject.set(x, "officeIndices", js.undefined)
    
    @scala.inline
    def setOfficeIndicesVarargs(value: Double*): Self = StObject.set(x, "officeIndices", js.Array(value :_*))
  }
}
