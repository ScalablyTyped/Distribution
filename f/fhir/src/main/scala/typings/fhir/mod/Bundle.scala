package typings.fhir.mod

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
    * A series of links that provide context to this bundle.
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Bundle: typings.fhir.fhirStrings.Bundle
  
  /**
    * This element allows capturing signatures on documents. It also allows signatures on messages, transactions or even query responses. It may support content-authentication, non-repudiation or other business cases. This is primarily relevant where the bundle may travel through multiple hops or via other mechanisms where HTTPS non-repudiation is insufficient.
    */
  var signature: js.UndefOr[Signature] = js.undefined
  
  /**
    * If a set of search matches, this is the total number of matches for the search (as opposed to the number of results in this bundle).
    */
  var total: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the purpose of this bundle- how it was intended to be used.
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
  
  extension [Self <: Bundle[?], BundleContentType](x: Self & Bundle[BundleContentType]) {
    
    inline def setEntry(value: js.Array[BundleEntry[BundleContentType]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: BundleEntry[BundleContentType]*): Self = StObject.set(x, "entry", js.Array(value*))
    
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
