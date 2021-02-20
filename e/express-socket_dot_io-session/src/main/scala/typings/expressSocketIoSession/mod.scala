package typings.expressSocketIoSession

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.expressSocketIoSession.anon.SessionPartialSessionData
import typings.socketIo.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-socket.io-session", JSImport.Namespace)
  @js.native
  def apply(expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query]): SocketIoSharedSessionMiddleware = js.native
  @JSImport("express-socket.io-session", JSImport.Namespace)
  @js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    cookieParserMiddleware: RequestHandler[ParamsDictionary, _, _, Query]
  ): SocketIoSharedSessionMiddleware = js.native
  @JSImport("express-socket.io-session", JSImport.Namespace)
  @js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    cookieParserMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  @JSImport("express-socket.io-session", JSImport.Namespace)
  @js.native
  def apply(
    expressSessionMiddleware: RequestHandler[ParamsDictionary, _, _, Query],
    options: SharedSessionOptions
  ): SocketIoSharedSessionMiddleware = js.native
  
  @js.native
  trait SharedSessionOptions extends StObject {
    
    var autoSave: js.UndefOr[Boolean] = js.native
    
    var saveUninitialized: js.UndefOr[Boolean] = js.native
  }
  object SharedSessionOptions {
    
    @scala.inline
    def apply(): SharedSessionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedSessionOptions]
    }
    
    @scala.inline
    implicit class SharedSessionOptionsMutableBuilder[Self <: SharedSessionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSave(value: Boolean): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setSaveUninitialized(value: Boolean): Self = StObject.set(x, "saveUninitialized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveUninitializedUndefined: Self = StObject.set(x, "saveUninitialized", js.undefined)
    }
  }
  
  type SocketIoSharedSessionMiddleware = js.Function2[
    /* socket */ Socket, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
    Unit
  ]
  
  /* augmented module */
  object socketIoAugmentingMod {
    
    @js.native
    trait Handshake extends StObject {
      
      var session: js.UndefOr[SessionPartialSessionData] = js.native
      
      var sessionID: js.UndefOr[String] = js.native
    }
    object Handshake {
      
      @scala.inline
      def apply(): Handshake = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Handshake]
      }
      
      @scala.inline
      implicit class HandshakeMutableBuilder[Self <: Handshake] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSession(value: SessionPartialSessionData): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionIDUndefined: Self = StObject.set(x, "sessionID", js.undefined)
        
        @scala.inline
        def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      }
    }
  }
}
