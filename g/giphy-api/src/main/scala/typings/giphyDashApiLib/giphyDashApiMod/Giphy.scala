package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Giphy extends js.Object {
  def id(ids: java.lang.String): js.Promise[Result] = js.native
  def id(ids: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def id(ids: js.Array[java.lang.String]): js.Promise[Result] = js.native
  def id(ids: js.Array[java.lang.String], cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def random(tagOrOptions: RandomOptions): js.Promise[Result] = js.native
  def random(tagOrOptions: RandomOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def random(tagOrOptions: java.lang.String): js.Promise[Result] = js.native
  def random(tagOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def search(queryOrOptions: SearchOptions): js.Promise[Result] = js.native
  def search(queryOrOptions: SearchOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def search(queryOrOptions: java.lang.String): js.Promise[Result] = js.native
  def search(queryOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def translate(termOrOptions: TranslateOptions): js.Promise[Result] = js.native
  def translate(termOrOptions: TranslateOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def translate(termOrOptions: java.lang.String): js.Promise[Result] = js.native
  def translate(termOrOptions: java.lang.String, cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def trending(): js.Promise[Result] = js.native
  def trending(cb: giphyDashApiLib.Callback): scala.Unit = js.native
  def trending(options: TrendingOptions): js.Promise[Result] = js.native
  def trending(options: TrendingOptions, cb: giphyDashApiLib.Callback): scala.Unit = js.native
}

