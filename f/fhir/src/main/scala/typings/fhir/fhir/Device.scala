package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Item used in healthcare
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Device extends DomainResource {
  
  /**
    * Contains extended information for property 'expirationDate'.
    */
  var _expirationDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lotNumber'.
    */
  var _lotNumber: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'manufactureDate'.
    */
  var _manufactureDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'manufacturer'.
    */
  var _manufacturer: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'model'.
    */
  var _model: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Details for human/organization for support
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.native
  
  /**
    * Date and time of expiry of this device (if applicable)
    */
  var expirationDate: js.UndefOr[dateTime] = js.native
  
  /**
    * Instance identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Where the resource is found
    */
  var location: js.UndefOr[Reference] = js.native
  
  /**
    * Lot number of manufacture
    */
  var lotNumber: js.UndefOr[String] = js.native
  
  /**
    * Date when the device was made
    */
  var manufactureDate: js.UndefOr[dateTime] = js.native
  
  /**
    * Name of device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.native
  
  /**
    * Model id assigned by the manufacturer
    */
  var model: js.UndefOr[String] = js.native
  
  /**
    * Device notes and comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Organization responsible for device
    */
  var owner: js.UndefOr[Reference] = js.native
  
  /**
    * Patient to whom Device is affixed
    */
  var patient: js.UndefOr[Reference] = js.native
  
  /**
    * Safety Characteristics of Device
    */
  var safety: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * active | inactive | entered-in-error | unknown
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * What kind of device this is
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Unique Device Identifier (UDI) Barcode string
    */
  var udi: js.UndefOr[DeviceUdi] = js.native
  
  /**
    * Network address to contact device
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Version number (i.e. software)
    */
  var version: js.UndefOr[String] = js.native
}
object Device {
  
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit class DeviceMutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setExpirationDate(value: dateTime): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLotNumber(value: String): Self = StObject.set(x, "lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLotNumberUndefined: Self = StObject.set(x, "lotNumber", js.undefined)
    
    @scala.inline
    def setManufactureDate(value: dateTime): Self = StObject.set(x, "manufactureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufactureDateUndefined: Self = StObject.set(x, "manufactureDate", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setSafety(value: js.Array[CodeableConcept]): Self = StObject.set(x, "safety", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafetyUndefined: Self = StObject.set(x, "safety", js.undefined)
    
    @scala.inline
    def setSafetyVarargs(value: CodeableConcept*): Self = StObject.set(x, "safety", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUdi(value: DeviceUdi): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_expirationDate(value: Element): Self = StObject.set(x, "_expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_expirationDateUndefined: Self = StObject.set(x, "_expirationDate", js.undefined)
    
    @scala.inline
    def set_lotNumber(value: Element): Self = StObject.set(x, "_lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lotNumberUndefined: Self = StObject.set(x, "_lotNumber", js.undefined)
    
    @scala.inline
    def set_manufactureDate(value: Element): Self = StObject.set(x, "_manufactureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_manufactureDateUndefined: Self = StObject.set(x, "_manufactureDate", js.undefined)
    
    @scala.inline
    def set_manufacturer(value: Element): Self = StObject.set(x, "_manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_manufacturerUndefined: Self = StObject.set(x, "_manufacturer", js.undefined)
    
    @scala.inline
    def set_model(value: Element): Self = StObject.set(x, "_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_modelUndefined: Self = StObject.set(x, "_model", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
