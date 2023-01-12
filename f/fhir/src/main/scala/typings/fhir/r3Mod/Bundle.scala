package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`batch-response`
import typings.fhir.fhirStrings.`transaction-response`
import typings.fhir.fhirStrings.batch
import typings.fhir.fhirStrings.collection
import typings.fhir.fhirStrings.document
import typings.fhir.fhirStrings.history
import typings.fhir.fhirStrings.message
import typings.fhir.fhirStrings.searchset
import typings.fhir.fhirStrings.transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundle[BundleContentType]
  extends StObject
     with Resource {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * An entry in a bundle resource - will either contain a resource, or information about a resource (transactions and history only).
    */
  var entry: js.UndefOr[js.Array[BundleEntry[BundleContentType]]] = js.undefined
  
  /**
    * Persistent identity generally only matters for batches of type Document, Message, and Collection. It would not normally be populated for search and history results, and servers ignore Bundle.identifier when processing batches and transactions. For Documents  the .identifier SHALL be populated such that the .identifier is globally unique.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A series of links that provide context to this bundle.
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Bundle: typings.fhir.fhirStrings.Bundle
  
  /**
    * The signature could be created by the "author" of the bundle or by the originating device.   Requirements around inclusion of a signature, verification of signatures and treatment of signed/non-signed bundles is implementation-environment specific.
    */
  var signature: js.UndefOr[Signature] = js.undefined
  
  /**
    * Only used if the bundle is a search result set. The total does not include resources such as OperationOutcome and included resources, only the total number of matching resources.
    */
  var total: js.UndefOr[Double] = js.undefined
  
  /**
    * It's possible to use a bundle for other purposes (e.g. a document can be accepted as a transaction). This is primarily defined so that there can be specific rules for some of the bundle types.
    */
  var `type`: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection
}
object Bundle {
  
  inline def apply[BundleContentType](
    `type`: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection
  ): Bundle[BundleContentType] = {
    val __obj = js.Dynamic.literal(resourceType = "Bundle")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[BundleContentType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bundle[?], BundleContentType] (val x: Self & Bundle[BundleContentType]) extends AnyVal {
    
    inline def setEntry(value: js.Array[BundleEntry[BundleContentType]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: BundleEntry[BundleContentType]*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Bundle): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(
      value: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
