package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
    * You can specify what to show by either setting the .source URL property
    * to a URL string or the .element property to an HTMLImageElement,
    * HTMLCanvasElement, or HTMLVideoElement.
    */
@JSImport("go", "Picture")
@js.native
class Picture ()
  extends goLib.goMod.goNs.Picture

/**
    * A Picture is a GraphObject that shows an image, video-frame, or Canvas element.
    * You can specify what to show by either setting the .source URL property
    * to a URL string or the .element property to an HTMLImageElement,
    * HTMLCanvasElement, or HTMLVideoElement.
    */
@JSImport("go", "Picture")
@js.native
object Picture extends js.Object {
  def clearCache(): scala.Unit = js.native
  def clearCache(url: java.lang.String): scala.Unit = js.native
}

