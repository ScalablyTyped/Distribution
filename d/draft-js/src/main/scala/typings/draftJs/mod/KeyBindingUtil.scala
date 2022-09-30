package typings.draftJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "KeyBindingUtil")
@js.native
open class KeyBindingUtil ()
  extends StObject
     with typings.draftJs.mod.Draft.Component.Utils.KeyBindingUtil
object KeyBindingUtil {
  
  @JSImport("draft-js", "KeyBindingUtil")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def hasCommandModifier(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCommandModifier")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Check whether the ctrlKey modifier is *not* being used in conjunction with
    * the altKey modifier. If they are combined, the result is an `altGraph`
    * key modifier, which should not be handled by this set of key bindings.
    */
  /* static member */
  inline def isCtrlKeyCommand(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCtrlKeyCommand")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isOptionKeyCommand(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionKeyCommand")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isSoftNewlineEvent(e: SyntheticKeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSoftNewlineEvent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Check whether heuristics that only apply to macOS are used
    * internally, for example when determining the key combination
    * used as command modifier.
    */
  /* static member */
  inline def usesMacOSHeuristics(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("usesMacOSHeuristics")().asInstanceOf[Boolean]
}
