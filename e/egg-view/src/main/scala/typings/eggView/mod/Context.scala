package typings.eggView.mod

import typings.eggView.ContextView
import typings.eggView.ViewBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends ViewBase {
  
  /**
    * View instance that is created every request
    */
  var view: ContextView = js.native
}
