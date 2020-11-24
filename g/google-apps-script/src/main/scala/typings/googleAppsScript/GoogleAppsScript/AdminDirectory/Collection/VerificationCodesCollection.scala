package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.VerificationCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationCodesCollection extends js.Object {
  
  // Generate new backup verification codes for the user.
  def generate(userKey: String): Unit = js.native
  
  // Invalidate the current backup verification codes for the user.
  def invalidate(userKey: String): Unit = js.native
  
  // Returns the current set of valid backup verification codes for the specified user.
  def list(userKey: String): VerificationCodes = js.native
}
object VerificationCodesCollection {
  
  @scala.inline
  def apply(generate: String => Unit, invalidate: String => Unit, list: String => VerificationCodes): VerificationCodesCollection = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), invalidate = js.Any.fromFunction1(invalidate), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VerificationCodesCollection]
  }
  
  @scala.inline
  implicit class VerificationCodesCollectionOps[Self <: VerificationCodesCollection] (val x: Self) extends AnyVal {
    
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
    def setGenerate(value: String => Unit): Self = this.set("generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvalidate(value: String => Unit): Self = this.set("invalidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: String => VerificationCodes): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
