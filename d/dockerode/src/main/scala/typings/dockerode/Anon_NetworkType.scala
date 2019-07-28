package typings.dockerode

import org.scalablytyped.runtime.StringDictionary
import typings.dockerode.dockerodeMod.NetworkInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkType extends js.Object {
  var Networks: StringDictionary[NetworkInfo]
}

object Anon_NetworkType {
  @scala.inline
  def apply(Networks: StringDictionary[NetworkInfo]): Anon_NetworkType = {
    val __obj = js.Dynamic.literal(Networks = Networks)
  
    __obj.asInstanceOf[Anon_NetworkType]
  }
}

