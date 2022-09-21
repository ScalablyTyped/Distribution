package typings.globWatcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Subscribe extends StObject {
    
    def subscribe(): Any = js.native
    def subscribe(next: js.Function1[/* value */ Any, Unit]): Any = js.native
    def subscribe(next: js.Function1[/* value */ Any, Unit], error: js.Function1[/* error */ Any, Unit]): Any = js.native
    def subscribe(
      next: js.Function1[/* value */ Any, Unit],
      error: js.Function1[/* error */ Any, Unit],
      complete: js.Function0[Unit]
    ): Any = js.native
    def subscribe(next: js.Function1[/* value */ Any, Unit], error: Unit, complete: js.Function0[Unit]): Any = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit]): Any = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Any = js.native
    def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Any = js.native
  }
}
