package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkType extends js.Object {
  var Networks: org.scalablytyped.runtime.StringDictionary[dockerodeLib.dockerodeMod.DockerodeNs.NetworkInfo]
}

object Anon_NetworkType {
  @scala.inline
  def apply(
    Networks: org.scalablytyped.runtime.StringDictionary[dockerodeLib.dockerodeMod.DockerodeNs.NetworkInfo]
  ): Anon_NetworkType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Networks")(Networks)
    __obj.asInstanceOf[Anon_NetworkType]
  }
}

