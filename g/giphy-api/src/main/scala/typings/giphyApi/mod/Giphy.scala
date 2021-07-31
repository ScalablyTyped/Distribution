package typings.giphyApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Giphy extends StObject {
  
  def id(ids: String): js.Promise[MultiResponse] = js.native
  def id(ids: String, cb: Callback[MultiResponse]): Unit = js.native
  def id(ids: js.Array[String]): js.Promise[MultiResponse] = js.native
  def id(ids: js.Array[String], cb: Callback[MultiResponse]): Unit = js.native
  
  def random(tagOrOptions: String): js.Promise[SingleResponse] = js.native
  def random(tagOrOptions: String, cb: Callback[SingleResponse]): Unit = js.native
  def random(tagOrOptions: RandomOptions): js.Promise[SingleResponse] = js.native
  def random(tagOrOptions: RandomOptions, cb: Callback[SingleResponse]): Unit = js.native
  
  def search(queryOrOptions: String): js.Promise[MultiResponse] = js.native
  def search(queryOrOptions: String, cb: Callback[MultiResponse]): Unit = js.native
  def search(queryOrOptions: SearchOptions): js.Promise[MultiResponse] = js.native
  def search(queryOrOptions: SearchOptions, cb: Callback[MultiResponse]): Unit = js.native
  
  def translate(termOrOptions: String): js.Promise[SingleResponse] = js.native
  def translate(termOrOptions: String, cb: Callback[SingleResponse]): Unit = js.native
  def translate(termOrOptions: TranslateOptions): js.Promise[SingleResponse] = js.native
  def translate(termOrOptions: TranslateOptions, cb: Callback[SingleResponse]): Unit = js.native
  
  def trending(): js.Promise[MultiResponse] = js.native
  def trending(cb: Callback[MultiResponse]): Unit = js.native
  def trending(options: TrendingOptions): js.Promise[MultiResponse] = js.native
  def trending(options: TrendingOptions, cb: Callback[MultiResponse]): Unit = js.native
}
