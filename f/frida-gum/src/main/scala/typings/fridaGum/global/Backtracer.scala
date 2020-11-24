package typings.fridaGum.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:no-unnecessary-class
@JSGlobal("Backtracer")
@js.native
class Backtracer ()
  extends typings.fridaGum.Backtracer
/* static members */
@JSGlobal("Backtracer")
@js.native
object Backtracer extends js.Object {
  
  /**
    * The accurate kind of backtracers rely on debugger-friendly binaries or
    * presence of debug information to do a good job, but avoid false
    * positives.
    */
  var ACCURATE: typings.fridaGum.Backtracer = js.native
  
  /**
    * The fuzzy backtracers perform forensics on the stack in order to guess
    * the return addresses, which means you will get false positives, but it
    * will work on any binary.
    */
  var FUZZY: typings.fridaGum.Backtracer = js.native
}
