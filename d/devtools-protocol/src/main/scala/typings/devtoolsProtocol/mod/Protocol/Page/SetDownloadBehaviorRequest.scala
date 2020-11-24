package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.allow
import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import typings.devtoolsProtocol.devtoolsProtocolStrings.deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDownloadBehaviorRequest extends js.Object {
  
  /**
    * Whether to allow all or deny all download requests, or use default Chrome behavior if
    * available (otherwise deny). (SetDownloadBehaviorRequestBehavior enum)
    */
  var behavior: deny | allow | default_ = js.native
  
  /**
    * The default path to save downloaded files to. This is requred if behavior is set to 'allow'
    */
  var downloadPath: js.UndefOr[String] = js.native
}
object SetDownloadBehaviorRequest {
  
  @scala.inline
  def apply(behavior: deny | allow | default_): SetDownloadBehaviorRequest = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDownloadBehaviorRequest]
  }
  
  @scala.inline
  implicit class SetDownloadBehaviorRequestOps[Self <: SetDownloadBehaviorRequest] (val x: Self) extends AnyVal {
    
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
    def setBehavior(value: deny | allow | default_): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadPath(value: String): Self = this.set("downloadPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadPath: Self = this.set("downloadPath", js.undefined)
  }
}
