package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: java.lang.String
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var color: java.lang.String
  var fit: js.UndefOr[
    gestaltLib.gestaltLibStrings.cover | gestaltLib.gestaltLibStrings.contain | gestaltLib.gestaltLibStrings.none
  ] = js.undefined
  var naturalHeight: scala.Double
  var naturalWidth: scala.Double
  var onError: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
  var srcSet: js.UndefOr[java.lang.String] = js.undefined
}

