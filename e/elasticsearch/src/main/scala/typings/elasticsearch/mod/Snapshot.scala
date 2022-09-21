package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Snapshot")
@js.native
open class Snapshot () extends StObject {
  
  def create(params: SnapshotCreateParams): js.Promise[Any] = js.native
  def create(
    params: SnapshotCreateParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def createRepository(params: SnapshotCreateRepositoryParams): js.Promise[Any] = js.native
  def createRepository(
    params: SnapshotCreateRepositoryParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def delete(params: SnapshotDeleteParams): js.Promise[Any] = js.native
  def delete(
    params: SnapshotDeleteParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def deleteRepository(params: SnapshotDeleteRepositoryParams): js.Promise[Any] = js.native
  def deleteRepository(
    params: SnapshotDeleteRepositoryParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def get(params: SnapshotGetParams): js.Promise[Any] = js.native
  def get(
    params: SnapshotGetParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def getRepository(params: SnapshotGetRepositoryParams): js.Promise[Any] = js.native
  def getRepository(
    params: SnapshotGetRepositoryParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def restore(params: SnapshotRestoreParams): js.Promise[Any] = js.native
  def restore(
    params: SnapshotRestoreParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def status(params: SnapshotStatusParams): js.Promise[Any] = js.native
  def status(
    params: SnapshotStatusParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
  
  def verifyRepository(params: SnapshotVerifyRepositoryParams): js.Promise[Any] = js.native
  def verifyRepository(
    params: SnapshotVerifyRepositoryParams,
    callback: js.Function3[/* error */ Any, /* response */ Any, /* status */ Any, Unit]
  ): Unit = js.native
}
