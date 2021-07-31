package typings.durandal

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The viewLocator module collaborates with the viewEngine module to provide views (literally dom sub-trees) to other parts of the framework as needed. The primary consumer of the viewLocator is the composition module.
  * @requires system
  * @requires viewEngine
  */
object viewLocatorMod extends Shortcut {
  
  @JSImport("durandal/viewLocator", JSImport.Namespace)
  @js.native
  val ^ : DurandalViewLocatorModule = js.native
  
  type _To = DurandalViewLocatorModule
  
  /* This means you don't have to write `^`, but can instead just say `viewLocatorMod.foo` */
  override def _to: DurandalViewLocatorModule = ^
}
