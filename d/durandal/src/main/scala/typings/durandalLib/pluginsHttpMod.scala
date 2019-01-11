package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables common http request scenarios.
  * @requires jquery
  * @requires knockout
  */
@JSImport("plugins/http", JSImport.Namespace)
@js.native
object pluginsHttpMod extends js.Object {
  var callbackParam: java.lang.String = js.native
  def get(url: java.lang.String): durandalLib.DurandalPromise[_] = js.native
  def get(url: java.lang.String, query: js.Object): durandalLib.DurandalPromise[_] = js.native
  def get(url: java.lang.String, query: js.Object, headers: js.Object): durandalLib.DurandalPromise[_] = js.native
  def jsonp(url: java.lang.String): durandalLib.DurandalPromise[_] = js.native
  def jsonp(url: java.lang.String, query: js.Object): durandalLib.DurandalPromise[_] = js.native
  def jsonp(url: java.lang.String, query: js.Object, callbackParam: java.lang.String): durandalLib.DurandalPromise[_] = js.native
  def jsonp(url: java.lang.String, query: js.Object, callbackParam: java.lang.String, headers: js.Object): durandalLib.DurandalPromise[_] = js.native
  def post(url: java.lang.String, data: js.Object): durandalLib.DurandalPromise[_] = js.native
  def post(url: java.lang.String, data: js.Object, headers: js.Object): durandalLib.DurandalPromise[_] = js.native
  def put(url: java.lang.String, data: js.Object): durandalLib.DurandalPromise[_] = js.native
  def put(url: java.lang.String, data: js.Object, headers: js.Object): durandalLib.DurandalPromise[_] = js.native
  def remove(url: java.lang.String): durandalLib.DurandalPromise[_] = js.native
  def remove(url: java.lang.String, query: js.Object): durandalLib.DurandalPromise[_] = js.native
  def remove(url: java.lang.String, query: js.Object, headers: js.Object): durandalLib.DurandalPromise[_] = js.native
  def toJSON(data: js.Object): java.lang.String = js.native
}

