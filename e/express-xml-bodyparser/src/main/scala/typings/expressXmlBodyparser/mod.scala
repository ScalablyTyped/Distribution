package typings.expressXmlBodyparser

import typings.express.mod.Handler
import typings.std.RegExp
import typings.xml2js.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-xml-bodyparser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Handler = js.native
  def apply(options: ParserOptions): Handler = js.native
  
  // @deprecated Will be removed in future versions
  var regexp: RegExp = js.native
}
