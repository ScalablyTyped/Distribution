package typings
package enquireDotJsLib.enquireDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * If set to true, defers execution of the setup function until the first time the media query is matched
       */
  var deferSetup: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If supplied, triggered when handler is unregistered. Place cleanup code here
       */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If supplied, triggered when a media query matches.
       */
  var `match`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If supplied, triggered once, when the handler is registered.
       */
  var setup: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * If supplied, triggered when the media query transitions from a matched state to an unmatched state.
       */
  var unmatch: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

