package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.ascending
import typings.gatsbyPluginUtils.gatsbyPluginUtilsStrings.descending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySortOptions extends js.Object {
  
  var by: js.UndefOr[String | Reference] = js.native
  
  /**
    * @default 'ascending'
    */
  var order: js.UndefOr[ascending | descending] = js.native
}
object ArraySortOptions {
  
  @scala.inline
  def apply(): ArraySortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArraySortOptions]
  }
  
  @scala.inline
  implicit class ArraySortOptionsOps[Self <: ArraySortOptions] (val x: Self) extends AnyVal {
    
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
    def setBy(value: String | Reference): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setOrder(value: ascending | descending): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
