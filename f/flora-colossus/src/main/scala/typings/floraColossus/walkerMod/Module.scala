package typings.floraColossus.walkerMod

import typings.floraColossus.depTypesMod.DepType
import typings.floraColossus.nativeModuleTypesMod.NativeModuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var depType: DepType
  var name: String
  var nativeModuleType: NativeModuleType
  var path: String
}

object Module {
  @scala.inline
  def apply(depType: DepType, name: String, nativeModuleType: NativeModuleType, path: String): Module = {
    val __obj = js.Dynamic.literal(depType = depType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeModuleType = nativeModuleType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

