package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of resources
  */
trait Bundle
  extends StObject
     with ResourceBase
     with Resource {
  
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
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.undefined
  
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
  var `type`: code
}
object Bundle {
  
  @scala.inline
  def apply(`type`: code): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
  
  @scala.inline
  implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Array[BundleEntry]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: BundleEntry*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setTotal(value: unsignedInt): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
