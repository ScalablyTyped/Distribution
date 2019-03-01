package typings
package feedparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object feedparserLibStrings {
  @js.native
  sealed trait atom
    extends feedparserLib.feedparserMod.FeedParserNs.Type
  
  @js.native
  sealed trait rdf
    extends feedparserLib.feedparserMod.FeedParserNs.Type
  
  @js.native
  sealed trait rss
    extends feedparserLib.feedparserMod.FeedParserNs.Type
  
  @scala.inline
  def atom: atom = "atom".asInstanceOf[atom]
  @scala.inline
  def rdf: rdf = "rdf".asInstanceOf[rdf]
  @scala.inline
  def rss: rss = "rss".asInstanceOf[rss]
}

