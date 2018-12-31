package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalHistoryOptions extends js.Object {
  /**
    * Use hash change when present.
    * @default true
    */
  var hashChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use push state when present.
    * @default false
    */
  var pushState: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The url root used to extract the fragment when using push state.
    */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The function that will be called back when the fragment changes.
    */
  var routeHandler: js.UndefOr[js.Function1[/* fragment */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Prevents loading of the current url when activating history.
    * @default false
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override default history init behavior by navigating directly to this route.
    */
  var startRoute: js.UndefOr[java.lang.String] = js.undefined
}

