package typings.emittery.emitteryMod

import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Async event emitter.
	 *
	 * Must list supported events and the data type they emit, if any.
	 *
	 * For example:
	 *
	 * ```ts
	 * import Emittery = require('emittery');
	 *
	 * const ee = new Emittery.Typed<{value: string}, 'open' | 'close'>();
	 *
	 * ee.emit('open');
	 * ee.emit('value', 'foo\n');
	 * ee.emit('value', 1); // TS compilation error
	 * ee.emit('end'); // TS compilation error
	 * ```
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
  def off[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[_]): Unit = js.native
  def off[Name /* <: Extract[String, String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      _
    ]
  ): Unit = js.native
  def on[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[_]): UnsubscribeFn = js.native
  def on[Name /* <: Extract[String, String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      _
    ]
  ): UnsubscribeFn = js.native
  def once[Name /* <: EmptyEvents */](eventName: Name): js.Promise[Unit] = js.native
  @JSName("once")
  def once_Name_ExtractStringString[Name /* <: Extract[String, String] */](eventName: Name): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: EventDataMap[Name] */ js.Any
  ] = js.native
}

