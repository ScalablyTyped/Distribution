package typings
package giphyDashApiLib.giphyDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Giphy extends js.Object {
  def id(ids: java.lang.String): js.Promise[MultiResponse] = js.native
  def id(ids: java.lang.String, cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
  def id(ids: js.Array[java.lang.String]): js.Promise[MultiResponse] = js.native
  def id(ids: js.Array[java.lang.String], cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
  def random(tagOrOptions: RandomOptions): js.Promise[SingleResponse] = js.native
  def random(tagOrOptions: RandomOptions, cb: giphyDashApiLib.Callback[SingleResponse]): scala.Unit = js.native
  def random(tagOrOptions: java.lang.String): js.Promise[SingleResponse] = js.native
  def random(tagOrOptions: java.lang.String, cb: giphyDashApiLib.Callback[SingleResponse]): scala.Unit = js.native
  def search(queryOrOptions: SearchOptions): js.Promise[MultiResponse] = js.native
  def search(queryOrOptions: SearchOptions, cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
  def search(queryOrOptions: java.lang.String): js.Promise[MultiResponse] = js.native
  def search(queryOrOptions: java.lang.String, cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
  def translate(termOrOptions: TranslateOptions): js.Promise[SingleResponse] = js.native
  def translate(termOrOptions: TranslateOptions, cb: giphyDashApiLib.Callback[SingleResponse]): scala.Unit = js.native
  def translate(termOrOptions: java.lang.String): js.Promise[SingleResponse] = js.native
  def translate(termOrOptions: java.lang.String, cb: giphyDashApiLib.Callback[SingleResponse]): scala.Unit = js.native
  def trending(): js.Promise[MultiResponse] = js.native
  def trending(cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
  def trending(options: TrendingOptions): js.Promise[MultiResponse] = js.native
  def trending(options: TrendingOptions, cb: giphyDashApiLib.Callback[MultiResponse]): scala.Unit = js.native
}

