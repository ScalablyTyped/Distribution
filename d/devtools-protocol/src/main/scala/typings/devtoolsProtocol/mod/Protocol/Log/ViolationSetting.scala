package typings.devtoolsProtocol.mod.Protocol.Log

import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
import typings.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
import typings.devtoolsProtocol.devtoolsProtocolStrings.handler
import typings.devtoolsProtocol.devtoolsProtocolStrings.longLayout
import typings.devtoolsProtocol.devtoolsProtocolStrings.longTask
import typings.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolationSetting extends js.Object {
  
  /**
    * Violation type. (ViolationSettingName enum)
    */
  var name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler = js.native
  
  /**
    * Time threshold to trigger upon.
    */
  var threshold: Double = js.native
}
object ViolationSetting {
  
  @scala.inline
  def apply(
    name: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler,
    threshold: Double
  ): ViolationSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolationSetting]
  }
  
  @scala.inline
  implicit class ViolationSettingOps[Self <: ViolationSetting] (val x: Self) extends AnyVal {
    
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
    def setName(
      value: longTask | longLayout | blockedEvent | blockedParser | discouragedAPIUse | handler | recurringHandler
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
  }
}
