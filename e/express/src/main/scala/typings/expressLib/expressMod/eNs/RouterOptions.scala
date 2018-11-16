package typings
package expressLib.expressMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouterOptions extends js.Object {
  /**
           * Enable case sensitivity.
           */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Preserve the req.params values from the parent router.
           * If the parent and the child have conflicting param names, the child’s value take precedence.
           *
           * @default false
           * @since 4.5.0
           */
  var mergeParams: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable strict routing.
           */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

