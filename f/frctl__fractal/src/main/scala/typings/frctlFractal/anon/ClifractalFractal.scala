package typings.frctlFractal.anon

import typings.frctlFractal.mod.Fractal_
import typings.frctlFractal.mod.fractal.cli.Console
import typings.frctlFractal.mod.fractal.cli.Notifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @frctl/fractal.@frctl/fractal.fractal.cli.Cli & {  fractal :@frctl/fractal.@frctl/fractal.Fractal} */
@js.native
trait ClifractalFractal extends StObject {
  
  def command(
    commandString: String,
    callback: js.ThisFunction2[/* this */ this.type & Fractal, /* args */ Any, /* done */ js.Function0[Unit], Unit]
  ): Unit = js.native
  def command(
    commandString: String,
    callback: js.ThisFunction2[/* this */ this.type & Fractal, /* args */ Any, /* done */ js.Function0[Unit], Unit],
    opts: String
  ): Unit = js.native
  def command(
    commandString: String,
    callback: js.ThisFunction2[/* this */ this.type & Fractal, /* args */ Any, /* done */ js.Function0[Unit], Unit],
    opts: Description
  ): Unit = js.native
  
  var console: Console = js.native
  
  def error(message: String): Unit = js.native
  
  def exec(command: String): Unit = js.native
  
  var fractal: Fractal_ = js.native
  
  def get(command: String): Any = js.native
  
  def has(command: String): Boolean = js.native
  
  def isInteractive(): Boolean = js.native
  
  def log(message: String): Unit = js.native
  
  @JSName("notify")
  var notify_FClifractalFractal: Notifier = js.native
}
