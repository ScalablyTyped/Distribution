package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewBuilder[Review]
  extends AdWordsBuilder[Review]
     with hasMobilePreferredBuilder[ReviewBuilder[Review]]
     with hasStartAndEndDateBuilder[ReviewBuilder[Review]]
     with hasSchedulesBuilder[ReviewBuilder[Review]] {
  
  def withExactlyQuoted(exactlyQuoted: Boolean): ReviewBuilder[Review] = js.native
  
  def withSourceName(sourceName: String): ReviewBuilder[Review] = js.native
  
  def withSourceUrl(sourceUrl: String): ReviewBuilder[Review] = js.native
  
  def withText(text: String): ReviewBuilder[Review] = js.native
}
