package typings.formatjsIcuMessageformatParser.libTypesMod

import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.plural
import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.pound
import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.select
import typings.formatjsIcuMessageformatParser.libTypesMod.TYPE.tag
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
  ): typings.formatjsIcuMessageformatParser.libTypesMod.PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.PluralElement]
  }
  
  inline def PoundElement(`type`: pound): typings.formatjsIcuMessageformatParser.libTypesMod.PoundElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.PoundElement]
  }
  
  inline def SelectElement(options: Record[String, PluralOrSelectOption], `type`: select, value: String): typings.formatjsIcuMessageformatParser.libTypesMod.SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.SelectElement]
  }
  
  inline def TagElement(children: js.Array[MessageFormatElement], `type`: tag, value: String): typings.formatjsIcuMessageformatParser.libTypesMod.TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.formatjsIcuMessageformatParser.libTypesMod.TagElement]
  }
}
