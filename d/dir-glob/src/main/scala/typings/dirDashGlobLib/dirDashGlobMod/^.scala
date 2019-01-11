package typings
package dirDashGlobLib.dirDashGlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dir-glob", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: java.lang.String | js.Array[java.lang.String]): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(
    input: java.lang.String | js.Array[java.lang.String],
    options: dirDashGlobLib.dirDashGlobMod.dirGlobNs.Options
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def sync(input: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(input: java.lang.String, options: dirDashGlobLib.dirDashGlobMod.dirGlobNs.Options): js.Array[java.lang.String] = js.native
  def sync(input: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def sync(input: js.Array[java.lang.String], options: dirDashGlobLib.dirDashGlobMod.dirGlobNs.Options): js.Array[java.lang.String] = js.native
}

