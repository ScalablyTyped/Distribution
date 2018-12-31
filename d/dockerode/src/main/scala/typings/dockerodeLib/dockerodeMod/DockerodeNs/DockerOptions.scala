package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerOptions extends js.Object {
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.undefined
  var ca: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | nodeLib.Buffer | js.Array[nodeLib.Buffer] | js.Array[KeyObject]
  ] = js.undefined
  var port: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var protocol: js.UndefOr[dockerodeLib.dockerodeLibStrings.https | dockerodeLib.dockerodeLibStrings.http] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

