package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
  */
@js.native
trait AccountCoverage extends BackboneElement {
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * The party(s) that are responsible for covering the payment of this account
    */
  var coverage: Reference = js.native
  
  /**
    * The priority of the coverage in the context of this account
    */
  var priority: js.UndefOr[positiveInt] = js.native
}
object AccountCoverage {
  
  @scala.inline
  def apply(coverage: Reference): AccountCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCoverage]
  }
  
  @scala.inline
  implicit class AccountCoverageMutableBuilder[Self <: AccountCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: positiveInt): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
  }
}
