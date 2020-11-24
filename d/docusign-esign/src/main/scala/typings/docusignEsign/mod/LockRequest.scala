package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockRequest extends js.Object {
  
  /**
    * The number of seconds to lock the envelope for editing.  This value must be greater than `0` seconds.
    */
  var lockDurationInSeconds: js.UndefOr[String] = js.native
  
  /**
    * The type of lock.  Currently `edit` is the only supported type.
    */
  var lockType: js.UndefOr[String] = js.native
  
  /**
    * The human-readable name of the application that is locking the envelope or template. This value displays to the user in error messages when lock conflicts occur.
    */
  var lockedByApp: js.UndefOr[String] = js.native
  
  /**
    * The [password for the template](https://support.docusign.com/en/guides/ndse-user-guide-template-passwords). If you are using a lock for a template that
    * has a password or an envelope that is based on a template that has a password, you must enter the `templatePassword` to save the changes.
    */
  var templatePassword: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a scratchpad is used to edit information.
    *
    */
  var useScratchPad: js.UndefOr[String] = js.native
}
object LockRequest {
  
  @scala.inline
  def apply(): LockRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockRequest]
  }
  
  @scala.inline
  implicit class LockRequestOps[Self <: LockRequest] (val x: Self) extends AnyVal {
    
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
    def setLockDurationInSeconds(value: String): Self = this.set("lockDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDurationInSeconds: Self = this.set("lockDurationInSeconds", js.undefined)
    
    @scala.inline
    def setLockType(value: String): Self = this.set("lockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockType: Self = this.set("lockType", js.undefined)
    
    @scala.inline
    def setLockedByApp(value: String): Self = this.set("lockedByApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedByApp: Self = this.set("lockedByApp", js.undefined)
    
    @scala.inline
    def setTemplatePassword(value: String): Self = this.set("templatePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatePassword: Self = this.set("templatePassword", js.undefined)
    
    @scala.inline
    def setUseScratchPad(value: String): Self = this.set("useScratchPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseScratchPad: Self = this.set("useScratchPad", js.undefined)
  }
}
