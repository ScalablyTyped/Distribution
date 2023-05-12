package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  object default {
    
    @JSImport("epcis2.js/settings", "default.EPCISDocumentContext")
    @js.native
    val EPCISDocumentContext: String = js.native
    
    @JSImport("epcis2.js/settings", "default.EPCISDocumentSchemaVersion")
    @js.native
    val EPCISDocumentSchemaVersion: String = js.native
    
    @JSImport("epcis2.js/settings", "default.apiUrl")
    @js.native
    val apiUrl: String = js.native
    
    @JSImport("epcis2.js/settings", "default.checkExtensions")
    @js.native
    val checkExtensions: Boolean = js.native
    
    @JSImport("epcis2.js/settings", "default.digitalLinkDomain")
    @js.native
    val digitalLinkDomain: Double = js.native
    
    @JSImport("epcis2.js/settings", "default.documentValidation")
    @js.native
    val documentValidation: Boolean = js.native
    
    @JSImport("epcis2.js/settings", "default.eventTimeZoneOffset")
    @js.native
    val eventTimeZoneOffset: String = js.native
    
    @JSImport("epcis2.js/settings", "default.headers")
    @js.native
    val headers: Any = js.native
    
    @JSImport("epcis2.js/settings", "default.timeout")
    @js.native
    val timeout: Double = js.native
    
    @JSImport("epcis2.js/settings", "default.validationMode")
    @js.native
    val validationMode: String = js.native
  }
  
  @JSImport("epcis2.js/settings", "defaultSettings")
  @js.native
  val defaultSettings: Settings_ = js.native
  
  trait Settings_ extends StObject {
    
    /**
      * - The default value of the '@context' parameter of an
      * EPCISDocument. Set it to undefined if you don't want the parameter in your EPCISDocument.
      */
    var EPCISDocumentContext: String
    
    /**
      * - The default value of the 'schemaVersion'
      * parameter of an EPCISDocument. Set it to undefined if you don't want the parameter in your
      * EPCISDocument.
      */
    var EPCISDocumentSchemaVersion: String
    
    /**
      * - Url of the request
      */
    var apiUrl: String
    
    /**
      * - set it to true if you want the extension of the
      * EPCISDocument to be checked against the EPCIS Document context.
      * Otherwise, the extensions check will be ignored.
      * Please refer to: https://www.npmjs.com/package/ajv-formats/v/0.3.4
      */
    var checkExtensions: Boolean
    
    /**
      * - The digital link domain that should be used in when
      * building a digital link from an epc
      */
    var digitalLinkDomain: Double
    
    /**
      * - whether the EPCISDocument has to be validated or not
      * before sending it via the capture interface
      */
    var documentValidation: Boolean
    
    /**
      * - The default eventTimeZoneOffset that will be set in
      */
    var eventTimeZoneOffset: String
    
    /**
      * - Headers to send with request
      */
    var headers: Any
    
    /**
      * - Timeout for request in ms
      */
    var timeout: Double
    
    /**
      * - The default value of 'validationMode' for the
      * validation of an EPCISDocument or an EPCIS Event against schemas.
      * Possible values are either "full" or "fast".
      */
    var validationMode: String
  }
  object Settings_ {
    
    inline def apply(
      EPCISDocumentContext: String,
      EPCISDocumentSchemaVersion: String,
      apiUrl: String,
      checkExtensions: Boolean,
      digitalLinkDomain: Double,
      documentValidation: Boolean,
      eventTimeZoneOffset: String,
      headers: Any,
      timeout: Double,
      validationMode: String
    ): Settings_ = {
      val __obj = js.Dynamic.literal(EPCISDocumentContext = EPCISDocumentContext.asInstanceOf[js.Any], EPCISDocumentSchemaVersion = EPCISDocumentSchemaVersion.asInstanceOf[js.Any], apiUrl = apiUrl.asInstanceOf[js.Any], checkExtensions = checkExtensions.asInstanceOf[js.Any], digitalLinkDomain = digitalLinkDomain.asInstanceOf[js.Any], documentValidation = documentValidation.asInstanceOf[js.Any], eventTimeZoneOffset = eventTimeZoneOffset.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], validationMode = validationMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings_] (val x: Self) extends AnyVal {
      
      inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
      
      inline def setCheckExtensions(value: Boolean): Self = StObject.set(x, "checkExtensions", value.asInstanceOf[js.Any])
      
      inline def setDigitalLinkDomain(value: Double): Self = StObject.set(x, "digitalLinkDomain", value.asInstanceOf[js.Any])
      
      inline def setDocumentValidation(value: Boolean): Self = StObject.set(x, "documentValidation", value.asInstanceOf[js.Any])
      
      inline def setEPCISDocumentContext(value: String): Self = StObject.set(x, "EPCISDocumentContext", value.asInstanceOf[js.Any])
      
      inline def setEPCISDocumentSchemaVersion(value: String): Self = StObject.set(x, "EPCISDocumentSchemaVersion", value.asInstanceOf[js.Any])
      
      inline def setEventTimeZoneOffset(value: String): Self = StObject.set(x, "eventTimeZoneOffset", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setValidationMode(value: String): Self = StObject.set(x, "validationMode", value.asInstanceOf[js.Any])
    }
  }
}
