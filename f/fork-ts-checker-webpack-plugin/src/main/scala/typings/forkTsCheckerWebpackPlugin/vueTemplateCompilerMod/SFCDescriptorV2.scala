package typings.forkTsCheckerWebpackPlugin.vueTemplateCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCDescriptorV2 extends js.Object {
  
  var customBlocks: js.Array[SFCBlockV2] = js.native
  
  var script: js.UndefOr[SFCBlockV2] = js.native
  
  var styles: js.Array[SFCBlockV2] = js.native
  
  var template: js.UndefOr[SFCBlockV2] = js.native
}
object SFCDescriptorV2 {
  
  @scala.inline
  def apply(customBlocks: js.Array[SFCBlockV2], styles: js.Array[SFCBlockV2]): SFCDescriptorV2 = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptorV2]
  }
  
  @scala.inline
  implicit class SFCDescriptorV2Ops[Self <: SFCDescriptorV2] (val x: Self) extends AnyVal {
    
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
    def setCustomBlocksVarargs(value: SFCBlockV2*): Self = this.set("customBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCustomBlocks(value: js.Array[SFCBlockV2]): Self = this.set("customBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: SFCBlockV2*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[SFCBlockV2]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: SFCBlockV2): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setTemplate(value: SFCBlockV2): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
