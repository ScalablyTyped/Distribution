package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.UppercaseLinks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isValidTimeZoneNameMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/IsValidTimeZoneName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def IsValidTimeZoneName(tz: String, hasTzDataUppercaseLinks: UppercaseLinks): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("IsValidTimeZoneName")(tz.asInstanceOf[js.Any], hasTzDataUppercaseLinks.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
