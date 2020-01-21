package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.giphyApi.giphyApiStrings.y
  - typings.giphyApi.giphyApiStrings.g
  - typings.giphyApi.giphyApiStrings.pg
  - typings.giphyApi.giphyApiStrings.`pg-13`
  - typings.giphyApi.giphyApiStrings.r
*/
trait Rating extends js.Object

object Rating {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def g: typings.giphyApi.giphyApiStrings.g = this.cast("g")
  @scala.inline
  def pg: typings.giphyApi.giphyApiStrings.pg = this.cast("pg")
  @scala.inline
  def `pg-13`: typings.giphyApi.giphyApiStrings.`pg-13` = this.cast("pg-13")
  @scala.inline
  def r: typings.giphyApi.giphyApiStrings.r = this.cast("r")
  @scala.inline
  def y: typings.giphyApi.giphyApiStrings.y = this.cast("y")
}

