package typings
package flickityLib.flickityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flickity", JSImport.Namespace)
@js.native
class namespaced protected () extends Flickity {
  /**
    * Initializes an new instance of Flickity .
    *
    * @param element Element selector string or container Element to initialize Flickity on
    * @param options (IFlickityOptions) Flickity options
    */
  def this(selector: java.lang.String) = this()
  def this(selector: stdLib.Element) = this()
  def this(selector: java.lang.String, options: FlickityOptions) = this()
  def this(selector: stdLib.Element, options: FlickityOptions) = this()
}

/* static members */
@JSImport("flickity", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  // static methods
  /**
    * (static) Get the Flickity instance.
    *
    * @param element Element selector string
    */
  def data(element: java.lang.String): flickityLib.flickityMod.Flickity = js.native
  def data(element: stdLib.Element): flickityLib.flickityMod.Flickity = js.native
}

