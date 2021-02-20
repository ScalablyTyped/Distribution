package typings.emberDebug

import typings.emberDebug.anon.Id
import typings.emberDebug.anon.IdString
import typings.emberDebug.anon.Until
import typings.emberDebug.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/debug", "assert")
  @js.native
  def assert(desc: String): scala.Nothing = js.native
  @JSImport("@ember/debug", "assert")
  @js.native
  def assert(desc: String, test: js.Any): /* asserts test */ Boolean = js.native
  
  @JSImport("@ember/debug", "debug")
  @js.native
  def debug(message: String): Unit = js.native
  
  @JSImport("@ember/debug", "deprecate")
  @js.native
  def deprecate(message: String, test: Boolean, options: Until): Unit = js.native
  
  @JSImport("@ember/debug", "inspect")
  @js.native
  def inspect(obj: js.Any): String = js.native
  
  @JSImport("@ember/debug", "registerDeprecationHandler")
  @js.native
  def registerDeprecationHandler(handler: js.Function3[/* message */ String, /* options */ Id, /* next */ js.Function0[Unit], Unit]): Unit = js.native
  
  @JSImport("@ember/debug", "registerWarnHandler")
  @js.native
  def registerWarnHandler(
    handler: js.Function3[
      /* message */ String, 
      /* options */ IdString, 
      /* next */ js.Function2[/* message */ js.UndefOr[String], /* options */ js.UndefOr[IdString], Unit], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("@ember/debug", "runInDebug")
  @js.native
  def runInDebug(func: js.Function0[_]): Unit = js.native
  
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String, options: IdString): Unit = js.native
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String, options: `0`): Unit = js.native
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String, test: Boolean): Unit = js.native
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String, test: Boolean, options: IdString): Unit = js.native
  @JSImport("@ember/debug", "warn")
  @js.native
  def warn(message: String, test: Boolean, options: `0`): Unit = js.native
}
