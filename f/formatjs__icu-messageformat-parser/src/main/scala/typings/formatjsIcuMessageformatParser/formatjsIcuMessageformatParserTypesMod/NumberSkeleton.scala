package typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod

import typings.formatjsIcuMessageformatParser.formatjsIcuMessageformatParserTypesMod.SKELETON_TYPE.number
import typings.formatjsIcuSkeletonParser.formatjsIcuSkeletonParserMod.NumberSkeletonToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberSkeleton
  extends StObject
     with Skeleton {
  
  var location: js.UndefOr[Location] = js.undefined
  
  var parsedOptions: ExtendedNumberFormatOptions
  
  var tokens: js.Array[NumberSkeletonToken]
  
  var `type`: number
}
object NumberSkeleton {
  
  inline def apply(parsedOptions: ExtendedNumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: number): NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeleton]
  }
  
  extension [Self <: NumberSkeleton](x: Self) {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setParsedOptions(value: ExtendedNumberFormatOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
    
    inline def setTokens(value: js.Array[NumberSkeletonToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    inline def setTokensVarargs(value: NumberSkeletonToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
