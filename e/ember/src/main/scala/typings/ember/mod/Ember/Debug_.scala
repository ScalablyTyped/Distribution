package typings.ember.mod.Ember

import typings.emberDebug.anon.Id
import typings.emberDebug.anon.IdString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Debug_ {
  
  @JSImport("ember", "Ember.Debug")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ember", "Ember.Debug.registerDeprecationHandler")
  @js.native
  def registerDeprecationHandler: js.Function1[
    /* handler */ js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit], 
    Unit
  ] = js.native
  @JSImport("ember", "Ember.Debug.registerDeprecationHandler")
  @js.native
  def registerDeprecationHandler(
    handler: js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit]
  ): Unit = js.native
  @scala.inline
  def registerDeprecationHandler_=(
    x: js.Function1[
      /* handler */ js.Function3[/* message */ java.lang.String, /* options */ Id, /* next */ js.Function0[Unit], Unit], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerDeprecationHandler")(x.asInstanceOf[js.Any])
  
  @JSImport("ember", "Ember.Debug.registerWarnHandler")
  @js.native
  def registerWarnHandler: js.Function1[
    /* handler */ js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function2[/* message */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[IdString], Unit], 
      Unit
    ], 
    Unit
  ] = js.native
  @JSImport("ember", "Ember.Debug.registerWarnHandler")
  @js.native
  def registerWarnHandler(
    handler: js.Function3[
      /* message */ java.lang.String, 
      /* options */ IdString, 
      /* next */ js.Function2[/* message */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[IdString], Unit], 
      Unit
    ]
  ): Unit = js.native
  @scala.inline
  def registerWarnHandler_=(
    x: js.Function1[
      /* handler */ js.Function3[
        /* message */ java.lang.String, 
        /* options */ IdString, 
        /* next */ js.Function2[/* message */ js.UndefOr[java.lang.String], /* options */ js.UndefOr[IdString], Unit], 
        Unit
      ], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerWarnHandler")(x.asInstanceOf[js.Any])
}
