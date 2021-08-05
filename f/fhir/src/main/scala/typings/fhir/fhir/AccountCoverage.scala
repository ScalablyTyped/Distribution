package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
  */
trait AccountCoverage
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * The party(s) that are responsible for covering the payment of this account
    */
  var coverage: Reference
  
  /**
    * The priority of the coverage in the context of this account
    */
  var priority: js.UndefOr[positiveInt] = js.undefined
}
object AccountCoverage {
  
  inline def apply(coverage: Reference): AccountCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCoverage]
  }
  
  extension [Self <: AccountCoverage](x: Self) {
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: positiveInt): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
  }
}
