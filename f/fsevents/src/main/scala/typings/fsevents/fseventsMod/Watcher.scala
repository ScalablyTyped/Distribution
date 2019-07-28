package typings.fsevents.fseventsMod

import typings.fsevents.fseventsStrings.change
import typings.fsevents.fseventsStrings.fsevent
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watcher extends EventEmitter {
  def addListener(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def emit(event: EventType, path: String, info: EventInfo): Boolean = js.native
  @JSName("emit")
  def emit_change(event: change, path: String, info: EventInfo): Boolean = js.native
  @JSName("emit")
  def emit_fsevent(event: fsevent, path: String, flags: Double, id: Double): Boolean = js.native
  def listenerCount(`type`: EventType): Double = js.native
  @JSName("listenerCount")
  def listenerCount_change(`type`: change): Double = js.native
  @JSName("listenerCount")
  def listenerCount_fsevent(`type`: fsevent): Double = js.native
  // tslint:disable-next-line ban-types
  def listeners(event: EventType): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_change(event: change): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_fsevent(event: fsevent): js.Array[js.Function] = js.native
  def on(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("on")
  def on_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def once(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("once")
  def once_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("once")
  def once_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def prependListener(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def prependOnceListener(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def removeAllListeners(event: EventType): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_change(event: change): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_fsevent(event: fsevent): this.type = js.native
  def removeListener(event: EventType, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(event: change, listener: js.Function2[/* path */ String, /* info */ EventInfo, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_fsevent(
    event: fsevent,
    listener: js.Function3[/* path */ String, /* flags */ Double, /* id */ Double, Unit]
  ): this.type = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

