package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Value
import typings.formatjsEcma402Abstract.anon.valueanyThisTypeany
import typings.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimePart
import typings.std.NonNullable
import typings.std.Pick
import typings.std.RegExp
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatjsEcma402AbstractUtilsMod {
  
  @JSImport("@formatjs/ecma402-abstract/utils", "UNICODE_EXTENSION_SEQUENCE_REGEX")
  @js.native
  val UNICODE_EXTENSION_SEQUENCE_REGEX: RegExp = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "defineProperty")
  @js.native
  def defineProperty[T /* <: js.Object */](target: T, name: String, hasValue: valueanyThisTypeany): Unit = js.native
  @JSImport("@formatjs/ecma402-abstract/utils", "defineProperty")
  @js.native
  def defineProperty[T /* <: js.Object */](target: T, name: js.Symbol, hasValue: valueanyThisTypeany): Unit = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "getInternalSlot")
  @js.native
  def getInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, field: Field): /* import warning: importer.ImportType#apply Failed type conversion: Internal[Field] */ js.Any = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "getMagnitude")
  @js.native
  def getMagnitude(x: Double): Double = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "getMultiInternalSlots")
  @js.native
  def getMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, fields: Field*): Pick[Internal, Field] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "invariant")
  @js.native
  def invariant(condition: Boolean, message: String): /* asserts condition */ Boolean = js.native
  @JSImport("@formatjs/ecma402-abstract/utils", "invariant")
  @js.native
  def invariant(condition: Boolean, message: String, Err: js.Any): /* asserts condition */ Boolean = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "isLiteralPart")
  @js.native
  def isLiteralPart(patternPart: Value): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean = js.native
  @JSImport("@formatjs/ecma402-abstract/utils", "isLiteralPart")
  @js.native
  def isLiteralPart(patternPart: LiteralPart): /* is @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/utils.LiteralPart */ Boolean = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "repeat")
  @js.native
  def repeat(s: String, times: Double): String = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "setInternalSlot")
  @js.native
  def setInternalSlot[Instance /* <: js.Object */, Internal /* <: js.Object */, Field /* <: /* keyof Internal */ String */](
    map: WeakMap[Instance, Internal],
    pl: Instance,
    field: Field,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<Internal>[Field] */ js.Any
  ): Unit = js.native
  
  @JSImport("@formatjs/ecma402-abstract/utils", "setMultiInternalSlots")
  @js.native
  def setMultiInternalSlots[Instance /* <: js.Object */, Internal /* <: js.Object */, K /* <: /* keyof Internal */ String */](map: WeakMap[Instance, Internal], pl: Instance, props: Pick[NonNullable[Internal], K]): Unit = js.native
  
  @js.native
  trait LiteralPart extends RelativeTimePart {
    
    var `type`: literal = js.native
    
    var value: String = js.native
  }
  object LiteralPart {
    
    @scala.inline
    def apply(`type`: literal, value: String): LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralPart]
    }
    
    @scala.inline
    implicit class LiteralPartMutableBuilder[Self <: LiteralPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
