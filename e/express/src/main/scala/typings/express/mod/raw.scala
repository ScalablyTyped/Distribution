package typings.express.mod

import typings.bodyParser.mod.Options
import typings.connect.mod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
  * @since 4.17.0
  */
@JSImport("express", "raw")
@js.native
object raw extends js.Object {
  def apply(): NextHandleFunction = js.native
  def apply(options: Options): NextHandleFunction = js.native
}

