package typings.frctlFractal.mod.fractal.api.components

import typings.frctlFractal.anon.Handle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDefaultConfig extends js.Object {
  
  var collated: js.UndefOr[Boolean] = js.native
  
  var collator: js.UndefOr[Collator] = js.native
  
  var context: js.UndefOr[js.Any] = js.native
  
  var display: js.UndefOr[js.Any] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var preview: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object ComponentDefaultConfig {
  
  @scala.inline
  def apply(): ComponentDefaultConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentDefaultConfig]
  }
  
  @scala.inline
  implicit class ComponentDefaultConfigOps[Self <: ComponentDefaultConfig] (val x: Self) extends AnyVal {
    
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
    def setCollated(value: Boolean): Self = this.set("collated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollated: Self = this.set("collated", js.undefined)
    
    @scala.inline
    def setCollator(value: (/* markup */ String, /* item */ Handle) => String): Self = this.set("collator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCollator: Self = this.set("collator", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDisplay(value: js.Any): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
