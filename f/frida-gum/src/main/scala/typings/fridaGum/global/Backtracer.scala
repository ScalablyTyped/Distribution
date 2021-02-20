package typings.fridaGum.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:no-unnecessary-class
@JSGlobal("Backtracer")
@js.native
class Backtracer ()
  extends typings.fridaGum.Backtracer
object Backtracer {
  
  @JSGlobal("Backtracer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The accurate kind of backtracers rely on debugger-friendly binaries or
    * presence of debug information to do a good job, but avoid false
    * positives.
    */
  /* static member */
  @JSGlobal("Backtracer.ACCURATE")
  @js.native
  def ACCURATE: typings.fridaGum.Backtracer = js.native
  @scala.inline
  def ACCURATE_=(x: typings.fridaGum.Backtracer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCURATE")(x.asInstanceOf[js.Any])
  
  /**
    * The fuzzy backtracers perform forensics on the stack in order to guess
    * the return addresses, which means you will get false positives, but it
    * will work on any binary.
    */
  /* static member */
  @JSGlobal("Backtracer.FUZZY")
  @js.native
  def FUZZY: typings.fridaGum.Backtracer = js.native
  @scala.inline
  def FUZZY_=(x: typings.fridaGum.Backtracer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FUZZY")(x.asInstanceOf[js.Any])
}
