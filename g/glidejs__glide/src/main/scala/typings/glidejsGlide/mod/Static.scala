package typings.glidejsGlide.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static
  extends // tslint:disable-next-line:no-misused-new
Instantiable1[/* selector */ String, Static]
     with Instantiable2[/* selector */ String, /* options */ Options, Static] {
  
  /**
    * A Glide instance is in "uninitialized" mode until a mount() method
    * call. It starts an entire building process.
    */
  def mount(): Properties = js.native
  def mount(components: Record[String, ComponentFunction]): Properties = js.native
  
  /**
    * Registering Transformers
    */
  def mutate(transformers: js.Array[TransformerFunction]): Static = js.native
  
  def on(event: js.Array[Events], definition: js.Function0[Unit]): Unit = js.native
  /**
    * Register callback which will be called at the specified events.
    */
  def on(event: Events, definition: js.Function0[Unit]): Unit = js.native
}
