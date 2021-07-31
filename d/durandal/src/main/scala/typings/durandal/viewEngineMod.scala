package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The viewEngine module provides information to the viewLocator module which is used to locate the view's source file. The viewEngine also transforms a view id into a view instance.
  * @requires system
  * @requires jquery
  */
object viewEngineMod extends Shortcut {
  
  @JSImport("durandal/viewEngine", JSImport.Namespace)
  @js.native
  val ^ : DurandalViewEngineModule = js.native
  
  type _To = DurandalViewEngineModule
  
  /* This means you don't have to write `^`, but can instead just say `viewEngineMod.foo` */
  override def _to: DurandalViewEngineModule = ^
}
