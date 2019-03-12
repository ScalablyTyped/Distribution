package typings
package fastifyLib.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fastifyNs {
  type BodyParser[HttpRequest, RawBody /* <: java.lang.String | nodeLib.Buffer */] = (js.Function3[
    /* req */ HttpRequest, 
    /* rawBody */ RawBody, 
    /* done */ js.Function2[/* err */ stdLib.Error | scala.Null, /* body */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]) | (js.Function2[/* req */ HttpRequest, /* rawBody */ RawBody, js.Promise[js.Any]])
  type ContentTypeParser[HttpRequest] = (js.Function2[
    /* req */ HttpRequest, 
    /* done */ js.Function2[/* err */ stdLib.Error | scala.Null, /* body */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]) | (js.Function1[/* req */ HttpRequest, js.Promise[js.Any]])
  type DefaultBody = js.Any
  type FastifyMiddleware[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] = js.ThisFunction3[
    /* this */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
    /* req */ FastifyRequest[HttpRequest, Query, Params, Headers, Body], 
    /* reply */ FastifyReply[HttpResponse], 
    /* done */ js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit], 
    scala.Unit
  ]
  type FastifyMiddlewareWithPayload[HttpServer, HttpRequest, HttpResponse, Query, Params, Headers, Body] = js.ThisFunction4[
    /* this */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
    /* req */ FastifyRequest[HttpRequest, Query, Params, Headers, Body], 
    /* reply */ FastifyReply[HttpResponse], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.UndefOr[stdLib.Error], /* value */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  // TODO - define/import JSONSchema types
  type JSONSchema = js.Object
  type Middleware[HttpServer, HttpRequest, HttpResponse] = js.ThisFunction3[
    /* this */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
    /* req */ HttpRequest, 
    /* res */ HttpResponse, 
    /* callback */ js.Function1[/* err */ js.UndefOr[FastifyError], scala.Unit], 
    scala.Unit
  ]
  type Plugin[HttpServer, HttpRequest, HttpResponse, T] = js.Function3[
    /* instance */ FastifyInstance[HttpServer, HttpRequest, HttpResponse], 
    /* opts */ T, 
    /* callback */ js.Function1[/* err */ js.UndefOr[FastifyError], scala.Unit], 
    scala.Unit
  ]
  type RequestHandler[HttpRequest, HttpResponse, Query, Params, Headers, Body] = js.Function2[
    /* request */ FastifyRequest[HttpRequest, Query, Params, Headers, Body], 
    /* reply */ FastifyReply[HttpResponse], 
    scala.Unit | js.Promise[js.Any]
  ]
  type SchemaCompiler = js.Function1[/* schema */ js.Object, js.Function]
  type TrustProxyFunction = js.Function2[/* addr */ java.lang.String, /* index */ scala.Double, scala.Boolean]
}
