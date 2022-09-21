package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`batch-response`
import typings.fhir.fhirStrings.`subscription-notification`
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
  
  var _timestamp: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).
    */
  var entry: js.UndefOr[js.Array[BundleEntry[BundleContentType]]] = js.undefined
  
  /**
    * Persistent identity generally only matters for batches of type Document, Message, and Collection. It would not normally be populated for search and history results and servers ignore Bundle.identifier when processing batches and transactions. For Documents  the .identifier SHALL be populated such that the .identifier is globally unique.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Both Bundle.link and Bundle.entry.link are defined to support providing additional context when Bundles are used (e.g. [HATEOAS](http://en.wikipedia.org/wiki/HATEOAS)).
    * Bundle.entry.link corresponds to links found in the HTTP header if the resource in the entry was [read](http.html#read) directly.
    * This specification defines some specific uses of Bundle.link for [searching](search.html#conformance) and [paging](http.html#paging), but no specific uses for Bundle.entry.link, and no defined function in a transaction - the meaning is implementation specific.
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
    * For many bundles, the timestamp is equal to .meta.lastUpdated, because they are not stored (e.g. search results). When a bundle is placed in a persistent store, .meta.lastUpdated will be usually be changed by the server. When the bundle is a message, a middleware agent altering the message (even if not stored) SHOULD update .meta.lastUpdated. .timestamp is used to track the original time of the Bundle, and SHOULD be populated.
    * Usage:
    * * document : the date the document was created. Note: the composition may predate the document, or be associated with multiple documents. The date of the composition - the authoring time - may be earlier than the document assembly time
    * * message : the date that the content of the message was assembled. This date is not changed by middleware engines unless they add additional data that changes the meaning of the time of the message
    * * history : the date that the history was assembled. This time would be used as the _since time to ask for subsequent updates
    * * searchset : the time that the search set was assembled. Note that different pages MAY have different timestamps but need not. Having different timestamps does not imply that subsequent pages will represent or include changes made since the initial query
    * * transaction | transaction-response | batch | batch-response | collection : no particular assigned meaning
    * The timestamp value should be greater than the lastUpdated and other timestamps in the resources in the bundle, and it should be equal or earlier than the .meta.lastUpdated on the Bundle itself.
    */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Only used if the bundle is a search result set. The total does not include resources such as OperationOutcome and included resources, only the total number of matching resources.
    */
  var total: js.UndefOr[Double] = js.undefined
  
  /**
    * It's possible to use a bundle for other purposes (e.g. a document can be accepted as a transaction). This is primarily defined so that there can be specific rules for some of the bundle types.
    */
  var `type`: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection | `subscription-notification`
}
object Bundle {
  
  inline def apply[BundleContentType](
    `type`: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection | `subscription-notification`
  ): Bundle[BundleContentType] = {
    val __obj = js.Dynamic.literal(resourceType = "Bundle")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle[BundleContentType]]
  }
  
  extension [Self <: Bundle[?], BundleContentType](x: Self & Bundle[BundleContentType]) {
    
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
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(
      value: document | message | transaction | `transaction-response` | batch | `batch-response` | history | searchset | collection | `subscription-notification`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_timestamp(value: Element): Self = StObject.set(x, "_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_timestampUndefined: Self = StObject.set(x, "_timestamp", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
