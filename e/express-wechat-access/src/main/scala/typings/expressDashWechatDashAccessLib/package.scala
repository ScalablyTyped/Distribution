package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashWechatDashAccessLib {
  type WeMiddleware = js.Function3[
    /* req */ js.Any, 
    /* res */ stdLib.Response | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify http.ServerResponse */ js.Any), 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NextFunction */ /* next */ js.Any, 
    js.Any
  ]
}
