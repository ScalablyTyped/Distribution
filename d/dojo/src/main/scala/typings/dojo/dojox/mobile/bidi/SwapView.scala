package typings.dojo.dojox.mobile.bidi

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/SwapView.html
  *
  *
  */
@JSGlobal("dojox.mobile.bidi.SwapView")
@js.native
class SwapView () extends js.Object {
  /**
    * Boolean value indicate whether to call the parent version of the function or the child one.
    * Used to support mirroring.
    *
    */
  var callParentFunction: Boolean = js.native
  /**
    *
    * @param node
    */
  def nextView(node: HTMLElement): js.Any = js.native
  /**
    *
    * @param node
    */
  def previousView(node: HTMLElement): js.Any = js.native
}

