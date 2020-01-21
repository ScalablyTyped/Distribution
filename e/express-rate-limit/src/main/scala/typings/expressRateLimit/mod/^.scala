package typings.expressRateLimit.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-rate-limit", JSImport.Namespace)
@js.native
class ^ protected () extends Instance {
  def this(options: Options) = this()
  /* CompleteClass */
  override def apply(
    T0: /* req */ Request[ParamsDictionary, js.Any, js.Any],
    T1: /* res */ Response[js.Any],
    T2: /* next */ NextFunction
  ): js.Any = js.native
}

@JSImport("express-rate-limit", JSImport.Namespace)
@js.native
object ^ extends TopLevel[Instantiable1[/* options */ Options, Instance]] {
  def apply(options: Options): Instance = js.native
}

