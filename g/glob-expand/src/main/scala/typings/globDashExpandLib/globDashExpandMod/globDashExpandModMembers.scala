package typings
package globDashExpandLib.globDashExpandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("glob-expand", JSImport.Namespace)
@js.native
object globDashExpandModMembers extends js.Object {
  var VERSION: java.lang.String = js.native
  var glob: globDashExpandLib._glob = js.native
  def apply(opts: Option, patterns: (java.lang.String | stdLib.RegExp)*): js.Array[java.lang.String] = js.native
  def apply(opts: Option, patterns: js.Array[java.lang.String | stdLib.RegExp]): js.Array[java.lang.String] = js.native
  def apply(patterns: (java.lang.String | stdLib.RegExp)*): js.Array[java.lang.String] = js.native
  def apply(patterns: js.Array[java.lang.String | stdLib.RegExp]): js.Array[java.lang.String] = js.native
}

