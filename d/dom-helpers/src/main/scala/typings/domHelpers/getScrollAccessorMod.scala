package typings.domHelpers

import typings.domHelpers.anon.FnCall
import typings.domHelpers.domHelpersStrings.pageXOffset
import typings.domHelpers.domHelpersStrings.pageYOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getScrollAccessorMod {
  
  @JSImport("dom-helpers/cjs/getScrollAccessor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default_pageXOffset(offset: pageXOffset): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(offset.asInstanceOf[js.Any]).asInstanceOf[FnCall]
  
  @scala.inline
  def default_pageYOffset(offset: pageYOffset): FnCall = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(offset.asInstanceOf[js.Any]).asInstanceOf[FnCall]
}
