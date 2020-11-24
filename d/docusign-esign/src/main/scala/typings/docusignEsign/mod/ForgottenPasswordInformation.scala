package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForgottenPasswordInformation extends js.Object {
  
  /**
    * The answer to the first forgotten password challenge question.
    */
  var forgottenPasswordAnswer1: js.UndefOr[String] = js.native
  
  /**
    * The answer to the second forgotten password challenge question.
    */
  var forgottenPasswordAnswer2: js.UndefOr[String] = js.native
  
  /**
    * The answer to the third forgotten password challenge question.
    */
  var forgottenPasswordAnswer3: js.UndefOr[String] = js.native
  
  /**
    * The answer to the fourth forgotten password challenge question.
    */
  var forgottenPasswordAnswer4: js.UndefOr[String] = js.native
  
  /**
    * The first challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion1: js.UndefOr[String] = js.native
  
  /**
    * The second challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion2: js.UndefOr[String] = js.native
  
  /**
    * The third challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion3: js.UndefOr[String] = js.native
  
  /**
    * The fourth challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion4: js.UndefOr[String] = js.native
}
object ForgottenPasswordInformation {
  
  @scala.inline
  def apply(): ForgottenPasswordInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForgottenPasswordInformation]
  }
  
  @scala.inline
  implicit class ForgottenPasswordInformationOps[Self <: ForgottenPasswordInformation] (val x: Self) extends AnyVal {
    
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
    def setForgottenPasswordAnswer1(value: String): Self = this.set("forgottenPasswordAnswer1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordAnswer1: Self = this.set("forgottenPasswordAnswer1", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer2(value: String): Self = this.set("forgottenPasswordAnswer2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordAnswer2: Self = this.set("forgottenPasswordAnswer2", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer3(value: String): Self = this.set("forgottenPasswordAnswer3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordAnswer3: Self = this.set("forgottenPasswordAnswer3", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer4(value: String): Self = this.set("forgottenPasswordAnswer4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordAnswer4: Self = this.set("forgottenPasswordAnswer4", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion1(value: String): Self = this.set("forgottenPasswordQuestion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordQuestion1: Self = this.set("forgottenPasswordQuestion1", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion2(value: String): Self = this.set("forgottenPasswordQuestion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordQuestion2: Self = this.set("forgottenPasswordQuestion2", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion3(value: String): Self = this.set("forgottenPasswordQuestion3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordQuestion3: Self = this.set("forgottenPasswordQuestion3", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion4(value: String): Self = this.set("forgottenPasswordQuestion4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordQuestion4: Self = this.set("forgottenPasswordQuestion4", js.undefined)
  }
}
