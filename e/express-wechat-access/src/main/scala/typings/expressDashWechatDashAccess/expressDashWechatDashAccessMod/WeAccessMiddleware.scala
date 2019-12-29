package typings.expressDashWechatDashAccess.expressDashWechatDashAccessMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Response
import typings.node.NodeJS.EventEmitter
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined  */ @js.native
trait WeAccessMiddleware
  extends WeMiddleware
     with EventEmitter {
  /* InferMemberOverrides */
  override def apply(T0: /* req */ js.Any, T1: /* res */ Response | ServerResponse, T2: /* next */ NextFunction): js.Any = js.native
}

