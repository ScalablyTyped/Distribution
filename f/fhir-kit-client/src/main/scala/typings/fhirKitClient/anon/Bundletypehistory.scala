package typings.fhirKitClient.anon

import typings.fhir.fhir.BundleEntry
import typings.fhir.fhir.BundleLink
import typings.fhir.fhir.Element
import typings.fhir.fhir.Identifier
import typings.fhir.fhir.Meta
import typings.fhir.fhir.Signature
import typings.fhir.fhir.code
import typings.fhir.fhir.id
import typings.fhir.fhir.unsignedInt
import typings.fhir.fhir.uri
import typings.fhirKitClient.fhirKitClientStrings.history
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined fhir.fhir.Bundle & {  type :'history'} */
trait Bundletypehistory extends StObject {
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Entry in the bundle - will have a resource, or information
    */
  var entry: js.UndefOr[js.Array[BundleEntry]] = js.undefined
  
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[typings.fhir.fhir.id] = js.undefined
  
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.undefined
  
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.undefined
  
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.undefined
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.undefined
  
  /**
    * Digital Signature
    */
  var signature: js.UndefOr[Signature] = js.undefined
  
  /**
    * If search, the total number of matches
    */
  var total: js.UndefOr[unsignedInt] = js.undefined
  
  /**
    * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
    */
  var `type`: code & history
}
object Bundletypehistory {
  
  inline def apply(`type`: code & history): Bundletypehistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundletypehistory]
  }
  
  extension [Self <: Bundletypehistory](x: Self) {
    
    inline def setEntry(value: js.Array[BundleEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEntryVarargs(value: BundleEntry*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    inline def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setImplicitRules(value: uri): Self = StObject.set(x, "implicitRules", value.asInstanceOf[js.Any])
    
    inline def setImplicitRulesUndefined: Self = StObject.set(x, "implicitRules", js.undefined)
    
    inline def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setResourceType(value: code): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setTotal(value: unsignedInt): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: code & history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    inline def set_implicitRules(value: Element): Self = StObject.set(x, "_implicitRules", value.asInstanceOf[js.Any])
    
    inline def set_implicitRulesUndefined: Self = StObject.set(x, "_implicitRules", js.undefined)
    
    inline def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    inline def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    inline def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    inline def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
    
    inline def set_total(value: Element): Self = StObject.set(x, "_total", value.asInstanceOf[js.Any])
    
    inline def set_totalUndefined: Self = StObject.set(x, "_total", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
