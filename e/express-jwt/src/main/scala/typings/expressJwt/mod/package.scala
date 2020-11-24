package typings.expressJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetTokenCallback = js.Function1[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    js.Any
  ]
  
  type IsRevokedCallback = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
  
  type SecretCallback = js.Function3[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* payload */ js.Any, 
    /* done */ js.Function2[
      /* err */ js.Any, 
      /* secret */ js.UndefOr[typings.expressJwt.mod.secretType], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type SecretCallbackLong = js.Function4[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[
      /* err */ js.Any, 
      /* secret */ js.UndefOr[typings.expressJwt.mod.secretType], 
      scala.Unit
    ], 
    scala.Unit
  ]
  
  type secretType = java.lang.String | typings.node.Buffer
}
