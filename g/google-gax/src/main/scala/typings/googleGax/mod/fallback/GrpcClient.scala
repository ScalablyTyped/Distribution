package typings.googleGax.mod.fallback

import typings.googleGax.anon.Auth
import typings.googleGax.grpcMod.GrpcClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.GrpcClient")
@js.native
/**
  * gRPC-fallback version of GrpcClient
  * Implements GrpcClient API for a browser using grpc-fallback protocol (sends serialized protobuf to HTTP/1 $rpc endpoint).
  *
  * @param {Object=} options.auth - An instance of OAuth2Client to use in browser, or an instance of GoogleAuth from google-auth-library
  *  to use in Node.js. Required for browser, optional for Node.js.
  * @constructor
  */
class GrpcClient ()
  extends typings.googleGax.fallbackMod.GrpcClient {
  def this(options: Auth) = this()
  def this(options: GrpcClientOptions) = this()
}
