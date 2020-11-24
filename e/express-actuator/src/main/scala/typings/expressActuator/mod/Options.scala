package typings.expressActuator.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Options for {@link Actuator} function.
  */
@js.native
trait Options extends js.Object {
  
  /**
    * @summary BasePath of Actuator.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * @summary Custom endpoints
    */
  var customEndpoints: js.UndefOr[js.Array[CustomEndpoint]] = js.native
  
  /**
    * @summary Extra Options to pass to info build output.
    */
  var infoBuildOptions: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * @summary DateFormat for info git.time output.
    */
  var infoDateFormat: js.UndefOr[String] = js.native
  
  /**
    * @summary infoGitMode.
    */
  var infoGitMode: js.UndefOr[InfoGitMode] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setCustomEndpointsVarargs(value: CustomEndpoint*): Self = this.set("customEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setCustomEndpoints(value: js.Array[CustomEndpoint]): Self = this.set("customEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpoints: Self = this.set("customEndpoints", js.undefined)
    
    @scala.inline
    def setInfoBuildOptions(value: Record[String, _]): Self = this.set("infoBuildOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoBuildOptions: Self = this.set("infoBuildOptions", js.undefined)
    
    @scala.inline
    def setInfoDateFormat(value: String): Self = this.set("infoDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoDateFormat: Self = this.set("infoDateFormat", js.undefined)
    
    @scala.inline
    def setInfoGitMode(value: InfoGitMode): Self = this.set("infoGitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoGitMode: Self = this.set("infoGitMode", js.undefined)
  }
}
