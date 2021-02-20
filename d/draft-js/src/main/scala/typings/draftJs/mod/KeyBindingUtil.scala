package typings.draftJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "KeyBindingUtil")
@js.native
class KeyBindingUtil ()
  extends typings.draftJs.mod.Draft.Component.Utils.KeyBindingUtil
object KeyBindingUtil {
  
  /* static member */
  @JSImport("draft-js", "KeyBindingUtil.hasCommandModifier")
  @js.native
  def hasCommandModifier(e: SyntheticKeyboardEvent): Boolean = js.native
  
  /**
    * Check whether the ctrlKey modifier is *not* being used in conjunction with
    * the altKey modifier. If they are combined, the result is an `altGraph`
    * key modifier, which should not be handled by this set of key bindings.
    */
  /* static member */
  @JSImport("draft-js", "KeyBindingUtil.isCtrlKeyCommand")
  @js.native
  def isCtrlKeyCommand(e: SyntheticKeyboardEvent): Boolean = js.native
  
  /* static member */
  @JSImport("draft-js", "KeyBindingUtil.isOptionKeyCommand")
  @js.native
  def isOptionKeyCommand(e: SyntheticKeyboardEvent): Boolean = js.native
  
  /* static member */
  @JSImport("draft-js", "KeyBindingUtil.isSoftNewlineEvent")
  @js.native
  def isSoftNewlineEvent(e: SyntheticKeyboardEvent): Boolean = js.native
  
  /**
    * Check whether heuristics that only apply to macOS are used
    * internally, for example when determining the key combination
    * used as command modifier.
    */
  /* static member */
  @JSImport("draft-js", "KeyBindingUtil.usesMacOSHeuristics")
  @js.native
  def usesMacOSHeuristics(): Boolean = js.native
}
