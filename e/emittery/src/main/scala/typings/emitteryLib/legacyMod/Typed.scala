package typings
package emitteryLib.legacyMod

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
@JSImport("emittery/legacy", "Typed")
@js.native
class Typed[EventDataMap /* <: emitteryLib.emitteryMod.Events */, EmptyEvents /* <: java.lang.String */] ()
  extends emitteryLib.emitteryMod.Typed[EventDataMap, EmptyEvents]

