package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataExchange extends StObject {
  
  /**
    * Optional. Description of the data exchange. The description must not contain Unicode non-characters as well as C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF). Default value is an empty string. Max length: 2000 bytes.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Human-readable display name of the data exchange. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&) and must not start or end with spaces. Default value is an empty string. Max length: 63 bytes.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Documentation describing the data exchange.
    */
  var documentation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Base64 encoded image representing the data exchange. Max Size: 3.0MiB Expected image dimensions are 512x512 pixels, however the API only performs validation on size of the encoded data. Note: For byte fields, the content of the fields are base64-encoded (which increases the size of the data by 33-36%) when using JSON on the wire.
    */
  var icon: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of listings contained in the data exchange.
    */
  var listingCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. The resource name of the data exchange. e.g. `projects/myproject/locations/US/dataExchanges/123`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Email or URL of the primary point of contact of the data exchange. Max Length: 1000 bytes.
    */
  var primaryContact: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataExchange {
  
  inline def apply(): SchemaDataExchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataExchange]
  }
  
  extension [Self <: SchemaDataExchange](x: Self) {
    
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
    
    inline def setListingCount(value: Double): Self = StObject.set(x, "listingCount", value.asInstanceOf[js.Any])
    
    inline def setListingCountNull: Self = StObject.set(x, "listingCount", null)
    
    inline def setListingCountUndefined: Self = StObject.set(x, "listingCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrimaryContact(value: String): Self = StObject.set(x, "primaryContact", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContactNull: Self = StObject.set(x, "primaryContact", null)
    
    inline def setPrimaryContactUndefined: Self = StObject.set(x, "primaryContact", js.undefined)
  }
}
