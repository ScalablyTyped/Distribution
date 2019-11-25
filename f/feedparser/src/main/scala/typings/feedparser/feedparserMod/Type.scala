package typings.feedparser.feedparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.feedparser.feedparserStrings.atom
  - typings.feedparser.feedparserStrings.rss
  - typings.feedparser.feedparserStrings.rdf
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def atom: typings.feedparser.feedparserStrings.atom = this.cast("atom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rdf: typings.feedparser.feedparserStrings.rdf = this.cast("rdf")
  @scala.inline
  def rss: typings.feedparser.feedparserStrings.rss = this.cast("rss")
}

