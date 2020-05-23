package typings.firebaseFirestore

import typings.firebaseFirestore.timestampMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/model/server_timestamps", JSImport.Namespace)
@js.native
object serverTimestampsMod extends js.Object {
  def getLocalWriteTime(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Timestamp = js.native
  def getPreviousValue(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
  def isServerTimestamp(): Boolean = js.native
  def isServerTimestamp(
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): Boolean = js.native
  def serverTimestamp(localWriteTime: Timestamp): js.Any = js.native
  def serverTimestamp(
    localWriteTime: Timestamp,
    previousValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any
  ): js.Any = js.native
}

