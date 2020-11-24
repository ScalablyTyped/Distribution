package typings.fhir.fhir

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
  implicit class AccountCoverageOps[Self <: AccountCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    
    @scala.inline
    def setPriority(value: positiveInt): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
