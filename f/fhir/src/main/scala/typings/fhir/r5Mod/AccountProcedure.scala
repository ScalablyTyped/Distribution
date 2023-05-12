package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountProcedure
  extends StObject
     with BackboneElement {
  
  var _dateOfService: js.UndefOr[Element] = js.undefined
  
  /**
    * The procedure relevant to the account.
    */
  var code: CodeableReference
  
  /**
    * Date of the procedure when using a coded procedure. If using a reference to a procedure, then the date on the procedure should be used.
    */
  var dateOfService: js.UndefOr[String] = js.undefined
  
  /**
    * Any devices that were associated with the procedure relevant to the account.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The package code can be used to group procedures that may be priced or delivered as a single product. Such as DRGs.
    */
  var packageCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Ranking of the procedure (for each type).
    */
  var sequence: js.UndefOr[Double] = js.undefined
  
  /**
    * How this procedure value should be used in charging the account.
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object AccountProcedure {
  
  inline def apply(code: CodeableReference): AccountProcedure = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountProcedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountProcedure] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableReference): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDateOfService(value: String): Self = StObject.set(x, "dateOfService", value.asInstanceOf[js.Any])
    
    inline def setDateOfServiceUndefined: Self = StObject.set(x, "dateOfService", js.undefined)
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setPackageCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "packageCode", value.asInstanceOf[js.Any])
    
    inline def setPackageCodeUndefined: Self = StObject.set(x, "packageCode", js.undefined)
    
    inline def setPackageCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "packageCode", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def set_dateOfService(value: Element): Self = StObject.set(x, "_dateOfService", value.asInstanceOf[js.Any])
    
    inline def set_dateOfServiceUndefined: Self = StObject.set(x, "_dateOfService", js.undefined)
  }
}
