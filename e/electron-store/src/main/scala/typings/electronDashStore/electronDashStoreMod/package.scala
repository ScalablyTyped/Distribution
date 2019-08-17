package typings.electronDashStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object electronDashStoreMod {
  import typings.electronDashStore.Anon_Name
  import typings.electronDashStore.electronDashStoreStrings.configName
  import typings.electronDashStore.electronDashStoreStrings.projectName
  import typings.electronDashStore.electronDashStoreStrings.projectSuffix
  import typings.typeDashFest.typeDashFestMod.Omit

  type Options[T] = (Omit[typings.conf.confMod.Options[T], configName | projectName | projectSuffix]) with Anon_Name
}
