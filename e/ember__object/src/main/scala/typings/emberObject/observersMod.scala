package typings.emberObject

import typings.emberObject.typesMod.ObserverMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observersMod {
  
  @JSImport("@ember/object/observers", "addObserver")
  @js.native
  def addObserver[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): Unit = js.native
  @JSImport("@ember/object/observers", "addObserver")
  @js.native
  def addObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  
  @JSImport("@ember/object/observers", "removeObserver")
  @js.native
  def removeObserver[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): js.Any = js.native
  @JSImport("@ember/object/observers", "removeObserver")
  @js.native
  def removeObserver[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): js.Any = js.native
}
