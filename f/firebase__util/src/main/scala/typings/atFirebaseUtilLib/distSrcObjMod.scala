package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/obj", JSImport.Namespace)
@js.native
object distSrcObjMod extends js.Object {
  def clone(obj: js.Any): js.Any = js.native
  def contains(obj: js.Any, key: js.Any): js.Any = js.native
  def every[V](obj: js.Object, fn: js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[V], scala.Boolean]): scala.Boolean = js.native
  def extend(objTo: js.Any, objFrom: js.Any): js.Any = js.native
  def findKey(obj: js.Any, fn: js.Any): java.lang.String = js.native
  def findKey(obj: js.Any, fn: js.Any, opt_this: js.Any): java.lang.String = js.native
  def findValue(obj: js.Any, fn: js.Any): js.Any = js.native
  def findValue(obj: js.Any, fn: js.Any, opt_this: js.Any): js.Any = js.native
  def forEach(obj: js.Any, fn: js.Any): scala.Unit = js.native
  def getAnyKey(obj: js.Any): java.lang.String = js.native
  def getCount(obj: js.Any): scala.Double = js.native
  def getValues(obj: js.Any): js.Array[_] = js.native
  def isEmpty(obj: js.Any): scala.Boolean = js.native
  def isNonNullObject(obj: js.Any): scala.Boolean = js.native
  def map(obj: js.Any, f: js.Any): js.Object = js.native
  def map(obj: js.Any, f: js.Any, opt_obj: js.Any): js.Object = js.native
  def safeGet(obj: js.Any, key: js.Any): js.Any = js.native
}

