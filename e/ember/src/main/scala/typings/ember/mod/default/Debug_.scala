package typings.ember.mod.default

import typings.emberDebug.anon.Id
import typings.emberDebug.anon.IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Debug")
@js.native
object Debug_ extends js.Object {
  @JSName("registerDeprecationHandler")
  var registerDeprecationHandler_Original: js.Function1[
    /* handler */ js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit], 
    Unit
  ] = js.native
  @JSName("registerWarnHandler")
  var registerWarnHandler_Original: js.Function1[
    /* handler */ js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function0[Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  def registerDeprecationHandler(
    handler: js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def registerWarnHandler(
    handler: js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
}

