package typings
package atFirebaseUtilLib.distSrcObjMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/obj", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clone[V](obj: UtilObject[V]): UtilObject[V] = js.native
  def contains[V](obj: UtilObject[V], key: java.lang.String): scala.Boolean = js.native
  def every[V](
    obj: UtilObject[V],
    fn: js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[V], scala.Boolean]
  ): scala.Boolean = js.native
  def extend[V](objTo: UtilObject[V], objFrom: UtilObject[V]): UtilObject[V] = js.native
  def findKey[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _]
  ): js.UndefOr[java.lang.String] = js.native
  def findKey[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _],
    context: js.Any
  ): js.UndefOr[java.lang.String] = js.native
  def findValue[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _]
  ): js.UndefOr[atFirebaseUtilLib.atFirebaseUtilLibStrings.Empty | V] = js.native
  def findValue[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _],
    context: js.Any
  ): js.UndefOr[atFirebaseUtilLib.atFirebaseUtilLibStrings.Empty | V] = js.native
  def forEach[V](obj: UtilObject[V], fn: js.Function2[/* key */ java.lang.String, /* value */ V, scala.Unit]): scala.Unit = js.native
  def getAnyKey[V](obj: UtilObject[V]): js.UndefOr[java.lang.String] = js.native
  def getCount[V](obj: UtilObject[V]): scala.Double = js.native
  def getValues[V](obj: UtilObject[V]): js.Array[V] = js.native
  def isEmpty[V](obj: UtilObject[V]): scala.Boolean = js.native
  def isNonNullObject[V](obj: UtilObject[V]): scala.Boolean = js.native
  def map[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _]
  ): UtilObject[V] = js.native
  def map[V](
    obj: UtilObject[V],
    fn: js.Function3[/* value */ V, /* key */ java.lang.String | scala.Double, /* obj */ UtilObject[V], _],
    context: js.Any
  ): UtilObject[V] = js.native
  def safeGet[V](obj: UtilObject[V], key: java.lang.String): js.UndefOr[V] = js.native
}

