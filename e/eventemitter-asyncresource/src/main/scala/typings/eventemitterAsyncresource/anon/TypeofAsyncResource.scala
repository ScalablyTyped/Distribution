package typings.eventemitterAsyncresource.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.asyncHooksMod.AsyncResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAsyncResource extends Instantiable1[/* type */ String, AsyncResource] {
  
  /**
    * Binds the given function to the current execution context.
    * @param fn The function to bind to the current execution context.
    * @param type An optional name to associate with the underlying `AsyncResource`.
    */
  def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func): Func with typings.node.anon.AsyncResource = js.native
  def bind[Func /* <: js.Function1[/* repeated */ js.Any, _] */](fn: Func, `type`: String): Func with typings.node.anon.AsyncResource = js.native
}
