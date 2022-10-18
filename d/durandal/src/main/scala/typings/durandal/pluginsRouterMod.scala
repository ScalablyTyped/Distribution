package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Connects the history module's url and history tracking support to Durandal's activation and composition engine allowing you to easily build navigation-style applications.
  * @requires system
  * @requires app
  * @requires activator
  * @requires events
  * @requires composition
  * @requires history
  * @requires knockout
  * @requires jquery
  */
object pluginsRouterMod extends Shortcut {
  
  @JSImport("plugins/router", JSImport.Namespace)
  @js.native
  val ^ : DurandalRootRouter = js.native
  
  type _To = DurandalRootRouter
  
  /* This means you don't have to write `^`, but can instead just say `pluginsRouterMod.foo` */
  override def _to: DurandalRootRouter = ^
}
