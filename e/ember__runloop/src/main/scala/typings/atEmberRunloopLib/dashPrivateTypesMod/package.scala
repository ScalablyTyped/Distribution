package typings
package atEmberRunloopLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateTypesMod {
  type EmberRunQueues = atEmberRunloopLib.atEmberRunloopLibStrings.sync | atEmberRunloopLib.atEmberRunloopLibStrings.actions | atEmberRunloopLib.atEmberRunloopLibStrings.routerTransitions | atEmberRunloopLib.atEmberRunloopLibStrings.render | atEmberRunloopLib.atEmberRunloopLibStrings.afterRender | atEmberRunloopLib.atEmberRunloopLibStrings.destroy
  type RunMethod[Target, Ret] = (js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Ret]) | java.lang.String
}
