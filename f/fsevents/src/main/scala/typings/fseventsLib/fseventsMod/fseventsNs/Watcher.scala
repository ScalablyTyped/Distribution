package typings
package fseventsLib.fseventsMod.fseventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watcher
  extends nodeLib.eventsMod.EventEmitter {
  def addListener(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def emit(event: EventType, path: java.lang.String, info: EventInfo): scala.Boolean = js.native
  @JSName("emit")
  def emit_change(event: fseventsLib.fseventsLibStrings.change, path: java.lang.String, info: EventInfo): scala.Boolean = js.native
  @JSName("emit")
  def emit_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    path: java.lang.String,
    flags: scala.Double,
    id: scala.Double
  ): scala.Boolean = js.native
  def listenerCount(`type`: EventType): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_change(`type`: fseventsLib.fseventsLibStrings.change): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_fsevent(`type`: fseventsLib.fseventsLibStrings.fsevent): scala.Double = js.native
  // tslint:disable-next-line ban-types
  def listeners(event: EventType): js.Array[js.Function] = js.native
  // tslint:disable-next-line ban-types
  @JSName("listeners")
  def listeners_change(event: fseventsLib.fseventsLibStrings.change): js.Array[js.Function] = js.native
  // tslint:disable-next-line ban-types
  @JSName("listeners")
  def listeners_fsevent(event: fseventsLib.fseventsLibStrings.fsevent): js.Array[js.Function] = js.native
  def on(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def once(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def prependListener(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def prependOnceListener(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def removeAllListeners(event: EventType): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_change(event: fseventsLib.fseventsLibStrings.change): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_fsevent(event: fseventsLib.fseventsLibStrings.fsevent): this.type = js.native
  def removeListener(
    event: EventType,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_change(
    event: fseventsLib.fseventsLibStrings.change,
    listener: js.Function2[/* path */ java.lang.String, /* info */ EventInfo, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_fsevent(
    event: fseventsLib.fseventsLibStrings.fsevent,
    listener: js.Function3[
      /* path */ java.lang.String, 
      /* flags */ scala.Double, 
      /* id */ scala.Double, 
      scala.Unit
    ]
  ): this.type = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
}

