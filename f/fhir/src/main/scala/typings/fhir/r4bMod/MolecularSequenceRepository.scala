package typings.fhir.r4bMod

import typings.fhir.fhirStrings.directlink
import typings.fhir.fhirStrings.login
import typings.fhir.fhirStrings.oauth
import typings.fhir.fhirStrings.openapi
import typings.fhir.fhirStrings.other
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MolecularSequenceRepository
  extends StObject
     with BackboneElement {
  
  var _datasetId: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _readsetId: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _url: js.UndefOr[Element] = js.undefined
  
  var _variantsetId: js.UndefOr[Element] = js.undefined
  
  /**
    * Id of the variant in this external repository. The server will understand how to use this id to call for more info about datasets in external repository.
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * URI of an external repository which contains further details about the genetics data.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the read in this external repository.
    */
  var readsetId: js.UndefOr[String] = js.undefined
  
  /**
    * Click and see / RESTful API / Need login to see / RESTful API with authentication / Other ways to see resource.
    */
  var `type`: directlink | openapi | login | oauth | other
  
  /**
    * URI of an external repository which contains further details about the genetics data.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the variantset in this external repository. The server will understand how to use this id to call for more info about variantsets in external repository.
    */
  var variantsetId: js.UndefOr[String] = js.undefined
}
object MolecularSequenceRepository {
  
  inline def apply(`type`: directlink | openapi | login | oauth | other): MolecularSequenceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MolecularSequenceRepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MolecularSequenceRepository] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadsetId(value: String): Self = StObject.set(x, "readsetId", value.asInstanceOf[js.Any])
    
    inline def setReadsetIdUndefined: Self = StObject.set(x, "readsetId", js.undefined)
    
    inline def setType(value: directlink | openapi | login | oauth | other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVariantsetId(value: String): Self = StObject.set(x, "variantsetId", value.asInstanceOf[js.Any])
    
    inline def setVariantsetIdUndefined: Self = StObject.set(x, "variantsetId", js.undefined)
    
    inline def set_datasetId(value: Element): Self = StObject.set(x, "_datasetId", value.asInstanceOf[js.Any])
    
    inline def set_datasetIdUndefined: Self = StObject.set(x, "_datasetId", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_readsetId(value: Element): Self = StObject.set(x, "_readsetId", value.asInstanceOf[js.Any])
    
    inline def set_readsetIdUndefined: Self = StObject.set(x, "_readsetId", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    inline def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    inline def set_variantsetId(value: Element): Self = StObject.set(x, "_variantsetId", value.asInstanceOf[js.Any])
    
    inline def set_variantsetIdUndefined: Self = StObject.set(x, "_variantsetId", js.undefined)
  }
}
