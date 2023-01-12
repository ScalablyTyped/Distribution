package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCoverage
  extends StObject
     with BackboneElement {
  
  /**
    * The party(s) that contribute to payment (or part of) of the charges applied to this account (including self-pay).
    * A coverage may only be responsible for specific types of charges, and the sequence of the coverages in the account could be important when processing billing.
    */
  var coverage: Reference
  
  /**
    * It is common in some jurisdictions for there to be multiple coverages allocated to an account, and a sequence is required to order the settling of the account (often with insurance claiming).
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object AccountCoverage {
  
  inline def apply(coverage: Reference): AccountCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCoverage] (val x: Self) extends AnyVal {
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
