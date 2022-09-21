package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IntlVariations extends StObject
@JSImport("fbt", "IntlVariations")
@js.native
object IntlVariations extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntlVariations & Double] = js.native
  
  @js.native
  sealed trait BITMASK_GENDER
    extends StObject
       with IntlVariations
  /* 3 */ val BITMASK_GENDER: typings.fbt.mod.IntlVariations.BITMASK_GENDER & Double = js.native
  
  @js.native
  sealed trait BITMASK_NUMBER
    extends StObject
       with IntlVariations
  /* 28 */ val BITMASK_NUMBER: typings.fbt.mod.IntlVariations.BITMASK_NUMBER & Double = js.native
  
  @js.native
  sealed trait GENDER_FEMALE
    extends StObject
       with IntlVariations
       with IntlVariationsGender
  /* 2 */ val GENDER_FEMALE: typings.fbt.mod.IntlVariations.GENDER_FEMALE & Double = js.native
  
  @js.native
  sealed trait GENDER_MALE
    extends StObject
       with IntlVariations
       with IntlVariationsGender
  /* 1 */ val GENDER_MALE: typings.fbt.mod.IntlVariations.GENDER_MALE & Double = js.native
  
  @js.native
  sealed trait GENDER_UNKNOWN
    extends StObject
       with IntlVariations
       with IntlVariationsGender
  /* 3 */ val GENDER_UNKNOWN: typings.fbt.mod.IntlVariations.GENDER_UNKNOWN & Double = js.native
  
  @js.native
  sealed trait NUMBER_FEW
    extends StObject
       with IntlVariations
  /* 20 */ val NUMBER_FEW: typings.fbt.mod.IntlVariations.NUMBER_FEW & Double = js.native
  
  @js.native
  sealed trait NUMBER_MANY
    extends StObject
       with IntlVariations
  /* 12 */ val NUMBER_MANY: typings.fbt.mod.IntlVariations.NUMBER_MANY & Double = js.native
  
  @js.native
  sealed trait NUMBER_ONE
    extends StObject
       with IntlVariations
  /* 4 */ val NUMBER_ONE: typings.fbt.mod.IntlVariations.NUMBER_ONE & Double = js.native
  
  @js.native
  sealed trait NUMBER_OTHER
    extends StObject
       with IntlVariations
  /* 24 */ val NUMBER_OTHER: typings.fbt.mod.IntlVariations.NUMBER_OTHER & Double = js.native
  
  @js.native
  sealed trait NUMBER_TWO
    extends StObject
       with IntlVariations
  /* 8 */ val NUMBER_TWO: typings.fbt.mod.IntlVariations.NUMBER_TWO & Double = js.native
  
  @js.native
  sealed trait NUMBER_ZERO
    extends StObject
       with IntlVariations
  /* 16 */ val NUMBER_ZERO: typings.fbt.mod.IntlVariations.NUMBER_ZERO & Double = js.native
}
