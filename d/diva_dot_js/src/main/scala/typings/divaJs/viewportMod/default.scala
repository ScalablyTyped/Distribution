package typings.divaJs.viewportMod

import typings.divaJs.anon.IntersectionTolerance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diva.js/viewport", JSImport.Default)
@js.native
class default protected () extends Viewport {
  def this(outer: HTMLElement) = this()
  def this(outer: HTMLElement, options: IntersectionTolerance) = this()
}
