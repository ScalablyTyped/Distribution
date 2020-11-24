package typings.forkTsCheckerWebpackPlugin.formatterFactoryMod

import typings.forkTsCheckerWebpackPlugin.codeFrameDTsMod.BabelCodeFrameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurableFormatterOptions extends js.Object {
  
  var codeframe: BabelCodeFrameOptions = js.native
}
object ConfigurableFormatterOptions {
  
  @scala.inline
  def apply(codeframe: BabelCodeFrameOptions): ConfigurableFormatterOptions = {
    val __obj = js.Dynamic.literal(codeframe = codeframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurableFormatterOptions]
  }
  
  @scala.inline
  implicit class ConfigurableFormatterOptionsOps[Self <: ConfigurableFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setCodeframe(value: BabelCodeFrameOptions): Self = this.set("codeframe", value.asInstanceOf[js.Any])
  }
}
