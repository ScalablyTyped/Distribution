package typings.express.mod

import typings.bodyParser.mod.OptionsUrlencoded
import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
  * @since 4.16.0
  */
@JSImport("express", "urlencoded")
@js.native
object urlencoded extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
}

