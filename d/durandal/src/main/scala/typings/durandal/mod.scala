package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The activator module encapsulates all logic related to screen/component activation.
  * An activator is essentially an asynchronous state machine that understands a particular state transition protocol.
  * The protocol ensures that the following series of events always occur: `canDeactivate` (previous state), `canActivate` (new state), `deactivate` (previous state), `activate` (new state).
  * Each of the _can_ callbacks may return a boolean, affirmative value or promise for one of those. If either of the _can_ functions yields a false result, then activation halts.
  * @requires system
  * @requires knockout
  */
object mod {
  
  @JSImport("durandal/activator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[T](): DurandalActivator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DurandalActivator[T]]
  inline def create[T](initialActiveItem: T): DurandalActivator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialActiveItem.asInstanceOf[js.Any]).asInstanceOf[DurandalActivator[T]]
  inline def create[T](initialActiveItem: T, settings: DurandalActivatorSettings): DurandalActivator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialActiveItem.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalActivator[T]]
  inline def create[T](initialActiveItem: Unit, settings: DurandalActivatorSettings): DurandalActivator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(initialActiveItem.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DurandalActivator[T]]
  
  @JSImport("durandal/activator", "defaults")
  @js.native
  def defaults: DurandalActivatorSettings = js.native
  inline def defaults_=(x: DurandalActivatorSettings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  inline def isActivator(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isActivator")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
