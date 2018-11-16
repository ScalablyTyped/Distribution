package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Snapshot")
@js.native
class Snapshot () extends js.Object {
  def create(params: SnapshotCreateParams): stdLib.Promise[_] = js.native
  def create(
    params: SnapshotCreateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def createRepository(params: SnapshotCreateRepositoryParams): stdLib.Promise[_] = js.native
  def createRepository(
    params: SnapshotCreateRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def delete(params: SnapshotDeleteParams): stdLib.Promise[_] = js.native
  def delete(
    params: SnapshotDeleteParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deleteRepository(params: SnapshotDeleteRepositoryParams): stdLib.Promise[_] = js.native
  def deleteRepository(
    params: SnapshotDeleteRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def get(params: SnapshotGetParams): stdLib.Promise[_] = js.native
  def get(
    params: SnapshotGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getRepository(params: SnapshotGetRepositoryParams): stdLib.Promise[_] = js.native
  def getRepository(
    params: SnapshotGetRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def restore(params: SnapshotRestoreParams): stdLib.Promise[_] = js.native
  def restore(
    params: SnapshotRestoreParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def status(params: SnapshotStatusParams): stdLib.Promise[_] = js.native
  def status(
    params: SnapshotStatusParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def verifyRepository(params: SnapshotVerifyRepositoryParams): stdLib.Promise[_] = js.native
  def verifyRepository(
    params: SnapshotVerifyRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

