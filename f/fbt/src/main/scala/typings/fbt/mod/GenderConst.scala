package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GenderConst extends StObject
@JSImport("fbt", "GenderConst")
@js.native
object GenderConst extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GenderConst & Double] = js.native
  
  @js.native
  sealed trait FEMALE_PLURAL
    extends StObject
       with GenderConst
  /* 8 */ val FEMALE_PLURAL: typings.fbt.mod.GenderConst.FEMALE_PLURAL & Double = js.native
  
  @js.native
  sealed trait FEMALE_SINGULAR
    extends StObject
       with GenderConst
  /* 1 */ val FEMALE_SINGULAR: typings.fbt.mod.GenderConst.FEMALE_SINGULAR & Double = js.native
  
  @js.native
  sealed trait FEMALE_SINGULAR_GUESS
    extends StObject
       with GenderConst
  /* 3 */ val FEMALE_SINGULAR_GUESS: typings.fbt.mod.GenderConst.FEMALE_SINGULAR_GUESS & Double = js.native
  
  @js.native
  sealed trait MALE_PLURAL
    extends StObject
       with GenderConst
  /* 9 */ val MALE_PLURAL: typings.fbt.mod.GenderConst.MALE_PLURAL & Double = js.native
  
  @js.native
  sealed trait MALE_SINGULAR
    extends StObject
       with GenderConst
  /* 2 */ val MALE_SINGULAR: typings.fbt.mod.GenderConst.MALE_SINGULAR & Double = js.native
  
  @js.native
  sealed trait MALE_SINGULAR_GUESS
    extends StObject
       with GenderConst
  /* 4 */ val MALE_SINGULAR_GUESS: typings.fbt.mod.GenderConst.MALE_SINGULAR_GUESS & Double = js.native
  
  @js.native
  sealed trait MIXED_UNKNOWN
    extends StObject
       with GenderConst
  /* 5 */ val MIXED_UNKNOWN: typings.fbt.mod.GenderConst.MIXED_UNKNOWN & Double = js.native
  
  @js.native
  sealed trait NEUTER_PLURAL
    extends StObject
       with GenderConst
  /* 10 */ val NEUTER_PLURAL: typings.fbt.mod.GenderConst.NEUTER_PLURAL & Double = js.native
  
  @js.native
  sealed trait NEUTER_SINGULAR
    extends StObject
       with GenderConst
  /* 6 */ val NEUTER_SINGULAR: typings.fbt.mod.GenderConst.NEUTER_SINGULAR & Double = js.native
  
  @js.native
  sealed trait NOT_A_PERSON
    extends StObject
       with GenderConst
  /* 0 */ val NOT_A_PERSON: typings.fbt.mod.GenderConst.NOT_A_PERSON & Double = js.native
  
  @js.native
  sealed trait UNKNOWN_PLURAL
    extends StObject
       with GenderConst
  /* 11 */ val UNKNOWN_PLURAL: typings.fbt.mod.GenderConst.UNKNOWN_PLURAL & Double = js.native
  
  @js.native
  sealed trait UNKNOWN_SINGULAR
    extends StObject
       with GenderConst
  /* 7 */ val UNKNOWN_SINGULAR: typings.fbt.mod.GenderConst.UNKNOWN_SINGULAR & Double = js.native
}
