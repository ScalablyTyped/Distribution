package typings.fastify.mod

import typings.fastify.typesUtilsMod.RawServerBase
import typings.findMyWay.mod.HTTPVersion.V1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  RawServer extends node.http.Server<new (socket : node.node:net.Socket): node.http.IncomingMessage, new <Request extends node.http.IncomingMessage = node.http.IncomingMessage>(req : / * import warning: RewrittenClass.unapply cls was tparam Request * / any): node.http.ServerResponse<Request>> ? find-my-way.find-my-way.HTTPVersion.V1 : find-my-way.find-my-way.HTTPVersion.V2
  }}}
  */
type FindMyWayVersion[RawServer /* <: RawServerBase */] = V1

type TrustProxyFunction = js.Function2[/* address */ String, /* hop */ Double, Boolean]
