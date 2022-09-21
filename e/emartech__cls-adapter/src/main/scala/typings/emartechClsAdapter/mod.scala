package typings.emartechClsAdapter

import typings.clsHooked.mod.Namespace
import typings.emartechClsAdapter.anon.RequestId
import typings.express.mod.Handler
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@emartech/cls-adapter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ContextFactory {
    
    /* private */ /* CompleteClass */
    var _namespace: Namespace = js.native
  }
  @JSImport("@emartech/cls-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a function that extends the given object with the current storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "addContextStorageToInput")
  @js.native
  def addContextStorageToInput: js.Function0[js.Function1[/* input */ js.Object, js.Object & RequestId]] = js.native
  inline def addContextStorageToInput_=(x: js.Function0[js.Function1[/* input */ js.Object, js.Object & RequestId]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addContextStorageToInput")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a function that extends the given object with the request identifier set on the current storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "addRequestIdToInput")
  @js.native
  def addRequestIdToInput: js.Function0[js.Function1[/* input */ js.Object, js.Object & RequestId]] = js.native
  inline def addRequestIdToInput_=(x: js.Function0[js.Function1[/* input */ js.Object, js.Object & RequestId]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addRequestIdToInput")(x.asInstanceOf[js.Any])
  
  /**
    * Creates (or returns existing namespace) with the namespace name 'session'
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "createNamespace")
  @js.native
  def createNamespace: js.Function0[Namespace] = js.native
  inline def createNamespace_=(x: js.Function0[Namespace]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNamespace")(x.asInstanceOf[js.Any])
  
  /**
    * Destroys (if exists) the namespace with the name 'session'
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "destroyNamespace")
  @js.native
  def destroyNamespace: js.Function0[Unit] = js.native
  inline def destroyNamespace_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyNamespace")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the all the values set on the storage.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /* static member */
  @JSImport("@emartech/cls-adapter", "getContextStorage")
  @js.native
  def getContextStorage: js.Function0[(Record[String, Any]) & RequestId] = js.native
  inline def getContextStorage_=(x: js.Function0[(Record[String, Any]) & RequestId]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getContextStorage")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a middleware function compatible with Express that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getExpressMiddleware")
  @js.native
  def getExpressMiddleware: js.Function0[Handler] = js.native
  inline def getExpressMiddleware_=(x: js.Function0[Handler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getExpressMiddleware")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a middleware function compatible with Koa that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getKoaMiddleware")
  @js.native
  def getKoaMiddleware: js.Function0[Middleware[DefaultState, DefaultContext, Any]] = js.native
  inline def getKoaMiddleware_=(x: js.Function0[Middleware[DefaultState, DefaultContext, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getKoaMiddleware")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the the request identifier set on the storage. The identifiers key is request_id.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "getRequestId")
  @js.native
  def getRequestId: js.Function0[js.UndefOr[String]] = js.native
  inline def getRequestId_=(x: js.Function0[js.UndefOr[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRequestId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@emartech/cls-adapter", "run")
  @js.native
  def run: js.Function1[/* fn */ js.Function1[/* repeated */ Any, Any], Any] = js.native
  inline def run_=(x: js.Function1[/* fn */ js.Function1[/* repeated */ Any, Any], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("run")(x.asInstanceOf[js.Any])
  
  /**
    * Sets a key with a given value on the storage.
    */
  /* static member */
  @JSImport("@emartech/cls-adapter", "setOnContext")
  @js.native
  def setOnContext: js.Function2[/* key */ String, /* value */ Any, Any] = js.native
  inline def setOnContext_=(x: js.Function2[/* key */ String, /* value */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setOnContext")(x.asInstanceOf[js.Any])
  
  trait ContextFactory extends StObject {
    
    /* private */ var _namespace: Namespace
  }
  object ContextFactory {
    
    inline def apply(_namespace: Namespace): ContextFactory = {
      val __obj = js.Dynamic.literal(_namespace = _namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextFactory]
    }
    
    extension [Self <: ContextFactory](x: Self) {
      
      inline def set_namespace(value: Namespace): Self = StObject.set(x, "_namespace", value.asInstanceOf[js.Any])
    }
  }
}
