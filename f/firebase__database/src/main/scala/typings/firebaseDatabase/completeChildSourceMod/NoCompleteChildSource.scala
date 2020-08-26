package typings.firebaseDatabase.completeChildSourceMod

import typings.firebaseDatabase.indexMod.Index
import typings.firebaseDatabase.nodeMod.NamedNode
import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/CompleteChildSource", "NoCompleteChildSource_")
@js.native
class NoCompleteChildSource () extends CompleteChildSource {
  /**
    * @inheritDoc
    */
  def getChildAfterChild(): NamedNode | Null = js.native
  def getChildAfterChild(index: js.UndefOr[scala.Nothing], child: js.UndefOr[scala.Nothing], reverse: Boolean): NamedNode | Null = js.native
  def getChildAfterChild(index: js.UndefOr[scala.Nothing], child: NamedNode): NamedNode | Null = js.native
  def getChildAfterChild(index: js.UndefOr[scala.Nothing], child: NamedNode, reverse: Boolean): NamedNode | Null = js.native
  def getChildAfterChild(index: Index): NamedNode | Null = js.native
  def getChildAfterChild(index: Index, child: js.UndefOr[scala.Nothing], reverse: Boolean): NamedNode | Null = js.native
  def getChildAfterChild(index: Index, child: NamedNode): NamedNode | Null = js.native
  /**
    * @inheritDoc
    */
  def getCompleteChild(): Node | Null = js.native
}

