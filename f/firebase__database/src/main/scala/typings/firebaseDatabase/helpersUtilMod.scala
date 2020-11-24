package typings.firebaseDatabase

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabase.queryMod.Query
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoInfoMod.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/test/helpers/util", JSImport.Namespace)
@js.native
object helpersUtilMod extends js.Object {
  
  val DATABASE_ADDRESS: js.Any = js.native
  
  val DATABASE_URL: js.Any = js.native
  
  val TEST_PROJECT: js.Any = js.native
  
  def buildObjFromKey(key: js.Any): js.Object = js.native
  
  def canCreateExtraConnections(): Boolean = js.native
  
  def createTestApp(): FirebaseApp = js.native
  
  def getFreshRepo(path: js.Any): js.Any = js.native
  
  def getFreshRepoFromReference(ref: js.Any): js.Any = js.native
  
  def getPath(query: Query): String = js.native
  
  def getQueryValue(query: Query): js.Promise[_] = js.native
  
  def getRandomNode(): Reference | js.Array[Reference] = js.native
  def getRandomNode(numNodes: js.Any): Reference | js.Array[Reference] = js.native
  
  def getRootNode(): js.Any = js.native
  def getRootNode(i: js.UndefOr[scala.Nothing], ref: String): js.Any = js.native
  def getRootNode(i: Double): js.Any = js.native
  def getRootNode(i: Double, ref: String): js.Any = js.native
  
  def getSnap(path: js.Any): js.Any = js.native
  
  def getVal(path: js.Any): js.Any = js.native
  
  def pause(milliseconds: Double): js.Promise[_] = js.native
  
  def repoInfoForConnectionTest(): RepoInfo = js.native
  
  def shuffle(arr: js.Any): Unit = js.native
  def shuffle(arr: js.Any, randFn: js.Function0[Double]): Unit = js.native
  
  def testRepoInfo(url: js.Any): RepoInfo = js.native
}
