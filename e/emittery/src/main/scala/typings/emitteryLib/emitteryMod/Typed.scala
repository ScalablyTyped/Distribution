package typings
package emitteryLib.emitteryMod

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
@JSImport("emittery/Emittery", "Typed")
@js.native
class Typed[EventDataMap /* <: Events */, EmptyEvents /* <: java.lang.String */] () extends Emittery {
  def emit[Name /* <: EmptyEvents */](eventName: Name): js.Promise[scala.Unit] = js.native
  def emit[Name /* <: stdLib.Extract[java.lang.String, java.lang.String] */](
    eventName: Name,
    eventData: /* import warning: ImportType.apply Failed type conversion: EventDataMap[Name] */ js.Any
  ): js.Promise[scala.Unit] = js.native
  def emitSerial[Name /* <: EmptyEvents */](eventName: Name): js.Promise[scala.Unit] = js.native
  def emitSerial[Name /* <: stdLib.Extract[java.lang.String, java.lang.String] */](
    eventName: Name,
    eventData: /* import warning: ImportType.apply Failed type conversion: EventDataMap[Name] */ js.Any
  ): js.Promise[scala.Unit] = js.native
  def off[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[_]): scala.Unit = js.native
  def off[Name /* <: stdLib.Extract[java.lang.String, java.lang.String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      _
    ]
  ): scala.Unit = js.native
  def on[Name /* <: EmptyEvents */](eventName: Name, listener: js.Function0[_]): UnsubscribeFn = js.native
  def on[Name /* <: stdLib.Extract[java.lang.String, java.lang.String] */](
    eventName: Name,
    listener: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: EventDataMap[Name] */ /* eventData */ js.Any, 
      _
    ]
  ): UnsubscribeFn = js.native
  def once[Name /* <: stdLib.Extract[java.lang.String, java.lang.String] */](eventName: Name): js.Promise[
    /* import warning: ImportType.apply Failed type conversion: EventDataMap[Name] */ js.Any
  ] = js.native
  @JSName("once")
  def once_NameEmptyEvents[Name /* <: EmptyEvents */](eventName: Name): js.Promise[scala.Unit] = js.native
}

