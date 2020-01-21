package typings.documentdb.mod

import typings.documentdb.documentdbStrings.post_
import typings.documentdb.documentdbStrings.pre_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.documentdb.documentdbStrings.Pre
  - typings.documentdb.documentdbStrings.Post
  - typings.documentdb.documentdbStrings.pre_
  - typings.documentdb.documentdbStrings.post_
*/
trait TriggerType extends js.Object

object TriggerType {
  @scala.inline
  def Post: typings.documentdb.documentdbStrings.Post = this.cast("Post")
  @scala.inline
  def Pre: typings.documentdb.documentdbStrings.Pre = this.cast("Pre")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def post: post_ = this.cast("post")
  @scala.inline
  def pre: pre_ = this.cast("pre")
}

