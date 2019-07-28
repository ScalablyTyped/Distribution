package typings.globDashExpand.globDashExpandMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob-expand", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VERSION: String = js.native
  var glob: _glob = js.native
  def apply(opts: Option, patterns: (String | RegExp)*): js.Array[String] = js.native
  def apply(opts: Option, patterns: js.Array[String | RegExp]): js.Array[String] = js.native
  def apply(patterns: (String | RegExp)*): js.Array[String] = js.native
  def apply(patterns: js.Array[String | RegExp]): js.Array[String] = js.native
}

