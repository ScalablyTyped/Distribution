package typings
package atFirebaseUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/util/dist/src/obj", JSImport.Namespace)
@js.native
object distSrcObjMod extends js.Object {
  @JSName("clone")
  val clone_FdistSrcObjMod: js.Function1[/* obj */ js.Any, js.Any] = js.native
  val contains: js.Function2[/* obj */ js.Any, /* key */ js.Any, js.Any] = js.native
  val every: js.Function2[
    /* obj */ js.Object, 
    /* fn */ js.Function2[/* k */ java.lang.String, /* v */ js.UndefOr[js.Any], scala.Boolean], 
    scala.Boolean
  ] = js.native
  val extend: js.Function2[/* objTo */ js.Any, /* objFrom */ js.Any, js.Any] = js.native
  val findKey: js.Function3[/* obj */ js.Any, /* fn */ js.Any, /* opt_this */ js.UndefOr[js.Any], java.lang.String] = js.native
  val findValue: js.Function3[/* obj */ js.Any, /* fn */ js.Any, /* opt_this */ js.UndefOr[js.Any], js.Any] = js.native
  val forEach: js.Function2[/* obj */ js.Any, /* fn */ js.Any, scala.Unit] = js.native
  val getAnyKey: js.Function1[/* obj */ js.Any, java.lang.String] = js.native
  val getCount: js.Function1[/* obj */ js.Any, scala.Double] = js.native
  val getValues: js.Function1[/* obj */ js.Any, js.Array[js.Any]] = js.native
  val isEmpty: js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  val isNonNullObject: js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  val map: js.Function3[/* obj */ js.Any, /* f */ js.Any, /* opt_obj */ js.UndefOr[js.Any], js.Object] = js.native
  val safeGet: js.Function2[/* obj */ js.Any, /* key */ js.Any, js.Any] = js.native
}

