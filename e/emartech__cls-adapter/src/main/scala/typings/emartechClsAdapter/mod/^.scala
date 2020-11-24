package typings.emartechClsAdapter.mod

import typings.clsHooked.mod.Namespace
import typings.emartechClsAdapter.anon.RequestId
import typings.express.mod.Handler
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@emartech/cls-adapter", JSImport.Namespace)
@js.native
class ^ () extends ContextFactory
@JSImport("@emartech/cls-adapter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns a function that extends the given object with the current storage.
    */
  def addContextStorageToInput(): js.Function1[/* input */ js.Object, js.Object with RequestId] = js.native
  
  /**
    * Returns a function that extends the given object with the request identifier set on the current storage.
    */
  def addRequestIdToInput(): js.Function1[/* input */ js.Object, js.Object with RequestId] = js.native
  
  /**
    * Creates (or returns existing namespace) with the namespace name 'session'
    */
  def createNamespace(): Namespace = js.native
  
  /**
    * Destroys (if exists) the namespace with the name 'session'
    */
  def destroyNamespace(): Unit = js.native
  
  /**
    * Returns the all the values set on the storage.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def getContextStorage[T](): T with RequestId = js.native
  
  /**
    * Returns a middleware function compatible with Express that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  def getExpressMiddleware(): Handler = js.native
  
  /**
    * Returns a middleware function compatible with Koa that stores (or generates if missing)
    * the request identifier from the header (X-Request-Id) and sets it on the storage as request_id.
    */
  def getKoaMiddleware(): Middleware[DefaultState, DefaultContext] = js.native
  
  /**
    * Returns the the request identifier set on the storage. The identifiers key is request_id.
    */
  def getRequestId(): js.UndefOr[String] = js.native
  
  def run[T](fn: js.Function1[/* repeated */ js.Any, T]): T = js.native
  @JSName("run")
  var run_Original: js.Function1[/* fn */ js.Function1[/* repeated */ js.Any, _], _] = js.native
  
  /**
    * Sets a key with a given value on the storage.
    */
  def setOnContext[T](key: String, value: T): T = js.native
  /**
    * Sets a key with a given value on the storage.
    */
  @JSName("setOnContext")
  var setOnContext_Original: js.Function2[/* key */ String, /* value */ js.Any, _] = js.native
}
