package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceNucleicAcidSubunitSugar
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _residueSite: js.UndefOr[Element] = js.undefined
  
  /**
    * The Substance ID of the sugar or sugar-like component that make up the nucleotide.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The name of the sugar or sugar-like component that make up the nucleotide.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The residues that contain a given sugar will be captured. The order of given residues will be captured in the 5‘-3‘direction consistent with the base sequences listed above.
    */
  var residueSite: js.UndefOr[String] = js.undefined
}
object SubstanceNucleicAcidSubunitSugar {
  
  inline def apply(): SubstanceNucleicAcidSubunitSugar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceNucleicAcidSubunitSugar]
  }
  
  extension [Self <: SubstanceNucleicAcidSubunitSugar](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResidueSite(value: String): Self = StObject.set(x, "residueSite", value.asInstanceOf[js.Any])
    
    inline def setResidueSiteUndefined: Self = StObject.set(x, "residueSite", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_residueSite(value: Element): Self = StObject.set(x, "_residueSite", value.asInstanceOf[js.Any])
    
    inline def set_residueSiteUndefined: Self = StObject.set(x, "_residueSite", js.undefined)
  }
}
