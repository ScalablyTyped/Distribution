package typings
package eventemitter2Lib.eventemitter2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConstructorOptions extends js.Object {
  /**
       * @default '.'
       * @description the delimiter used to segment namespaces.
       */
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
       * @default 10
       * @description the maximum amount of listeners that can be assigned to an event.
       */
  var maxListeners: js.UndefOr[scala.Double] = js.undefined
  /**
       * @default true
       * @description set this to `true` if you want to emit the newListener events.
       */
  var newListener: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @default false
       * @description show event name in memory leak message when more than maximum amount of listeners is assigned, default false
       */
  var verboseMemoryLeak: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @default false
       * @description set this to `true` to use wildcards.
       */
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

