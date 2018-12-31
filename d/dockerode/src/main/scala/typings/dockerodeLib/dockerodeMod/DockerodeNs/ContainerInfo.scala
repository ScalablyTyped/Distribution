package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerInfo extends js.Object {
  var Command: java.lang.String
  var Created: scala.Double
  var HostConfig: dockerodeLib.Anon_NetworkMode
  var Id: java.lang.String
  var Image: java.lang.String
  var ImageID: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var Names: js.Array[java.lang.String]
  var NetworkSettings: dockerodeLib.Anon_Networks
  var Ports: js.Array[Port]
  var State: java.lang.String
  var Status: java.lang.String
}

