package typings.formatjsIcuSkeletonParser

import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDateTimeMod {
  
  @JSImport("@formatjs/icu-skeleton-parser/lib/date-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDateTimeSkeleton(skeleton: String): DateTimeFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any]).asInstanceOf[DateTimeFormatOptions]
}
