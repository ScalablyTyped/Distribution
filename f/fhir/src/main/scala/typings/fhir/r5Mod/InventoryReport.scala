package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.difference
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.snapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryReport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _countType: js.UndefOr[Element] = js.undefined
  
  var _reportedDateTime: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the report is about the current inventory count (snapshot) or a differential change in inventory (change).
    */
  var countType: snapshot | difference
  
  /**
    * Identifiers for the InventoryReport.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * An inventory listing section (grouped by any of the attributes).
    */
  var inventoryListing: js.UndefOr[js.Array[InventoryReportInventoryListing]] = js.undefined
  
  /**
    * A note associated with the InventoryReport.
    */
  var note: js.UndefOr[Annotation] = js.undefined
  
  /**
    * What type of operation is being performed - addition or subtraction.
    */
  var operationType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The reason for this count - regular count, ad-hoc count, new arrivals, etc.
    */
  var operationTypeReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When the report has been submitted.
    */
  var reportedDateTime: String
  
  /**
    * Who submits the report.
    */
  var reporter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The period the report refers to.
    */
  var reportingPeriod: js.UndefOr[Period] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_InventoryReport: typings.fhir.fhirStrings.InventoryReport
  
  /**
    * The status of the inventory check or notification - whether this is draft (e.g. the report is still pending some updates) or active.
    */
  var status: draft | requested | active | `entered-in-error`
}
object InventoryReport {
  
  inline def apply(
    countType: snapshot | difference,
    reportedDateTime: String,
    status: draft | requested | active | `entered-in-error`
  ): InventoryReport = {
    val __obj = js.Dynamic.literal(countType = countType.asInstanceOf[js.Any], reportedDateTime = reportedDateTime.asInstanceOf[js.Any], resourceType = "InventoryReport", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryReport] (val x: Self) extends AnyVal {
    
    inline def setCountType(value: snapshot | difference): Self = StObject.set(x, "countType", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInventoryListing(value: js.Array[InventoryReportInventoryListing]): Self = StObject.set(x, "inventoryListing", value.asInstanceOf[js.Any])
    
    inline def setInventoryListingUndefined: Self = StObject.set(x, "inventoryListing", js.undefined)
    
    inline def setInventoryListingVarargs(value: InventoryReportInventoryListing*): Self = StObject.set(x, "inventoryListing", js.Array(value*))
    
    inline def setNote(value: Annotation): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOperationType(value: CodeableConcept): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeReason(value: CodeableConcept): Self = StObject.set(x, "operationTypeReason", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeReasonUndefined: Self = StObject.set(x, "operationTypeReason", js.undefined)
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setReportedDateTime(value: String): Self = StObject.set(x, "reportedDateTime", value.asInstanceOf[js.Any])
    
    inline def setReporter(value: Reference): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setReportingPeriod(value: Period): Self = StObject.set(x, "reportingPeriod", value.asInstanceOf[js.Any])
    
    inline def setReportingPeriodUndefined: Self = StObject.set(x, "reportingPeriod", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.InventoryReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | requested | active | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_countType(value: Element): Self = StObject.set(x, "_countType", value.asInstanceOf[js.Any])
    
    inline def set_countTypeUndefined: Self = StObject.set(x, "_countType", js.undefined)
    
    inline def set_reportedDateTime(value: Element): Self = StObject.set(x, "_reportedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_reportedDateTimeUndefined: Self = StObject.set(x, "_reportedDateTime", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
