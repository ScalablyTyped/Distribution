package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeInspectInfo extends js.Object {
  var Driver: java.lang.String
  var Labels: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var Mountpoint: java.lang.String
  var Name: java.lang.String
  // Field is always present, but sometimes is null
  var Options: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var Scope: dockerodeLib.dockerodeLibStrings.local | dockerodeLib.dockerodeLibStrings.global
  var Status: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  // Field is sometimes present, and sometimes null
  var UsageData: js.UndefOr[dockerodeLib.Anon_RefCount | scala.Null] = js.undefined
}

