package typings
package expressDashJwtLib.expressDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jwtNs {
  type GetTokenCallback = js.Function1[/* req */ expressLib.expressMod.eNs.Request, js.Any]
  type IsRevokedCallback = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
  type SecretCallback = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], scala.Unit], 
    scala.Unit
  ]
  type SecretCallbackLong = js.Function4[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* secret */ js.UndefOr[secretType], scala.Unit], 
    scala.Unit
  ]
  type secretType = java.lang.String | nodeLib.Buffer
}
