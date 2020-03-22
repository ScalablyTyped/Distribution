package typings.emittery.mod

import typings.std.AsyncIterableIterator
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Async event emitter.
	You must list supported events and the data type they emit, if any.
	@example
	```
	import Emittery = require('emittery');
	const emitter = new Emittery.Typed<{value: string}, 'open' | 'close'>();
	emitter.emit('open');
	emitter.emit('value', 'foo\n');
	emitter.emit('value', 1); // TS compilation error
	emitter.emit('end'); // TS compilation error
	```
	*/
@JSImport("emittery", "Typed")
@js.native
class Typed[EventDataMap /* <: Events */, EmptyEvents /* <: String */] () extends Emittery {
  def emit[Name /* <: EmptyEvents */](eventName: Name): js.Promise[Unit] = js.native
  def emit[Name /* <: Extract[String, String] */](
    eventName: Name,
    eventData: /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ js.Any
  ): js.Promise[Unit] = js.native
  def emitSerial[Name /* <: EmptyEvents */](eventName: Name): js.Promise[Unit] = js.native
  def emitSerial[Name /* <: Extract[String, String] */](
    eventName: Name,
    eventData: /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ js.Any
  ): js.Promise[Unit] = js.native
  def events[Name /* <: Extract[String, String] */](eventName: Name): AsyncIterableIterator[
    /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ js.Any
  ] = js.native
  def off[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[Unit]): Unit = js.native
  def off[Name /* <: Extract[String, String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  def on[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[Unit]): UnsubscribeFn = js.native
  def on[Name /* <: Extract[String, String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      Unit
    ]
  ): UnsubscribeFn = js.native
  def once[Name /* <: Extract[String, String] */](eventName: Name): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ js.Any
  ] = js.native
  @JSName("once")
  def once_Name_EmptyEvents[Name /* <: EmptyEvents */](eventName: Name): js.Promise[Unit] = js.native
}

