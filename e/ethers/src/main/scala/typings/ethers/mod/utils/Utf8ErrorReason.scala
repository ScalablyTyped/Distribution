package typings.ethers.mod.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "utils.Utf8ErrorReason")
@js.native
object Utf8ErrorReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason with String] = js.native
  
  /* "bad codepoint prefix" */ val BAD_PREFIX: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.BAD_PREFIX with String = js.native
  
  /* "missing continuation byte" */ val MISSING_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.MISSING_CONTINUE with String = js.native
  
  /* "out of UTF-8 range" */ val OUT_OF_RANGE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OUT_OF_RANGE with String = js.native
  
  /* "overlong representation" */ val OVERLONG: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERLONG with String = js.native
  
  /* "string overrun" */ val OVERRUN: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.OVERRUN with String = js.native
  
  /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE with String = js.native
  
  /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typings.ethersprojectStrings.utf8Mod.Utf8ErrorReason.UTF16_SURROGATE with String = js.native
}
