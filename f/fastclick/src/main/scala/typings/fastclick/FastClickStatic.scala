package typings.fastclick

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastClickStatic
  extends Instantiable1[/* layer */ js.Any, FastClickObject]
     with Instantiable2[/* layer */ js.Any, /* options */ FastClickOptions, FastClickObject] {
  def attach(layer: js.Any): FastClickObject = js.native
  def attach(layer: js.Any, options: FastClickOptions): FastClickObject = js.native
}

