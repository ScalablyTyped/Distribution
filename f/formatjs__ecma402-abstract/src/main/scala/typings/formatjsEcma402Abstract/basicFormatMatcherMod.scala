package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicFormatMatcherMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/BasicFormatMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def BasicFormatMatcher(options: DateTimeFormatOptions, formats: js.Array[Formats]): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("BasicFormatMatcher")(options.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Formats]
}
