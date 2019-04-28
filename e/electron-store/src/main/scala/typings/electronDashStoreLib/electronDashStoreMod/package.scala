package typings
package electronDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashStoreMod {
  type Options[T] = (typeDashFestLib.typeDashFestMod.Omit[
    confLib.confMod.Options[T], 
    electronDashStoreLib.electronDashStoreLibStrings.configName | electronDashStoreLib.electronDashStoreLibStrings.projectName | electronDashStoreLib.electronDashStoreLibStrings.projectSuffix
  ]) with electronDashStoreLib.Anon_Name
}
