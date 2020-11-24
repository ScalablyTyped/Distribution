package typings.fhirJsClient.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropName
  extends /**
  * Making this interface extendable since this is not a complete type definition of FHIR Resource
  */
/* propName */ StringDictionary[js.Any] {
  
  /**
    * Type: dateTime    Only include resource versions that were current at some point during the time period specified
    * in the date time value (may be more than one)
    */
  var _at: js.UndefOr[String] = js.native
  
  /**
    * To specify alternative response formats by their MIME-types.
    * This parameter allows a client to override the accept header value when it is unable to set it correctly due to internal limitations
    * (e.g. XSLT usage). For the _format parameter, the values xml, text/xml, application/xml, and application/fhir+xml SHALL be interpreted
    * to mean the XML format, the codes json, application/json and application/fhir+json SHALL be interpreted
    * to mean the JSON format, and the codes ttl and text/turtle SHALL be interpreted to mean the Turtle RDF format.
    * In addition, the values html and text/html are allowed.
    */
  var _format: js.UndefOr[String] = js.native
}
object DictpropName {
  
  @scala.inline
  def apply(): DictpropName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropName]
  }
  
  @scala.inline
  implicit class DictpropNameOps[Self <: DictpropName] (val x: Self) extends AnyVal {
    
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
    def set_at(value: String): Self = this.set("_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_at: Self = this.set("_at", js.undefined)
    
    @scala.inline
    def set_format(value: String): Self = this.set("_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_format: Self = this.set("_format", js.undefined)
  }
}
