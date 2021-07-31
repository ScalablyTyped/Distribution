package typings.fastify

import typings.fastify.loggerMod.LogLevel
import typings.fastify.utilsMod.HTTPMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastifyStrings {
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HTTPMethods
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends StObject
       with HTTPMethods
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HTTPMethods
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HTTPMethods
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HTTPMethods
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends StObject
       with HTTPMethods
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends StObject
       with HTTPMethods
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait both extends StObject
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait buffer extends StObject
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevel
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait http extends StObject
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ignore extends StObject
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `no-slash` extends StObject
  @scala.inline
  def `no-slash`: `no-slash` = "no-slash".asInstanceOf[`no-slash`]
  
  @js.native
  sealed trait onClose extends StObject
  @scala.inline
  def onClose: onClose = "onClose".asInstanceOf[onClose]
  
  @js.native
  sealed trait onError extends StObject
  @scala.inline
  def onError: onError = "onError".asInstanceOf[onError]
  
  @js.native
  sealed trait onReady extends StObject
  @scala.inline
  def onReady: onReady = "onReady".asInstanceOf[onReady]
  
  @js.native
  sealed trait onRegister extends StObject
  @scala.inline
  def onRegister: onRegister = "onRegister".asInstanceOf[onRegister]
  
  @js.native
  sealed trait onRequest extends StObject
  @scala.inline
  def onRequest: onRequest = "onRequest".asInstanceOf[onRequest]
  
  @js.native
  sealed trait onResponse extends StObject
  @scala.inline
  def onResponse: onResponse = "onResponse".asInstanceOf[onResponse]
  
  @js.native
  sealed trait onRoute extends StObject
  @scala.inline
  def onRoute: onRoute = "onRoute".asInstanceOf[onRoute]
  
  @js.native
  sealed trait onSend extends StObject
  @scala.inline
  def onSend: onSend = "onSend".asInstanceOf[onSend]
  
  @js.native
  sealed trait onTimeout extends StObject
  @scala.inline
  def onTimeout: onTimeout = "onTimeout".asInstanceOf[onTimeout]
  
  @js.native
  sealed trait preHandler extends StObject
  @scala.inline
  def preHandler: preHandler = "preHandler".asInstanceOf[preHandler]
  
  @js.native
  sealed trait preParsing extends StObject
  @scala.inline
  def preParsing: preParsing = "preParsing".asInstanceOf[preParsing]
  
  @js.native
  sealed trait preSerialization extends StObject
  @scala.inline
  def preSerialization: preSerialization = "preSerialization".asInstanceOf[preSerialization]
  
  @js.native
  sealed trait preValidation extends StObject
  @scala.inline
  def preValidation: preValidation = "preValidation".asInstanceOf[preValidation]
  
  @js.native
  sealed trait remove extends StObject
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait slash extends StObject
  @scala.inline
  def slash: slash = "slash".asInstanceOf[slash]
  
  @js.native
  sealed trait string extends StObject
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevel
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
