package typings.ember.emberMod.Ember

import org.scalablytyped.runtime.TopLevel
import typings.atEmberDebug.Anon_Id
import typings.atEmberDebug.Anon_IdString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.Debug")
@js.native
object Debug extends js.Object {
  @JSName("registerDeprecationHandler")
  var registerDeprecationHandler_Original: js.Function1[
    /* handler */ js.Function3[
      /* message */ java.lang.String, 
      /* options */ Anon_Id, 
      /* next */ js.Function0[Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  @JSName("registerWarnHandler")
  var registerWarnHandler_Original: js.Function1[
    /* handler */ js.Function3[
      /* message */ java.lang.String, 
      /* options */ Anon_IdString, 
      /* next */ js.Function0[Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  def registerDeprecationHandler(
    handler: js.Function3[
      /* message */ java.lang.String, 
      /* options */ Anon_Id, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
  def registerWarnHandler(
    handler: js.Function3[
      /* message */ java.lang.String, 
      /* options */ Anon_IdString, 
      /* next */ js.Function0[Unit], 
      Unit
    ]
  ): Unit = js.native
}

@JSImport("ember", "Ember.debug")
@js.native
object debug
  extends TopLevel[js.Function1[/* message */ java.lang.String, Unit]]

