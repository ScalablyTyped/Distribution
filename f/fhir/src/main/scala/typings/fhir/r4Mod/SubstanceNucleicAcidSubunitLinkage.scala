package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceNucleicAcidSubunitLinkage
  extends StObject
     with BackboneElement {
  
  var _connectivity: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _residueSite: js.UndefOr[Element] = js.undefined
  
  /**
    * The entity that links the sugar residues together should also be captured for nearly all naturally occurring nucleic acid the linkage is a phosphate group. For many synthetic oligonucleotides phosphorothioate linkages are often seen. Linkage connectivity is assumed to be 3’-5’. If the linkage is either 3’-3’ or 5’-5’ this should be specified.
    */
  var connectivity: js.UndefOr[String] = js.undefined
  
  /**
    * Each linkage will be registered as a fragment and have an ID.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Each linkage will be registered as a fragment and have at least one name. A single name shall be assigned to each linkage.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Residues shall be captured as described in 5.3.6.8.3.
    */
  var residueSite: js.UndefOr[String] = js.undefined
}
object SubstanceNucleicAcidSubunitLinkage {
  
  inline def apply(): SubstanceNucleicAcidSubunitLinkage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceNucleicAcidSubunitLinkage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceNucleicAcidSubunitLinkage] (val x: Self) extends AnyVal {
    
    inline def setConnectivity(value: String): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResidueSite(value: String): Self = StObject.set(x, "residueSite", value.asInstanceOf[js.Any])
    
    inline def setResidueSiteUndefined: Self = StObject.set(x, "residueSite", js.undefined)
    
    inline def set_connectivity(value: Element): Self = StObject.set(x, "_connectivity", value.asInstanceOf[js.Any])
    
    inline def set_connectivityUndefined: Self = StObject.set(x, "_connectivity", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_residueSite(value: Element): Self = StObject.set(x, "_residueSite", value.asInstanceOf[js.Any])
    
    inline def set_residueSiteUndefined: Self = StObject.set(x, "_residueSite", js.undefined)
  }
}
