package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// not complete definition of network inspection
// info which is returned by list / inspect

trait NetworkInspectInfo extends js.Object {
  var Attachable: scala.Boolean
  var Created: java.lang.String
  var Driver: java.lang.String
  var EnableIPv6: scala.Boolean
  var Id: java.lang.String
  var Ingress: scala.Boolean
  var Internal: scala.Boolean
  var Name: java.lang.String
  var Scope: java.lang.String
}

