package typings.flickity.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flickity", JSImport.Namespace)
@js.native
class ^ protected () extends Flickity {
  /**
    * Initializes an new instance of Flickity .
    *
    * @param element Element selector string or container Element to initialize Flickity on
    * @param options (IOptions) Flickity options
    */
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: String, options: Options) = this()
  def this(selector: Element, options: Options) = this()
}

@JSImport("flickity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // static methods
  /**
    * (static) Get the Flickity instance.
    *
    * @param element Element selector string
    */
  def data(element: String): Flickity = js.native
  def data(element: Element): Flickity = js.native
}

