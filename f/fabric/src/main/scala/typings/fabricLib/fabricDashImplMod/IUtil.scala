package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtil
  extends IUtilAnimation
     with IUtilArc
     with IObservable[IUtil]
     with IUtilDomEvent
     with IUtilDomMisc
     with IUtilDomRequest
     with IUtilDomStyle
     with IUtilClass
     with IUtilMisc {
  var array: IUtilArray = js.native
  var ease: IUtilAnimEase = js.native
  var `object`: IUtilObject = js.native
  var string: IUtilString = js.native
}

