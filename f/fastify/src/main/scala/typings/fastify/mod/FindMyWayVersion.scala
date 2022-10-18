package typings.fastify.mod

import typings.fastify.typesUtilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> ? find-my-way.find-my-way.HTTPVersion.V1 : find-my-way.find-my-way.HTTPVersion.V2
  }}}
  */
@js.native
trait FindMyWayVersion[RawServer /* <: RawServerBase */] extends StObject
