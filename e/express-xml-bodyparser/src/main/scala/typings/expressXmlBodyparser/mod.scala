package typings.expressXmlBodyparser

import typings.express.mod.Handler
import typings.std.RegExp
import typings.xml2js.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-xml-bodyparser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // @deprecated Will be removed in future versions
  var regexp: RegExp = js.native
  def apply(): Handler = js.native
  def apply(options: Options): Handler = js.native
}

