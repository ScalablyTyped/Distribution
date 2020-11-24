package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPasswordQuestionsRequired extends js.Object {
  
  /**
    * The maximum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or greater than `minimumQuestions`.
    */
  var maximumQuestions: js.UndefOr[String] = js.native
  
  /**
    * The minimum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or less than `maximumQuestions`.
    */
  var minimumQuestions: js.UndefOr[String] = js.native
}
object AccountPasswordQuestionsRequired {
  
  @scala.inline
  def apply(): AccountPasswordQuestionsRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordQuestionsRequired]
  }
  
  @scala.inline
  implicit class AccountPasswordQuestionsRequiredOps[Self <: AccountPasswordQuestionsRequired] (val x: Self) extends AnyVal {
    
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
    def setMaximumQuestions(value: String): Self = this.set("maximumQuestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumQuestions: Self = this.set("maximumQuestions", js.undefined)
    
    @scala.inline
    def setMinimumQuestions(value: String): Self = this.set("minimumQuestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumQuestions: Self = this.set("minimumQuestions", js.undefined)
  }
}
