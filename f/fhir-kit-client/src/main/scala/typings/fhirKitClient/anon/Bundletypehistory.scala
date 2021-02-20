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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined fhir.fhir.Bundle & {  type :'history'} */
@js.native
trait Bundletypehistory extends StObject {
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Entry in the bundle - will have a resource, or information
    */
  var entry: js.UndefOr[js.Array[BundleEntry]] = js.native
  
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[typings.fhir.fhir.id] = js.native
  
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.native
  
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.native
  
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.native
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.native
  
  /**
    * Digital Signature
    */
  var signature: js.UndefOr[Signature] = js.native
  
  /**
    * If search, the total number of matches
    */
  var total: js.UndefOr[unsignedInt] = js.native
  
  /**
    * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
    */
  var `type`: code with history = js.native
}
object Bundletypehistory {
  
  @scala.inline
  def apply(`type`: code with history): Bundletypehistory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundletypehistory]
  }
  
  @scala.inline
  implicit class BundletypehistoryMutableBuilder[Self <: Bundletypehistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Array[BundleEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: BundleEntry*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setImplicitRules(value: uri): Self = StObject.set(x, "implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitRulesUndefined: Self = StObject.set(x, "implicitRules", js.undefined)
    
    @scala.inline
    def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setResourceType(value: code): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setTotal(value: unsignedInt): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setType(value: code with history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: Element): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    
    @scala.inline
    def set_implicitRules(value: Element): Self = StObject.set(x, "_implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_implicitRulesUndefined: Self = StObject.set(x, "_implicitRules", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    @scala.inline
    def set_resourceType(value: Element): Self = StObject.set(x, "_resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_resourceTypeUndefined: Self = StObject.set(x, "_resourceType", js.undefined)
    
    @scala.inline
    def set_total(value: Element): Self = StObject.set(x, "_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_totalUndefined: Self = StObject.set(x, "_total", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
