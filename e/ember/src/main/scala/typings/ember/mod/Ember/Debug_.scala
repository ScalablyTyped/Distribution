package typings.ember.mod.Ember

import typings.emberDebug.anon.Id
import typings.emberDebug.anon.IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember", "Ember.Debug")
@js.native
object Debug_ extends js.Object {
  
  def registerDeprecationHandler(
    handler: js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  @JSName("registerDeprecationHandler")
  var registerDeprecationHandler_Original: js.Function1[
    /* handler */ js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit], 
    Unit
  ] = js.native
  
  def registerWarnHandler(
    handler: js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function2[/* message */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[IdString], Unit], 
      Unit
    ]
  ): Unit = js.native
  @JSName("registerWarnHandler")
  var registerWarnHandler_Original: js.Function1[
    /* handler */ js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function2[/* message */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[IdString], Unit], 
      Unit
    ], 
    Unit
  ] = js.native
}
