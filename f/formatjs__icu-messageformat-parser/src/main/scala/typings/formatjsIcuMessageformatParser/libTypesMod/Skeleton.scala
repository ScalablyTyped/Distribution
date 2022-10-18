package typings.formatjsIcuMessageformatParser.libTypesMod

import typings.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.dateTime
import typings.formatjsIcuMessageformatParser.libTypesMod.SKELETON_TYPE.number
import typings.formatjsIcuSkeletonParser.numberMod.NumberSkeletonToken
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.formatjsIcuMessageformatParser.libTypesMod.NumberSkeleton
  - typings.formatjsIcuMessageformatParser.libTypesMod.DateTimeSkeleton
*/
trait Skeleton extends StObject
object Skeleton {
  
  inline def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String, `type`: dateTime): typings.formatjsIcuMessageformatParser.libTypesMod.DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.DateTimeSkeleton]
  }
  
  inline def NumberSkeleton(parsedOptions: ExtendedNumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: number): typings.formatjsIcuMessageformatParser.libTypesMod.NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.NumberSkeleton]
  }
}
