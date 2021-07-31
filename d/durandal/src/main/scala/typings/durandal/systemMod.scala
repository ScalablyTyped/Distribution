package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The system module encapsulates the most basic features used by other modules.
  * @requires require
  * @requires jquery
  */
object systemMod extends Shortcut {
  
  @JSImport("durandal/system", JSImport.Namespace)
  @js.native
  val ^ : DurandalSystemModule = js.native
  
  type _To = DurandalSystemModule
  
  /* This means you don't have to write `^`, but can instead just say `systemMod.foo` */
  override def _to: DurandalSystemModule = ^
}
