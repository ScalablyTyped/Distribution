package typings.detox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceApp extends js.Object {
  
  var sourceApp: js.UndefOr[String] = js.native
  
  var url: String = js.native
}
object SourceApp {
  
  @scala.inline
  def apply(url: String): SourceApp = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceApp]
  }
  
  @scala.inline
  implicit class SourceAppOps[Self <: SourceApp] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceApp(value: String): Self = this.set("sourceApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceApp: Self = this.set("sourceApp", js.undefined)
  }
}
