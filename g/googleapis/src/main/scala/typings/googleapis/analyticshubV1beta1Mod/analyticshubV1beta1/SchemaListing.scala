package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListing extends StObject {
  
  /**
    * Required. Shared dataset i.e. BigQuery dataset source.
    */
  var bigqueryDataset: js.UndefOr[SchemaBigQueryDatasetSource] = js.undefined
  
  /**
    * Optional. Categories of the listing. Up to two categories are allowed.
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Details of the data provider who owns the source data.
    */
  var dataProvider: js.UndefOr[SchemaDataProvider] = js.undefined
  
  /**
    * Optional. Short description of the listing. The description must not contain Unicode non-characters and C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Human-readable display name of the listing. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&) and can't start or end with spaces. Default value is an empty string. Max length: 63 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Documentation describing the listing.
    */
  var documentation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Base64 encoded image representing the listing. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the contents of the field are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name of the listing. e.g. `projects/myproject/locations/US/dataExchanges/123/listings/456`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Email or URL of the primary point of contact of the listing. Max Length: 1000 bytes.
    */
  var primaryContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Details of the publisher who owns the listing and who can share the source data.
    */
  var publisher: js.UndefOr[SchemaPublisher] = js.undefined
  
  /**
    * Optional. Email or URL of the request access of the listing. Subscribers can use this reference to request access. Max Length: 1000 bytes.
    */
  var requestAccess: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Current state of the listing.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaListing {
  
  inline def apply(): SchemaListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListing]
  }
  
  extension [Self <: SchemaListing](x: Self) {
    
    inline def setBigqueryDataset(value: SchemaBigQueryDatasetSource): Self = StObject.set(x, "bigqueryDataset", value.asInstanceOf[js.Any])
    
    inline def setBigqueryDatasetUndefined: Self = StObject.set(x, "bigqueryDataset", js.undefined)
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDataProvider(value: SchemaDataProvider): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    inline def setDataProviderUndefined: Self = StObject.set(x, "dataProvider", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationNull: Self = StObject.set(x, "documentation", null)
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryContact(value: String): Self = StObject.set(x, "primaryContact", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContactNull: Self = StObject.set(x, "primaryContact", null)
    
    inline def setPrimaryContactUndefined: Self = StObject.set(x, "primaryContact", js.undefined)
    
    inline def setPublisher(value: SchemaPublisher): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRequestAccess(value: String): Self = StObject.set(x, "requestAccess", value.asInstanceOf[js.Any])
    
    inline def setRequestAccessNull: Self = StObject.set(x, "requestAccess", null)
    
    inline def setRequestAccessUndefined: Self = StObject.set(x, "requestAccess", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
