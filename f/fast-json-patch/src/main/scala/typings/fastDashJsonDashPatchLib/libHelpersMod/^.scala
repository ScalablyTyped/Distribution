package typings
package fastDashJsonDashPatchLib.libHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/lib/helpers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def _deepClone(obj: js.Any): js.Any = js.native
  def _getPathRecursive(root: js.Object, obj: js.Object): java.lang.String = js.native
  def _objectKeys(obj: js.Any): js.Array[_] = js.native
  def escapePathComponent(path: java.lang.String): java.lang.String = js.native
  def getPath(root: js.Object, obj: js.Object): java.lang.String = js.native
  def hasOwnProperty(obj: js.Any, key: js.Any): js.Any = js.native
  def hasUndefined(obj: js.Any): scala.Boolean = js.native
  def isInteger(str: java.lang.String): scala.Boolean = js.native
  def unescapePathComponent(path: java.lang.String): java.lang.String = js.native
}

