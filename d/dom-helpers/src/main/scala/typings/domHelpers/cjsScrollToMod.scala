package typings.domHelpers

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsScrollToMod {
  
  @JSImport("dom-helpers/cjs/scrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(selected: HTMLElement): js.UndefOr[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selected.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
  inline def default(selected: HTMLElement, scrollParent: HTMLElement): js.UndefOr[js.Function0[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selected.asInstanceOf[js.Any], scrollParent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Function0[Unit]]]
}
