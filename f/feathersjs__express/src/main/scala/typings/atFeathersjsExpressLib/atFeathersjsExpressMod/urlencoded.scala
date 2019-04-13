package typings
package atFeathersjsExpressLib.atFeathersjsExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
  * @since 4.16.0
  */
@JSImport("@feathersjs/express", "urlencoded")
@js.native
object urlencoded extends js.Object {
  def apply(): connectLib.connectMod.NextHandleFunction = js.native
  def apply(options: bodyDashParserLib.bodyDashParserMod.OptionsUrlencoded): connectLib.connectMod.NextHandleFunction = js.native
}

