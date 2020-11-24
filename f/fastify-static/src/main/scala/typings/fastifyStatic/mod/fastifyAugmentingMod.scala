package typings.fastifyStatic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("fastify", JSImport.Namespace)
@js.native
object fastifyAugmentingMod extends js.Object {
  
  @js.native
  trait FastifyReply extends js.Object {
    
    def sendFile(filename: String): FastifyReply = js.native
    def sendFile(filename: String, rootPath: String): FastifyReply = js.native
  }
}
