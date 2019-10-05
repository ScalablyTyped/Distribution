package typings.atEmberRunloop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/runloop/-private/types", JSImport.Namespace)
@js.native
object dashPrivateTypesMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.atEmberRunloop.atEmberRunloopStrings.sync
    - typings.atEmberRunloop.atEmberRunloopStrings.actions
    - typings.atEmberRunloop.atEmberRunloopStrings.routerTransitions
    - typings.atEmberRunloop.atEmberRunloopStrings.render
    - typings.atEmberRunloop.atEmberRunloopStrings.afterRender
    - typings.atEmberRunloop.atEmberRunloopStrings.destroy
  */
  trait EmberRunQueues extends js.Object
  
  type RunMethod[Target, Ret] = (js.ThisFunction1[/* this */ Target, /* repeated */ js.Any, Ret]) | String
}

