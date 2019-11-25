package typings.elasticsearch.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticsearch.elasticsearchStrings.open
  - typings.elasticsearch.elasticsearchStrings.closed
  - typings.elasticsearch.elasticsearchStrings.none
  - typings.elasticsearch.elasticsearchStrings.all
*/
trait ExpandWildcards extends js.Object

object ExpandWildcards {
  @scala.inline
  def all: typings.elasticsearch.elasticsearchStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def closed: typings.elasticsearch.elasticsearchStrings.closed = this.cast("closed")
  @scala.inline
  def none: typings.elasticsearch.elasticsearchStrings.none = this.cast("none")
  @scala.inline
  def open: typings.elasticsearch.elasticsearchStrings.open = this.cast("open")
}

