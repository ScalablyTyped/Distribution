package typings.firebaseDatabase

import typings.firebaseDatabase.anon.ReaderRef
import typings.firebaseDatabase.eventAccumulatorMod.EventAccumulator
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.referenceMod.DatabaseReference
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import typings.firebaseDatabase.srcMod.Database
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersUtilMod {
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/util", "DATABASE_ADDRESS")
  @js.native
  val DATABASE_ADDRESS: Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/util", "DATABASE_URL")
  @js.native
  val DATABASE_URL: Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/test/helpers/util", "TEST_PROJECT")
  @js.native
  val TEST_PROJECT: Any = js.native
  
  inline def getFreshRepo(path: Path): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreshRepo")(path.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  
  inline def getRWRefs(db: Database): ReaderRef = ^.asInstanceOf[js.Dynamic].applyDynamic("getRWRefs")(db.asInstanceOf[js.Any]).asInstanceOf[ReaderRef]
  
  inline def getUniqueRef(db: Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueRef")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  
  inline def repoInfoForConnectionTest(): RepoInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("repoInfoForConnectionTest")().asInstanceOf[RepoInfo]
  
  inline def shuffle(arr: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def shuffle(arr: Any, randFn: js.Function0[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], randFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def testRepoInfo(url: Any): RepoInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepoInfo")(url.asInstanceOf[js.Any]).asInstanceOf[RepoInfo]
  
  inline def waitFor(waitTimeInMS: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(waitTimeInMS.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def waitUntil(cb: js.Function0[Boolean]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def waitUntil(cb: js.Function0[Boolean], maxRetries: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(cb.asInstanceOf[js.Any], maxRetries.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def writeAndValidate(writerRef: DatabaseReference, readerRef: DatabaseReference, toWrite: Any, ec: EventAccumulator): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAndValidate")(writerRef.asInstanceOf[js.Any], readerRef.asInstanceOf[js.Any], toWrite.asInstanceOf[js.Any], ec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
