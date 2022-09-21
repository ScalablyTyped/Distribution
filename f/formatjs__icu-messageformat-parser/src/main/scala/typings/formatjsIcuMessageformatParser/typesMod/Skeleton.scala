package typings.formatjsIcuMessageformatParser.typesMod

import typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.dateTime
import typings.formatjsIcuMessageformatParser.typesMod.SKELETON_TYPE.number
import typings.formatjsIcuSkeletonParser.formatjsIcuSkeletonParserMod.NumberSkeletonToken
import typings.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.formatjsIcuMessageformatParser.typesMod.NumberSkeleton
  - typings.formatjsIcuMessageformatParser.typesMod.DateTimeSkeleton
*/
trait Skeleton extends StObject
object Skeleton {
  
  inline def DateTimeSkeleton(parsedOptions: DateTimeFormatOptions, pattern: String, `type`: dateTime): typings.formatjsIcuMessageformatParser.typesMod.DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.DateTimeSkeleton]
  }
  
  inline def NumberSkeleton(parsedOptions: ExtendedNumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: number): typings.formatjsIcuMessageformatParser.typesMod.NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.NumberSkeleton]
  }
}
