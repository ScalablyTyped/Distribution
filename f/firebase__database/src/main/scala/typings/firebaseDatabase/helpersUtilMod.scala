package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersUtilMod {
  
  @JSImport("@firebase/database/dist/test/helpers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "DATABASE_ADDRESS")
  @js.native
  val DATABASE_ADDRESS: js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "DATABASE_URL")
  @js.native
  val DATABASE_URL: js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "TEST_PROJECT")
  @js.native
  val TEST_PROJECT: js.Any = js.native
  
  @scala.inline
  def buildObjFromKey(key: js.Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("buildObjFromKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def canCreateExtraConnections(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateExtraConnections")().asInstanceOf[Boolean]
  
  @scala.inline
  def createTestApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("createTestApp")().asInstanceOf[FirebaseApp]
  
  @scala.inline
  def getFreshRepo(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreshRepo")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getFreshRepoFromReference(ref: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreshRepoFromReference")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getPath(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getQueryValue(query: Query): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueryValue")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def getRandomNode(): Reference | js.Array[Reference] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomNode")().asInstanceOf[Reference | js.Array[Reference]]
  @scala.inline
  def getRandomNode(numNodes: js.Any): Reference | js.Array[Reference] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomNode")(numNodes.asInstanceOf[js.Any]).asInstanceOf[Reference | js.Array[Reference]]
  
  @scala.inline
  def getRootNode(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootNode")().asInstanceOf[js.Any]
  @scala.inline
  def getRootNode(i: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootNode")(i.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getRootNode(i: Double, ref: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRootNode")(i.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getRootNode(i: Unit, ref: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getRootNode")(i.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getSnap(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnap")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def getVal(path: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getVal")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def pause(milliseconds: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pause")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def repoInfoForConnectionTest(): RepoInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("repoInfoForConnectionTest")().asInstanceOf[RepoInfo]
  
  @scala.inline
  def shuffle(arr: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def shuffle(arr: js.Any, randFn: js.Function0[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], randFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def testRepoInfo(url: js.Any): RepoInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("testRepoInfo")(url.asInstanceOf[js.Any]).asInstanceOf[RepoInfo]
}
