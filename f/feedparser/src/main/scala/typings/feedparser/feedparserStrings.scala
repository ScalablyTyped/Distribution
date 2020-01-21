package typings.feedparser

import typings.feedparser.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object feedparserStrings {
  @js.native
  sealed trait atom extends Type
  
  @js.native
  sealed trait rdf extends Type
  
  @js.native
  sealed trait rss extends Type
  
  @scala.inline
  def atom: atom = "atom".asInstanceOf[atom]
  @scala.inline
  def rdf: rdf = "rdf".asInstanceOf[rdf]
  @scala.inline
  def rss: rss = "rss".asInstanceOf[rss]
}

