package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LockInformation extends js.Object {
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The number of seconds to lock the envelope for editing.  This value must be greater than `0` seconds.
    */
  var lockDurationInSeconds: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier provided to the owner of the lock. You must use this token with subsequent calls to prove ownership of the lock.
    */
  var lockToken: js.UndefOr[String] = js.native
  
  /**
    * The type of lock.  Currently `edit` is the only supported type.
    */
  var lockType: js.UndefOr[String] = js.native
  
  /**
    * The human-readable name of the application that is locking the envelope or template. This value displays to the user in error messages when lock conflicts occur.
    */
  var lockedByApp: js.UndefOr[String] = js.native
  
  /**
    * A complex type containing information about the user that has the envelope or template locked.
    */
  var lockedByUser: js.UndefOr[UserInfo] = js.native
  
  /**
    * The date and time that the lock expires.
    */
  var lockedUntilDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a scratchpad is used to edit information.
    *
    */
  var useScratchPad: js.UndefOr[String] = js.native
}
object LockInformation {
  
  @scala.inline
  def apply(): LockInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockInformation]
  }
  
  @scala.inline
  implicit class LockInformationOps[Self <: LockInformation] (val x: Self) extends AnyVal {
    
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
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setLockDurationInSeconds(value: String): Self = this.set("lockDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDurationInSeconds: Self = this.set("lockDurationInSeconds", js.undefined)
    
    @scala.inline
    def setLockToken(value: String): Self = this.set("lockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockToken: Self = this.set("lockToken", js.undefined)
    
    @scala.inline
    def setLockType(value: String): Self = this.set("lockType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockType: Self = this.set("lockType", js.undefined)
    
    @scala.inline
    def setLockedByApp(value: String): Self = this.set("lockedByApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedByApp: Self = this.set("lockedByApp", js.undefined)
    
    @scala.inline
    def setLockedByUser(value: UserInfo): Self = this.set("lockedByUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedByUser: Self = this.set("lockedByUser", js.undefined)
    
    @scala.inline
    def setLockedUntilDateTime(value: String): Self = this.set("lockedUntilDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedUntilDateTime: Self = this.set("lockedUntilDateTime", js.undefined)
    
    @scala.inline
    def setUseScratchPad(value: String): Self = this.set("useScratchPad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseScratchPad: Self = this.set("useScratchPad", js.undefined)
  }
}
