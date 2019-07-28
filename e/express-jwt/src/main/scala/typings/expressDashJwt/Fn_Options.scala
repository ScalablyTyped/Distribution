package typings.expressDashJwt

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.expressDashUnless.expressDashUnlessMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(options: js.Function1[/* req */ Request, Boolean]): RequestHandler = js.native
  def apply(options: Options): RequestHandler = js.native
}

