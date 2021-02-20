package typings.expressValidator

import typings.expressValidator.baseMod.CustomValidator
import typings.expressValidator.contextItemMod.ContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customConditionMod {
  
  @JSImport("express-validator/src/context-items/custom-condition", "CustomCondition")
  @js.native
  class CustomCondition protected () extends ContextItem {
    def this(condition: CustomValidator) = this()
    
    val condition: js.Any = js.native
  }
}
