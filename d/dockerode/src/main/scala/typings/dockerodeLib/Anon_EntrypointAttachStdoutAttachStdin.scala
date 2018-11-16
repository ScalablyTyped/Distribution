package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_EntrypointAttachStdoutAttachStdin extends js.Object {
  var ArgsEscaped: scala.Boolean
  var AttachStderr: scala.Boolean
  var AttachStdin: scala.Boolean
  var AttachStdout: scala.Boolean
  var Cmd: js.Array[java.lang.String]
  var Domainname: java.lang.String
  var Entrypoint: js.UndefOr[js.Any] = js.undefined
  var Env: js.Array[java.lang.String]
  var ExposedPorts: ScalablyTyped.runtime.StringDictionary[js.Object]
  var Hostname: java.lang.String
  var Image: java.lang.String
  var Labels: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  var OnBuild: js.UndefOr[js.Array[_]] = js.undefined
  var OpenStdin: scala.Boolean
  var StdinOnce: scala.Boolean
  var Tty: scala.Boolean
  var User: java.lang.String
  var Volumes: ScalablyTyped.runtime.StringDictionary[js.Object]
  var WorkingDir: java.lang.String
}

