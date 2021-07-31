package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External repository which contains detailed report related with observedSeq in this resource
  */
trait SequenceRepository
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'datasetId'.
    */
  var _datasetId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'readsetId'.
    */
  var _readsetId: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'variantsetId'.
    */
  var _variantsetId: js.UndefOr[Element] = js.undefined
  
  /**
    * Id of the dataset that used to call for dataset in repository
    */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /**
    * Repository's name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Id of the read
    */
  var readsetId: js.UndefOr[String] = js.undefined
  
  /**
    * directlink | openapi | login | oauth | other
    */
  var `type`: code
  
  /**
    * URI of the repository
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Id of the variantset that used to call for variantset in repository
    */
  var variantsetId: js.UndefOr[String] = js.undefined
}
object SequenceRepository {
  
  @scala.inline
  def apply(`type`: code): SequenceRepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceRepository]
  }
  
  @scala.inline
  implicit class SequenceRepositoryMutableBuilder[Self <: SequenceRepository] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReadsetId(value: String): Self = StObject.set(x, "readsetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadsetIdUndefined: Self = StObject.set(x, "readsetId", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVariantsetId(value: String): Self = StObject.set(x, "variantsetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsetIdUndefined: Self = StObject.set(x, "variantsetId", js.undefined)
    
    @scala.inline
    def set_datasetId(value: Element): Self = StObject.set(x, "_datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_datasetIdUndefined: Self = StObject.set(x, "_datasetId", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_readsetId(value: Element): Self = StObject.set(x, "_readsetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_readsetIdUndefined: Self = StObject.set(x, "_readsetId", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_variantsetId(value: Element): Self = StObject.set(x, "_variantsetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_variantsetIdUndefined: Self = StObject.set(x, "_variantsetId", js.undefined)
  }
}
