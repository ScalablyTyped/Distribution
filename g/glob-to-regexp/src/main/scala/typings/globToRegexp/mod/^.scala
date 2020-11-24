package typings.globToRegexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glob-to-regexp", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(glob: String): RegExp = js.native
  def apply(glob: String, options: Options): RegExp = js.native
}
