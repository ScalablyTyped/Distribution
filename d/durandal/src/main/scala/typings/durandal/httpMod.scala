package typings.durandal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables common http request scenarios.
  * @requires jquery
  * @requires knockout
  */
@JSImport("plugins/http", JSImport.Namespace)
@js.native
object httpMod extends js.Object {
  
  var callbackParam: String = js.native
  
  def get(url: String): DurandalPromise[_] = js.native
  def get(url: String, query: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  def get(url: String, query: js.Object): DurandalPromise[_] = js.native
  def get(url: String, query: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  def jsonp(url: String): DurandalPromise[_] = js.native
  def jsonp(
    url: String,
    query: js.UndefOr[scala.Nothing],
    callbackParam: js.UndefOr[scala.Nothing],
    headers: js.Object
  ): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.UndefOr[scala.Nothing], callbackParam: String): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.UndefOr[scala.Nothing], callbackParam: String, headers: js.Object): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.Object): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.Object, callbackParam: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.Object, callbackParam: String): DurandalPromise[_] = js.native
  def jsonp(url: String, query: js.Object, callbackParam: String, headers: js.Object): DurandalPromise[_] = js.native
  
  def post(url: String, data: js.Object): DurandalPromise[_] = js.native
  def post(url: String, data: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  def put(url: String, data: js.Object): DurandalPromise[_] = js.native
  def put(url: String, data: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  def remove(url: String): DurandalPromise[_] = js.native
  def remove(url: String, query: js.UndefOr[scala.Nothing], headers: js.Object): DurandalPromise[_] = js.native
  def remove(url: String, query: js.Object): DurandalPromise[_] = js.native
  def remove(url: String, query: js.Object, headers: js.Object): DurandalPromise[_] = js.native
  
  def toJSON(data: js.Object): String = js.native
}
