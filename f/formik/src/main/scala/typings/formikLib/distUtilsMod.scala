package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("formik/dist/utils", JSImport.Namespace)
@js.native
object distUtilsMod extends js.Object {
  def getActiveElement(): stdLib.Element | scala.Null = js.native
  def getActiveElement(doc: stdLib.Document): stdLib.Element | scala.Null = js.native
  def getIn(obj: js.Any, key: java.lang.String): js.Any = js.native
  def getIn(obj: js.Any, key: java.lang.String, `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: java.lang.String, `def`: js.Any, p: scala.Double): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String]): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String], `def`: js.Any): js.Any = js.native
  def getIn(obj: js.Any, key: js.Array[java.lang.String], `def`: js.Any, p: scala.Double): js.Any = js.native
  def isEmptyChildren(children: js.Any): scala.Boolean = js.native
  def isFunction(obj: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isInteger(obj: js.Any): scala.Boolean = js.native
  def isNaN(obj: js.Any): scala.Boolean = js.native
  def isObject(obj: js.Any): scala.Boolean = js.native
  def isPromise(value: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def isString(obj: js.Any): /* is string */ scala.Boolean = js.native
  def makeCancelable[T /* <: js.Promise[_] */](promise: T): js.Tuple2[T, js.Function0[scala.Unit]] = js.native
  def setIn(obj: js.Any, path: java.lang.String, value: js.Any): js.Any = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any): T = js.native
  def setNestedObjectValues[T](`object`: js.Any, value: js.Any, visited: js.Any, response: js.Any): T = js.native
}

