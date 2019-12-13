package typings.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod.atFirebaseComponentMod

import typings.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod.FirebaseFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameServiceMapping extends js.Object {
  var functions: FirebaseFunctions
}

object NameServiceMapping {
  @scala.inline
  def apply(functions: FirebaseFunctions): NameServiceMapping = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NameServiceMapping]
  }
}

