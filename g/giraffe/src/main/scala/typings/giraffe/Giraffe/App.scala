package typings.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends View[Model] {
  
  def addInitializer(
    initializer: js.Function2[
      /* options */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ): App = js.native
  
  var routes: StringMap = js.native
  
  def start(): App = js.native
  def start(options: js.Any): App = js.native
}
