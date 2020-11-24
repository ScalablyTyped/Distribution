package typings.emberTestHelpers.waitForMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/test-helpers/dom/wait-for", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(selector: String): js.Promise[Element | js.Array[Element]] = js.native
  def apply(selector: String, options: Options): js.Promise[Element | js.Array[Element]] = js.native
}
