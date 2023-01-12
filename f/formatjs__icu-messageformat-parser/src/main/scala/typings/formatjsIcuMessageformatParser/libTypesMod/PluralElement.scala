package typings.formatjsIcuMessageformatParser.libTypesMod

import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.plural
import typings.std.Intl.PluralRuleType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralElement
  extends StObject
     with BaseElement[plural]
     with _MessageFormatElement {
  
  var offset: Double
  
  var options: Record[ValidPluralRule, PluralOrSelectOption]
  
  var pluralType: js.UndefOr[PluralRuleType] = js.undefined
}
object PluralElement {
  
  inline def apply(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PluralElement] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Record[ValidPluralRule, PluralOrSelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPluralType(value: PluralRuleType): Self = StObject.set(x, "pluralType", value.asInstanceOf[js.Any])
    
    inline def setPluralTypeUndefined: Self = StObject.set(x, "pluralType", js.undefined)
  }
}
