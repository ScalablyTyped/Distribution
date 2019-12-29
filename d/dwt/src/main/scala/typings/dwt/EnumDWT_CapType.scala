package typings.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWT_CapType extends js.Object

/** Capabilities exist in many varieties but all have a Default Value, Current Value, and may have other values available that can be supported if selected.
  *  To help categorize the supported values into clear structures, TWAIN defines four types of containers for capabilities =
  *  TW_ONEVALUE, TW_ARRAY, TW_RANGE and TW_ENUMERATION.
  */
@JSGlobal("EnumDWT_CapType")
@js.native
object EnumDWT_CapType extends js.Object {
  /** A rectangular array of values that describe a logical item. It is similar to the TW_ONEVALUE because the current and default values are the same and
    *  there are no other values to select from. For example, a list of the names, such as the supported capabilities list returned by the CAP_SUPPORTEDCAPS
    *  capability, would use this type of container.
    */
  @js.native
  sealed trait TWON_ARRAY extends EnumDWT_CapType
  
  /** This is the most general type because it defines a list of values from which the Current Value can be chosen.
    *  The values do not progress uniformly through a range and there is not a consistent step size between the values.
    *  For example, if a Source's resolution options do not occur in even step sizes then an enumeration would be used (for example, 150, 400, and 600).
    */
  @js.native
  sealed trait TWON_ENUMERATION extends EnumDWT_CapType
  
  /** Nothing. */
  @js.native
  sealed trait TWON_NONE extends EnumDWT_CapType
  
  /** A single value whose current and default values are coincident. The range of available values for this type of capability is simply this single value.
    *  For example, a capability that indicates the presence of a document feeder could be of this type.
    */
  @js.native
  sealed trait TWON_ONEVALUE extends EnumDWT_CapType
  
  /** Many capabilities allow users to select their current value from a range of regularly spaced values.
    *  The capability can specify the minimum and maximum acceptable values and the incremental step size between the values.
    *  For example, resolution might be supported from 100 to 600 in steps of 50 (100, 150, 200, ..., 550, 600).
    */
  @js.native
  sealed trait TWON_RANGE extends EnumDWT_CapType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWT_CapType with Double] = js.native
  /* 3 */ @js.native
  object TWON_ARRAY extends TopLevel[TWON_ARRAY with Double]
  
  /* 4 */ @js.native
  object TWON_ENUMERATION extends TopLevel[TWON_ENUMERATION with Double]
  
  /* 0 */ @js.native
  object TWON_NONE extends TopLevel[TWON_NONE with Double]
  
  /* 5 */ @js.native
  object TWON_ONEVALUE extends TopLevel[TWON_ONEVALUE with Double]
  
  /* 6 */ @js.native
  object TWON_RANGE extends TopLevel[TWON_RANGE with Double]
  
}

