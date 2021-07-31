package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables common http request scenarios.
  * @requires jquery
  * @requires knockout
  */
object httpMod {
  
  @JSImport("plugins/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plugins/http", "callbackParam")
  @js.native
  def callbackParam: String = js.native
  @scala.inline
  def callbackParam_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("callbackParam")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def get(url: String): DurandalPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def get(url: String, query: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def get(url: String, query: js.Object, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def get(url: String, query: Unit, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  @scala.inline
  def jsonp(url: String): DurandalPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: js.Object, callbackParam: String): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: js.Object, callbackParam: String, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: js.Object, callbackParam: Unit, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: Unit, callbackParam: String): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: Unit, callbackParam: String, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def jsonp(url: String, query: Unit, callbackParam: Unit, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonp")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callbackParam.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  @scala.inline
  def post(url: String, data: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def post(url: String, data: js.Object, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  @scala.inline
  def put(url: String, data: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def put(url: String, data: js.Object, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  @scala.inline
  def remove(url: String): DurandalPromise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(url.asInstanceOf[js.Any]).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def remove(url: String, query: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def remove(url: String, query: js.Object, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  @scala.inline
  def remove(url: String, query: Unit, headers: js.Object): DurandalPromise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[DurandalPromise[js.Any]]
  
  @scala.inline
  def toJSON(data: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
