package typings
package giphyDashApiLib.giphyDashApiMod.giphyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Giphy extends js.Object {
  def id(ids: java.lang.String): js.Promise[Result] = js.native
  def id(ids: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def id(ids: js.Array[java.lang.String]): js.Promise[Result] = js.native
  def id(ids: js.Array[java.lang.String], cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def random(tagOrOptions: giphyDashApiLib.giphyDashApiMod.RandomOptions): js.Promise[Result] = js.native
  def random(tagOrOptions: giphyDashApiLib.giphyDashApiMod.RandomOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def random(tagOrOptions: java.lang.String): js.Promise[Result] = js.native
  def random(tagOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def search(queryOrOptions: SearchOptions): js.Promise[Result] = js.native
  def search(queryOrOptions: SearchOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def search(queryOrOptions: java.lang.String): js.Promise[Result] = js.native
  def search(queryOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def translate(termOrOptions: giphyDashApiLib.giphyDashApiMod.TranslateOptions): js.Promise[Result] = js.native
  def translate(termOrOptions: giphyDashApiLib.giphyDashApiMod.TranslateOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def translate(termOrOptions: java.lang.String): js.Promise[Result] = js.native
  def translate(termOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def trending(): js.Promise[Result] = js.native
  def trending(cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def trending(options: giphyDashApiLib.giphyDashApiMod.TrendingOptions): js.Promise[Result] = js.native
  def trending(options: giphyDashApiLib.giphyDashApiMod.TrendingOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
}

