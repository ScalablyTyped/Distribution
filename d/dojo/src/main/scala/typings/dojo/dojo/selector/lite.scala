package typings.dojo.dojo.selector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/selector/lite.html
  *
  * A small lightweight query selector engine that implements CSS2.1 selectors
  * minus pseudo-classes and the sibling combinator, plus CSS3 attribute selectors
  *
  * @param selector
  * @param root
  */
@js.native
trait lite extends js.Object {
  /**
    *
    */
  var `match`: js.Object = js.native
  def apply(selector: js.Any, root: js.Any): Unit = js.native
}

