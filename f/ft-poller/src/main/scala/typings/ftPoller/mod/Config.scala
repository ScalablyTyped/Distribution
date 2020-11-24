package typings.ftPoller.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config[PollerData, ExternalData] extends js.Object {
  
  var autostart: js.UndefOr[Boolean] = js.native
  
  var defaultData: js.UndefOr[PollerData] = js.native
  
  var options: js.UndefOr[Options] = js.native
  
  var parseData: js.UndefOr[js.Function1[/* data */ ExternalData, PollerData]] = js.native
  
  var refreshInterval: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object Config {
  
  @scala.inline
  def apply[PollerData, ExternalData](url: String): Config[PollerData, ExternalData] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[PollerData, ExternalData]]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config[_, _], PollerData, ExternalData] (val x: Self with (Config[PollerData, ExternalData])) extends AnyVal {
    
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
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setDefaultData(value: PollerData): Self = this.set("defaultData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultData: Self = this.set("defaultData", js.undefined)
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParseData(value: /* data */ ExternalData => PollerData): Self = this.set("parseData", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParseData: Self = this.set("parseData", js.undefined)
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
  }
}
