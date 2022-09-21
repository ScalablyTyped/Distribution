package typings.formatjsIcuMessageformatParser.typesMod

import typings.formatjsIcuMessageformatParser.typesMod.TYPE.plural
import typings.formatjsIcuMessageformatParser.typesMod.TYPE.pound
import typings.formatjsIcuMessageformatParser.typesMod.TYPE.select
import typings.formatjsIcuMessageformatParser.typesMod.TYPE.tag
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _MessageFormatElement extends StObject
object _MessageFormatElement {
  
  inline def PluralElement(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): typings.formatjsIcuMessageformatParser.typesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.PluralElement]
  }
  
  inline def PoundElement(`type`: pound): typings.formatjsIcuMessageformatParser.typesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.PoundElement]
  }
  
  inline def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typings.formatjsIcuMessageformatParser.typesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.SelectElement]
  }
  
  inline def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typings.formatjsIcuMessageformatParser.typesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.typesMod.TagElement]
  }
}
