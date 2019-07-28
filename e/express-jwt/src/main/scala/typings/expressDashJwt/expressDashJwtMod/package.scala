package typings.expressDashJwt

import typings.express.expressMod.Request
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashJwtMod {
  type GetTokenCallback = js.Function1[/* req */ Request, js.Any]
  type IsRevokedCallback = js.Function3[
    /* req */ Request, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  type SecretCallback = js.Function3[
    /* req */ Request, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  type SecretCallbackLong = js.Function4[
    /* req */ Request, 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], Unit], 
    Unit
  ]
  type secretType = String | Buffer
}
