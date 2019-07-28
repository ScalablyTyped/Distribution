package typings.flipsnap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipsnapStatic extends js.Object {
  /**
    * @param element The element
    */
  def apply(element: HTMLElement): IFlipsnap = js.native
  def apply(element: HTMLElement, opts: FlipsnapOptions): IFlipsnap = js.native
  /**
    * @param selector The parameter must be CSS Selector. When set string, to get first element of result. Not all element.
    */
  def apply(selector: String): IFlipsnap = js.native
  def apply(selector: String, opts: FlipsnapOptions): IFlipsnap = js.native
}

