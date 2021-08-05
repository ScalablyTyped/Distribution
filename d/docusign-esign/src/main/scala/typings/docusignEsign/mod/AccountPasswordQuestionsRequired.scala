package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountPasswordQuestionsRequired extends StObject {
  
  /**
    * The maximum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or greater than `minimumQuestions`.
    */
  var maximumQuestions: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum number of password reset questions allowed for the account. This number must be between `0` and `4`, and equal to or less than `maximumQuestions`.
    */
  var minimumQuestions: js.UndefOr[String] = js.undefined
}
object AccountPasswordQuestionsRequired {
  
  inline def apply(): AccountPasswordQuestionsRequired = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPasswordQuestionsRequired]
  }
  
  extension [Self <: AccountPasswordQuestionsRequired](x: Self) {
    
    inline def setMaximumQuestions(value: String): Self = StObject.set(x, "maximumQuestions", value.asInstanceOf[js.Any])
    
    inline def setMaximumQuestionsUndefined: Self = StObject.set(x, "maximumQuestions", js.undefined)
    
    inline def setMinimumQuestions(value: String): Self = StObject.set(x, "minimumQuestions", value.asInstanceOf[js.Any])
    
    inline def setMinimumQuestionsUndefined: Self = StObject.set(x, "minimumQuestions", js.undefined)
  }
}
