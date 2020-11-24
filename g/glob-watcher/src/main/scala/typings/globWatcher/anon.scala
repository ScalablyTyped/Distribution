package typings.globWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Subscribe extends js.Object {
    
    def subscribe(): js.Any = js.native
    def subscribe(next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): js.Any = js.native
    def subscribe(next: js.UndefOr[scala.Nothing], error: js.Function1[/* error */ js.Any, Unit]): js.Any = js.native
    def subscribe(
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def subscribe(next: js.Function1[/* value */ js.Any, Unit]): js.Any = js.native
    def subscribe(
      next: js.Function1[/* value */ js.Any, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def subscribe(next: js.Function1[/* value */ js.Any, Unit], error: js.Function1[/* error */ js.Any, Unit]): js.Any = js.native
    def subscribe(
      next: js.Function1[/* value */ js.Any, Unit],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
  }
}
