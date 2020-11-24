package typings.gatsbyTransformerRemark.mod

import typings.gatsbyTransformerRemark.gatsbyTransformerRemarkStrings.`gatsby-transformer-remark`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemarkConfig extends js.Object {
  
  var options: js.UndefOr[RemarkOptions] = js.native
  
  var resolve: `gatsby-transformer-remark` = js.native
}
object RemarkConfig {
  
  @scala.inline
  def apply(resolve: `gatsby-transformer-remark`): RemarkConfig = {
    val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemarkConfig]
  }
  
  @scala.inline
  implicit class RemarkConfigOps[Self <: RemarkConfig] (val x: Self) extends AnyVal {
    
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
    def setResolve(value: `gatsby-transformer-remark`): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: RemarkOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
