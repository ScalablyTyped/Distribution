package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersUtilMod {
  
  @JSImport("@firebase/database/dist/test/helpers/util", "DATABASE_ADDRESS")
  @js.native
  val DATABASE_ADDRESS: js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "DATABASE_URL")
  @js.native
  val DATABASE_URL: js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "TEST_PROJECT")
  @js.native
  val TEST_PROJECT: js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "buildObjFromKey")
  @js.native
  def buildObjFromKey(key: js.Any): js.Object = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "canCreateExtraConnections")
  @js.native
  def canCreateExtraConnections(): Boolean = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "createTestApp")
  @js.native
  def createTestApp(): FirebaseApp = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getFreshRepo")
  @js.native
  def getFreshRepo(path: js.Any): js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getFreshRepoFromReference")
  @js.native
  def getFreshRepoFromReference(ref: js.Any): js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getPath")
  @js.native
  def getPath(query: Query): String = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getQueryValue")
  @js.native
  def getQueryValue(query: Query): js.Promise[_] = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getRandomNode")
  @js.native
  def getRandomNode(): Reference | js.Array[Reference] = js.native
  @JSImport("@firebase/database/dist/test/helpers/util", "getRandomNode")
  @js.native
  def getRandomNode(numNodes: js.Any): Reference | js.Array[Reference] = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getRootNode")
  @js.native
  def getRootNode(): js.Any = js.native
  @JSImport("@firebase/database/dist/test/helpers/util", "getRootNode")
  @js.native
  def getRootNode(i: js.UndefOr[scala.Nothing], ref: String): js.Any = js.native
  @JSImport("@firebase/database/dist/test/helpers/util", "getRootNode")
  @js.native
  def getRootNode(i: Double): js.Any = js.native
  @JSImport("@firebase/database/dist/test/helpers/util", "getRootNode")
  @js.native
  def getRootNode(i: Double, ref: String): js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getSnap")
  @js.native
  def getSnap(path: js.Any): js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "getVal")
  @js.native
  def getVal(path: js.Any): js.Any = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "pause")
  @js.native
  def pause(milliseconds: Double): js.Promise[_] = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "repoInfoForConnectionTest")
  @js.native
  def repoInfoForConnectionTest(): RepoInfo = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "shuffle")
  @js.native
  def shuffle(arr: js.Any): Unit = js.native
  @JSImport("@firebase/database/dist/test/helpers/util", "shuffle")
  @js.native
  def shuffle(arr: js.Any, randFn: js.Function0[Double]): Unit = js.native
  
  @JSImport("@firebase/database/dist/test/helpers/util", "testRepoInfo")
  @js.native
  def testRepoInfo(url: js.Any): RepoInfo = js.native
}
