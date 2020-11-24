package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataUriOptions extends js.Object {
  
  /**
    * optional parameter defaulting to true which will require `=` padding if true or make padding optional if false
    *
    * @default true
    */
  var paddingRequired: js.UndefOr[Boolean] = js.native
}
object DataUriOptions {
  
  @scala.inline
  def apply(): DataUriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataUriOptions]
  }
  
  @scala.inline
  implicit class DataUriOptionsOps[Self <: DataUriOptions] (val x: Self) extends AnyVal {
    
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
    def setPaddingRequired(value: Boolean): Self = this.set("paddingRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingRequired: Self = this.set("paddingRequired", js.undefined)
  }
}
