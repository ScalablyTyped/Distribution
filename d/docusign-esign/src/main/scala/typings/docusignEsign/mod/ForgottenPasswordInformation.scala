package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForgottenPasswordInformation extends StObject {
  
  /**
    * The answer to the first forgotten password challenge question.
    */
  var forgottenPasswordAnswer1: js.UndefOr[String] = js.undefined
  
  /**
    * The answer to the second forgotten password challenge question.
    */
  var forgottenPasswordAnswer2: js.UndefOr[String] = js.undefined
  
  /**
    * The answer to the third forgotten password challenge question.
    */
  var forgottenPasswordAnswer3: js.UndefOr[String] = js.undefined
  
  /**
    * The answer to the fourth forgotten password challenge question.
    */
  var forgottenPasswordAnswer4: js.UndefOr[String] = js.undefined
  
  /**
    * The first challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion1: js.UndefOr[String] = js.undefined
  
  /**
    * The second challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion2: js.UndefOr[String] = js.undefined
  
  /**
    * The third challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion3: js.UndefOr[String] = js.undefined
  
  /**
    * The fourth challenge question presented to a user who has forgotten their password.
    */
  var forgottenPasswordQuestion4: js.UndefOr[String] = js.undefined
}
object ForgottenPasswordInformation {
  
  @scala.inline
  def apply(): ForgottenPasswordInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForgottenPasswordInformation]
  }
  
  @scala.inline
  implicit class ForgottenPasswordInformationMutableBuilder[Self <: ForgottenPasswordInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForgottenPasswordAnswer1(value: String): Self = StObject.set(x, "forgottenPasswordAnswer1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordAnswer1Undefined: Self = StObject.set(x, "forgottenPasswordAnswer1", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer2(value: String): Self = StObject.set(x, "forgottenPasswordAnswer2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordAnswer2Undefined: Self = StObject.set(x, "forgottenPasswordAnswer2", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer3(value: String): Self = StObject.set(x, "forgottenPasswordAnswer3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordAnswer3Undefined: Self = StObject.set(x, "forgottenPasswordAnswer3", js.undefined)
    
    @scala.inline
    def setForgottenPasswordAnswer4(value: String): Self = StObject.set(x, "forgottenPasswordAnswer4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordAnswer4Undefined: Self = StObject.set(x, "forgottenPasswordAnswer4", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion1(value: String): Self = StObject.set(x, "forgottenPasswordQuestion1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordQuestion1Undefined: Self = StObject.set(x, "forgottenPasswordQuestion1", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion2(value: String): Self = StObject.set(x, "forgottenPasswordQuestion2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordQuestion2Undefined: Self = StObject.set(x, "forgottenPasswordQuestion2", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion3(value: String): Self = StObject.set(x, "forgottenPasswordQuestion3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordQuestion3Undefined: Self = StObject.set(x, "forgottenPasswordQuestion3", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestion4(value: String): Self = StObject.set(x, "forgottenPasswordQuestion4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForgottenPasswordQuestion4Undefined: Self = StObject.set(x, "forgottenPasswordQuestion4", js.undefined)
  }
}
