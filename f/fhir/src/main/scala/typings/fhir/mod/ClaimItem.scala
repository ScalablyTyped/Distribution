package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimItem
  extends StObject
     with BackboneElement {
  
  var _serviceDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Physical service site on the patient (limb, tooth, etc.).
    */
  var bodySite: js.UndefOr[Coding] = js.undefined
  
  /**
    * Second tier of goods and services.
    */
  var detail: js.UndefOr[js.Array[ClaimItemDetail]] = js.undefined
  
  /**
    * Diagnosis applicable for this service or product line.
    */
  var diagnosisLinkId: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var factor: js.UndefOr[Double] = js.undefined
  
  /**
    * May impact on adjudication.
    */
  var modifier: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var net: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If a fee is present the associated product/service code must be present.
    */
  var points: js.UndefOr[Double] = js.undefined
  
  /**
    * The materials and placement date of prior fixed prosthesis.
    */
  var prosthesis: js.UndefOr[ClaimItemProsthesis] = js.undefined
  
  /**
    * The practitioner who is responsible for the services rendered to the patient.
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * The number of repetitions of a service or product.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A service line number.
    */
  var sequence: Double
  
  /**
    * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
    */
  var service: Coding
  
  /**
    * The date when the enclosed suite of services were performed or completed.
    */
  var serviceDate: js.UndefOr[String] = js.undefined
  
  /**
    * A region or surface of the site, e.g. limb region or tooth surface(s).
    */
  var subSite: js.UndefOr[js.Array[Coding]] = js.undefined
  
  /**
    * The type of product or service.
    */
  var `type`: Coding
  
  /**
    * The UDI code and issuer if applicable for the supplied product.
    */
  var udi: js.UndefOr[Coding] = js.undefined
  
  /**
    * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
    */
  var unitPrice: js.UndefOr[Quantity] = js.undefined
}
object ClaimItem {
  
  inline def apply(sequence: Double, service: Coding, `type`: Coding): ClaimItem = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimItem]
  }
  
  extension [Self <: ClaimItem](x: Self) {
    
    inline def setBodySite(value: Coding): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setDetail(value: js.Array[ClaimItemDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: ClaimItemDetail*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setDiagnosisLinkId(value: js.Array[Double]): Self = StObject.set(x, "diagnosisLinkId", value.asInstanceOf[js.Any])
    
    inline def setDiagnosisLinkIdUndefined: Self = StObject.set(x, "diagnosisLinkId", js.undefined)
    
    inline def setDiagnosisLinkIdVarargs(value: Double*): Self = StObject.set(x, "diagnosisLinkId", js.Array(value*))
    
    inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
    
    inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
    
    inline def setModifier(value: js.Array[Coding]): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setModifierVarargs(value: Coding*): Self = StObject.set(x, "modifier", js.Array(value*))
    
    inline def setNet(value: Quantity): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
    
    inline def setNetUndefined: Self = StObject.set(x, "net", js.undefined)
    
    inline def setPoints(value: Double): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setProsthesis(value: ClaimItemProsthesis): Self = StObject.set(x, "prosthesis", value.asInstanceOf[js.Any])
    
    inline def setProsthesisUndefined: Self = StObject.set(x, "prosthesis", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setService(value: Coding): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceDate(value: String): Self = StObject.set(x, "serviceDate", value.asInstanceOf[js.Any])
    
    inline def setServiceDateUndefined: Self = StObject.set(x, "serviceDate", js.undefined)
    
    inline def setSubSite(value: js.Array[Coding]): Self = StObject.set(x, "subSite", value.asInstanceOf[js.Any])
    
    inline def setSubSiteUndefined: Self = StObject.set(x, "subSite", js.undefined)
    
    inline def setSubSiteVarargs(value: Coding*): Self = StObject.set(x, "subSite", js.Array(value*))
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUdi(value: Coding): Self = StObject.set(x, "udi", value.asInstanceOf[js.Any])
    
    inline def setUdiUndefined: Self = StObject.set(x, "udi", js.undefined)
    
    inline def setUnitPrice(value: Quantity): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def set_serviceDate(value: Element): Self = StObject.set(x, "_serviceDate", value.asInstanceOf[js.Any])
    
    inline def set_serviceDateUndefined: Self = StObject.set(x, "_serviceDate", js.undefined)
  }
}
