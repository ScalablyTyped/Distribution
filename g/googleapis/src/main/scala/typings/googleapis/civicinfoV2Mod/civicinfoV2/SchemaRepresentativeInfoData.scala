package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaRepresentativeInfoData extends StObject {
  
  /**
    * Political geographic divisions that contain the requested address.
    */
  var divisions: js.UndefOr[StringDictionary[SchemaGeographicDivision]] = js.native
  
  /**
    * Elected offices referenced by the divisions listed above. Will only be
    * present if includeOffices was true in the request.
    */
  var offices: js.UndefOr[js.Array[SchemaOffice]] = js.native
  
  /**
    * Officials holding the offices listed above. Will only be present if
    * includeOffices was true in the request.
    */
  var officials: js.UndefOr[js.Array[SchemaOfficial]] = js.native
}
object SchemaRepresentativeInfoData {
  
  @scala.inline
  def apply(): SchemaRepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepresentativeInfoData]
  }
  
  @scala.inline
  implicit class SchemaRepresentativeInfoDataMutableBuilder[Self <: SchemaRepresentativeInfoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDivisions(value: StringDictionary[SchemaGeographicDivision]): Self = StObject.set(x, "divisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisionsUndefined: Self = StObject.set(x, "divisions", js.undefined)
    
    @scala.inline
    def setOffices(value: js.Array[SchemaOffice]): Self = StObject.set(x, "offices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficesUndefined: Self = StObject.set(x, "offices", js.undefined)
    
    @scala.inline
    def setOfficesVarargs(value: SchemaOffice*): Self = StObject.set(x, "offices", js.Array(value :_*))
    
    @scala.inline
    def setOfficials(value: js.Array[SchemaOfficial]): Self = StObject.set(x, "officials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficialsUndefined: Self = StObject.set(x, "officials", js.undefined)
    
    @scala.inline
    def setOfficialsVarargs(value: SchemaOfficial*): Self = StObject.set(x, "officials", js.Array(value :_*))
  }
}
