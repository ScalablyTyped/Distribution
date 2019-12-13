package typings.fsDashMerger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsDashMergerMod {
  import typings.broccoliDashNodeDashApi.broccoliDashNodeDashApiMod.InputNode
  import typings.node.Buffer

  type FileContent = String | Buffer | Null
  type Node = FSMergerObject | InputNode
}
