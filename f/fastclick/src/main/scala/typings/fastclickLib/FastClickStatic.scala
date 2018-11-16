package typings
package fastclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastClickStatic
  extends ScalablyTyped.runtime.Instantiable1[/* layer */ js.Any, FastClickObject]
     with ScalablyTyped.runtime.Instantiable2[/* layer */ js.Any, /* options */ FastClickOptions, FastClickObject] {
  def attach(layer: js.Any): FastClickObject = js.native
  def attach(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
}

