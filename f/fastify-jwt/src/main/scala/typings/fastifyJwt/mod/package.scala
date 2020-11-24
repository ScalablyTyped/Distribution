package typings.fastifyJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Secret = typings.jsonwebtoken.mod.Secret | (js.Function3[
    /* request */ typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest, 
    /* reply */ typings.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply, 
    /* cb */ js.Function2[
      /* e */ typings.std.Error | scala.Null, 
      /* secret */ js.UndefOr[java.lang.String], 
      scala.Unit
    ], 
    scala.Unit
  ])
}
