package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.giphyApi.giphyApiStrings.html
  - typings.giphyApi.giphyApiStrings.json
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def html: typings.giphyApi.giphyApiStrings.html = this.cast("html")
  @scala.inline
  def json: typings.giphyApi.giphyApiStrings.json = this.cast("json")
}

