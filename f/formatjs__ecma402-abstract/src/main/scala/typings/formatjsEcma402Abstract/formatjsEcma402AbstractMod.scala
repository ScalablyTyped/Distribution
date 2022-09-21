package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Value
import typings.formatjsEcma402Abstract.anon.valueanyThisTypeany
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal
import typings.std.NonNullable
import typings.std.Pick
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsEcma402AbstractMod {
  
  @JSImport("@formatjs/ecma402-abstract/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "UNICODE_EXTENSION_SEQUENCE_REGEX")
  @js.native
  val UNICODE_EXTENSION_SEQUENCE_REGEX: js.RegExp = js.native
  
  inline def defineProperty[T /* <: js.Object */](target: T, name: String, hasValue: valueanyThisTypeany): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], hasValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defineProperty[T /* <: js.Object */](target: T, name: js.Symbol, hasValue: valueanyThisTypeany): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], hasValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getInternalSlot")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any]
  
  inline def getMagnitude(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMagnitude")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMultiInternalSlots")((List(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Pick[Internal, Field]]
  
  inline def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def invariant(condition: Boolean, message: String, Err: Any): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any], Err.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  
  inline def isLiteralPart(patternPart: Value): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralPart")(patternPart.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean]
  inline def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralPart")(patternPart.asInstanceOf[js.Any]).asInstanceOf[/* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean]
  
  inline def repeat(s: String, times: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(s.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInternalSlot")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMultiInternalSlots")(map.asInstanceOf[js.Any], pl.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LiteralPart extends StObject {
    
    var `type`: literal
    
    var value: String
  }
  object LiteralPart {
    
    inline def apply(value: String): LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[LiteralPart]
    }
    
    extension [Self <: LiteralPart](x: Self) {
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
