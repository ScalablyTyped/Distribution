package typings.escodegen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MozillaOptions extends js.Object {
  
  /**
    * Default: false
    */
  var comprehensionExpressionStartsWithAssignment: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var parenthesizedComprehensionBlock: js.UndefOr[Boolean] = js.native
  
  /**
    * Default: false
    */
  var starlessGenerator: js.UndefOr[Boolean] = js.native
}
object MozillaOptions {
  
  @scala.inline
  def apply(): MozillaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MozillaOptions]
  }
  
  @scala.inline
  implicit class MozillaOptionsOps[Self <: MozillaOptions] (val x: Self) extends AnyVal {
    
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
    def setComprehensionExpressionStartsWithAssignment(value: Boolean): Self = this.set("comprehensionExpressionStartsWithAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComprehensionExpressionStartsWithAssignment: Self = this.set("comprehensionExpressionStartsWithAssignment", js.undefined)
    
    @scala.inline
    def setParenthesizedComprehensionBlock(value: Boolean): Self = this.set("parenthesizedComprehensionBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParenthesizedComprehensionBlock: Self = this.set("parenthesizedComprehensionBlock", js.undefined)
    
    @scala.inline
    def setStarlessGenerator(value: Boolean): Self = this.set("starlessGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarlessGenerator: Self = this.set("starlessGenerator", js.undefined)
  }
}
