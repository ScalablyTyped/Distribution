package typings.domChromiumInstallationEvents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptResponseObject extends StObject {
  
  val outcome: AppBannerPromptOutcome
  
  val platform: String
}
object PromptResponseObject {
  
  inline def apply(outcome: AppBannerPromptOutcome, platform: String): PromptResponseObject = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptResponseObject]
  }
  
  extension [Self <: PromptResponseObject](x: Self) {
    
    inline def setOutcome(value: AppBannerPromptOutcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
  }
}
