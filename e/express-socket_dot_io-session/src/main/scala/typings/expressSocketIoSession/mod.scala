package typings.expressSocketIoSession

import typings.express.mod.RequestHandler
import typings.expressSocketIoSession.anon.SessionPartialSessionData
import typings.socketIo.mod.Socket
import typings.socketIo.typedEventsMod.DefaultEventsMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(
    expressSessionMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): SocketIoSharedSessionMiddleware = ^.asInstanceOf[js.Dynamic].apply(expressSessionMiddleware.asInstanceOf[js.Any]).asInstanceOf[SocketIoSharedSessionMiddleware]
  inline def apply(
    expressSessionMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    cookieParserMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): SocketIoSharedSessionMiddleware = (^.asInstanceOf[js.Dynamic].apply(expressSessionMiddleware.asInstanceOf[js.Any], cookieParserMiddleware.asInstanceOf[js.Any])).asInstanceOf[SocketIoSharedSessionMiddleware]
  inline def apply(
    expressSessionMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    cookieParserMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = (^.asInstanceOf[js.Dynamic].apply(expressSessionMiddleware.asInstanceOf[js.Any], cookieParserMiddleware.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SocketIoSharedSessionMiddleware]
  inline def apply(
    expressSessionMiddleware: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = (^.asInstanceOf[js.Dynamic].apply(expressSessionMiddleware.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SocketIoSharedSessionMiddleware]
  
  @JSImport("express-socket.io-session", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SharedSessionOptions extends StObject {
    
    var autoSave: js.UndefOr[Boolean] = js.undefined
    
    var saveUninitialized: js.UndefOr[Boolean] = js.undefined
  }
  object SharedSessionOptions {
    
    inline def apply(): SharedSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedSessionOptions]
    }
    
    extension [Self <: SharedSessionOptions](x: Self) {
      
      inline def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      inline def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      inline def setSaveUninitialized(value: Boolean): Self = StObject.set(x, "saveUninitialized", value.asInstanceOf[js.Any])
      
      inline def setSaveUninitializedUndefined: Self = StObject.set(x, "saveUninitialized", js.undefined)
    }
  }
  
  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
    /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  /* augmented module */
  object socketIoAugmentingMod {
    
    trait Handshake extends StObject {
      
      var session: js.UndefOr[SessionPartialSessionData] = js.undefined
      
      var sessionID: js.UndefOr[String] = js.undefined
    }
    object Handshake {
      
      inline def apply(): Handshake = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Handshake]
      }
      
      extension [Self <: Handshake](x: Self) {
        
        inline def setSession(value: SessionPartialSessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
        
        inline def setSessionIDUndefined: Self = StObject.set(x, "sessionID", js.undefined)
        
        inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      }
    }
  }
}
