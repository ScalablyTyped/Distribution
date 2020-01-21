package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Snapshot")
@js.native
class Snapshot () extends js.Object {
  def create(params: SnapshotCreateParams): js.Promise[_] = js.native
  def create(
    params: SnapshotCreateParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def createRepository(params: SnapshotCreateRepositoryParams): js.Promise[_] = js.native
  def createRepository(
    params: SnapshotCreateRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def delete(params: SnapshotDeleteParams): js.Promise[_] = js.native
  def delete(
    params: SnapshotDeleteParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def deleteRepository(params: SnapshotDeleteRepositoryParams): js.Promise[_] = js.native
  def deleteRepository(
    params: SnapshotDeleteRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def get(params: SnapshotGetParams): js.Promise[_] = js.native
  def get(
    params: SnapshotGetParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def getRepository(params: SnapshotGetRepositoryParams): js.Promise[_] = js.native
  def getRepository(
    params: SnapshotGetRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def restore(params: SnapshotRestoreParams): js.Promise[_] = js.native
  def restore(
    params: SnapshotRestoreParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def status(params: SnapshotStatusParams): js.Promise[_] = js.native
  def status(
    params: SnapshotStatusParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  def verifyRepository(params: SnapshotVerifyRepositoryParams): js.Promise[_] = js.native
  def verifyRepository(
    params: SnapshotVerifyRepositoryParams,
    callback: js.Function3[/* error */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
}

