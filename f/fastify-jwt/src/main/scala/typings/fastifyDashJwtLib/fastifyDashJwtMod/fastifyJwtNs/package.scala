package typings
package fastifyDashJwtLib.fastifyDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastifyJwtNs {
  type SecretCallback = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify fastify.FastifyRequest<IncomingMessage> */ /* request */ js.Any, 
    /* reply */ java.lang.String | nodeLib.Buffer | js.Object, 
    /* callback */ js.UndefOr[
      jsonwebtokenLib.jsonwebtokenMod.VerifyCallback | jsonwebtokenLib.jsonwebtokenMod.SignCallback
    ], 
    scala.Unit
  ]
}
