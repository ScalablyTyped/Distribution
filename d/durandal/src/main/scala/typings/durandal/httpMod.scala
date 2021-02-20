package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSImport("plugins/http", "get")
  @js.native
  def get(url: String): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "get")
  @js.native
  def get(url: String, query: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "get")
  @js.native
  def get(url: String, query: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "get")
  @js.native
  def get(url: String, query: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(
    url: String,
    query: js.UndefOr[scala.Nothing],
    callbackParam: js.UndefOr[scala.Nothing],
    headers: js.Object
  ): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.UndefOr[scala.Nothing], callbackParam: String): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.UndefOr[scala.Nothing], callbackParam: String, headers: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.Object, callbackParam: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.Object, callbackParam: String): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "jsonp")
  @js.native
  def jsonp(url: String, query: js.Object, callbackParam: String, headers: js.Object): DurandalPromise[_] = js.native
  
  @JSImport("plugins/http", "post")
  @js.native
  def post(url: String, data: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "post")
  @js.native
  def post(url: String, data: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  @JSImport("plugins/http", "put")
  @js.native
  def put(url: String, data: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "put")
  @js.native
  def put(url: String, data: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  @JSImport("plugins/http", "remove")
  @js.native
  def remove(url: String): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "remove")
  @js.native
  def remove(url: String, query: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "remove")
  @js.native
  def remove(url: String, query: js.Object): DurandalPromise[_] = js.native
  @JSImport("plugins/http", "remove")
  @js.native
  def remove(url: String, query: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  @JSImport("plugins/http", "toJSON")
  @js.native
  def toJSON(data: js.Object): String = js.native
}
