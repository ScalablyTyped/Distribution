package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOptions extends js.Object {
  
  /**
    *  the default template engine source, defaults to consolidate
    */
  var engineSource: js.UndefOr[js.Any] = js.native
  
  /**
    *  View extansion. defaults to 'pug', and is the default file extension for templates
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * a template file extension mapping, defaults to { hbs: 'handlebars', njk: 'nunjucks' }
    * (this is useful if you use different file extension naming conventions)
    */
  var map: js.UndefOr[js.Any] = js.native
}
object ViewOptions {
  
  @scala.inline
  def apply(): ViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOptions]
  }
  
  @scala.inline
  implicit class ViewOptionsOps[Self <: ViewOptions] (val x: Self) extends AnyVal {
    
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
    def setEngineSource(value: js.Any): Self = this.set("engineSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineSource: Self = this.set("engineSource", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
}
