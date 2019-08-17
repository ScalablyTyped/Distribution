package typings.emittery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emitteryMod {
  import org.scalablytyped.runtime.StringDictionary

  /**
  	 * Maps event names to their emitted data type.
  	 */
  type Events = StringDictionary[js.Any]
  /**
  	 * Removes an event subscription.
  	 */
  type UnsubscribeFn = js.Function0[Unit]
}
