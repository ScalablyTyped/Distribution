package typings.fhir.fhir

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
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    
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
    def set_expirationDate(value: Element): Self = this.set("_expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_expirationDate: Self = this.set("_expirationDate", js.undefined)
    
    @scala.inline
    def set_lotNumber(value: Element): Self = this.set("_lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lotNumber: Self = this.set("_lotNumber", js.undefined)
    
    @scala.inline
    def set_manufactureDate(value: Element): Self = this.set("_manufactureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_manufactureDate: Self = this.set("_manufactureDate", js.undefined)
    
    @scala.inline
    def set_manufacturer(value: Element): Self = this.set("_manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_manufacturer: Self = this.set("_manufacturer", js.undefined)
    
    @scala.inline
    def set_model(value: Element): Self = this.set("_model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_model: Self = this.set("_model", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactPoint*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactPoint]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: dateTime): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setLocation(value: Reference): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLotNumber(value: String): Self = this.set("lotNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLotNumber: Self = this.set("lotNumber", js.undefined)
    
    @scala.inline
    def setManufactureDate(value: dateTime): Self = this.set("manufactureDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufactureDate: Self = this.set("manufactureDate", js.undefined)
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setOwner(value: Reference): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    
    @scala.inline
    def setSafetyVarargs(value: CodeableConcept*): Self = this.set("safety", js.Array(value :_*))
    
    @scala.inline
    def setSafety(value: js.Array[CodeableConcept]): Self = this.set("safety", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafety: Self = this.set("safety", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUdi(value: DeviceUdi): Self = this.set("udi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUdi: Self = this.set("udi", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
