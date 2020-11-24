package typings.easyXapiSupertest.pathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path", "posix")
@js.native
object posix extends js.Object {
  
  def basename(p: String): String = js.native
  def basename(p: String, ext: String): String = js.native
  
  var delimiter: String = js.native
  
  def dirname(p: String): String = js.native
  
  def extname(p: String): String = js.native
  
  def format(pP: ParsedPath): String = js.native
  
  def isAbsolute(p: String): Boolean = js.native
  
  def join(paths: js.Any*): String = js.native
  
  def normalize(p: String): String = js.native
  
  def parse(p: String): ParsedPath = js.native
  
  def relative(from: String, to: String): String = js.native
  
  def resolve(pathSegments: js.Any*): String = js.native
  
  var sep: String = js.native
}
