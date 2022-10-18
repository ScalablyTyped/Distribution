package typings.feathersjsSocketio

import org.scalablytyped.runtime.Shortcut
import typings.socketIo.distTypedEventsMod.DefaultEventsMap
import typings.socketIo.mod.Server
import typings.socketIo.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@feathersjs/socketio", JSImport.Namespace)
  @js.native
  val ^ : FeathersSocketIO = js.native
  
  @js.native
  trait FeathersSocketIO extends StObject {
    
    def apply(): js.Function0[Unit] = js.native
    def apply(
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def apply(options: Double): js.Function0[Unit] = js.native
    def apply(
      options: Double,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def apply(options: ServerOptions): js.Function0[Unit] = js.native
    def apply(
      options: ServerOptions,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def apply(
      port: Double,
      options: Unit,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def apply(port: Double, options: ServerOptions): js.Function0[Unit] = js.native
    def apply(
      port: Double,
      options: ServerOptions,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    
    def default(): js.Function0[Unit] = js.native
    def default(
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def default(options: Double): js.Function0[Unit] = js.native
    def default(
      options: Double,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def default(options: ServerOptions): js.Function0[Unit] = js.native
    def default(
      options: ServerOptions,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def default(
      port: Double,
      options: Unit,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    def default(port: Double, options: ServerOptions): js.Function0[Unit] = js.native
    def default(
      port: Double,
      options: ServerOptions,
      callback: js.Function1[/* io */ Server[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], Unit]
    ): js.Function0[Unit] = js.native
    
    val SOCKET_KEY: js.Symbol = js.native
    
    @JSName("default")
    var default_Original: FeathersSocketIO = js.native
  }
  
  type _To = FeathersSocketIO
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FeathersSocketIO = ^
}
