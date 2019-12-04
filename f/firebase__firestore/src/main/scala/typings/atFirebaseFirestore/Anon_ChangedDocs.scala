package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.MaybeDocumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedDocs extends js.Object {
  var changedDocs: MaybeDocumentMap
  var readTime: SnapshotVersion
}

object Anon_ChangedDocs {
  @scala.inline
  def apply(changedDocs: MaybeDocumentMap, readTime: SnapshotVersion): Anon_ChangedDocs = {
    val __obj = js.Dynamic.literal(changedDocs = changedDocs.asInstanceOf[js.Any], readTime = readTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChangedDocs]
  }
}

