package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The app module controls app startup, plugin loading/configuration and root visual display.
  * @requires system
  * @requires viewEngine
  * @requires composition
  * @requires events
  * @requires jquery
  */
object appMod extends Shortcut {
  
  @JSImport("durandal/app", JSImport.Namespace)
  @js.native
  val ^ : DurandalAppModule = js.native
  
  type _To = DurandalAppModule
  
  /* This means you don't have to write `^`, but can instead just say `appMod.foo` */
  override def _to: DurandalAppModule = ^
}
