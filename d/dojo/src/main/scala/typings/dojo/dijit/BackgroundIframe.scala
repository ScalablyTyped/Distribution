package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dijit.BackgroundIframe")
@js.native
object BackgroundIframe extends js.Object {
  /**
    * destroy the iframe
    * 
    */
  type destroy = js.Function0[Unit]
  /**
    * Resize the iframe so it's the same size as node.
    * Needed on IE6 and IE/quirks because height:100% doesn't work right.
    * 
    * @param node             
    */
  type resize = js.Function1[/* node */ js.Any, Unit]
}

