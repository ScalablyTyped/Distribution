package typings.emittery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
  	 * Maps event names to their emitted data type.
  	 */
  type Events = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
  	 * Removes an event subscription.
  	 */
  type UnsubscribeFn = js.Function0[scala.Unit]
}
