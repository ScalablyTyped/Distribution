package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetBuilder[Snippet]
  extends AdWordsBuilder[Snippet]
     with hasMobilePreferredBuilder[SnippetBuilder[Snippet]]
     with hasStartAndEndDateBuilder[SnippetBuilder[Snippet]]
     with hasSchedulesBuilder[SnippetBuilder[Snippet]] {
  def withHeader(header: String): SnippetBuilder[Snippet] = js.native
  def withValues(values: js.Array[String]): SnippetBuilder[Snippet] = js.native
}

