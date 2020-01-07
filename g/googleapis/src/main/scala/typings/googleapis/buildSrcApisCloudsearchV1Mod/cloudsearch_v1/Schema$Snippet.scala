package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Snippet of the search result, which summarizes the content of the resulting
  * page.
  */
@js.native
trait Schema$Snippet extends js.Object {
  /**
    * The matched ranges in the snippet.
    */
  var matchRanges: js.UndefOr[js.Array[Schema$MatchRange]] = js.native
  /**
    * The snippet of the document. The snippet of the document. May contain
    * escaped HTML character that should be unescaped prior to rendering.
    */
  var snippet: js.UndefOr[String] = js.native
}

object Schema$Snippet {
  @scala.inline
  def apply(matchRanges: js.Array[Schema$MatchRange] = null, snippet: String = null): Schema$Snippet = {
    val __obj = js.Dynamic.literal()
    if (matchRanges != null) __obj.updateDynamic("matchRanges")(matchRanges.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Snippet]
  }
}

