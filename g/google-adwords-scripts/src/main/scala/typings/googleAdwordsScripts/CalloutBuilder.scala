package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutBuilder[Callout]
  extends AdWordsBuilder[Callout]
     with hasMobilePreferredBuilder[CalloutBuilder[Callout]]
     with hasSchedulesBuilder[CalloutBuilder[Callout]]
     with hasStartAndEndDateBuilder[CalloutBuilder[Callout]] {
  
  def withText(text: String): CalloutBuilder[Callout] = js.native
}
