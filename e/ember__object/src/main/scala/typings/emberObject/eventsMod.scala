package typings.emberObject

import typings.emberObject.typesMod.ObserverMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@ember/object/events", "addListener")
  @js.native
  def addListener[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): Unit = js.native
  @JSImport("@ember/object/events", "addListener")
  @js.native
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  @JSImport("@ember/object/events", "addListener")
  @js.native
  def addListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context],
    once: Boolean
  ): Unit = js.native
  
  @JSImport("@ember/object/events", "removeListener")
  @js.native
  def removeListener[Context](obj: Context, key: /* keyof Context */ String, method: ObserverMethod[Context, Context]): js.Any = js.native
  @JSImport("@ember/object/events", "removeListener")
  @js.native
  def removeListener[Context, Target](
    obj: Context,
    key: /* keyof Context */ String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): js.Any = js.native
  
  @JSImport("@ember/object/events", "sendEvent")
  @js.native
  def sendEvent(obj: js.Any, eventName: String): Boolean = js.native
  @JSImport("@ember/object/events", "sendEvent")
  @js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.UndefOr[scala.Nothing], actions: js.Array[_]): Boolean = js.native
  @JSImport("@ember/object/events", "sendEvent")
  @js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.Array[_]): Boolean = js.native
  @JSImport("@ember/object/events", "sendEvent")
  @js.native
  def sendEvent(obj: js.Any, eventName: String, params: js.Array[_], actions: js.Array[_]): Boolean = js.native
}
