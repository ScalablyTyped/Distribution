package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This class allows you to get Identity Access Management information.
     */
@js.native
trait Iam extends js.Object {
  def getPolicy(): stdLib.Promise[IamPolicy] = js.native
  def setPolicy(policy: IamPolicy): stdLib.Promise[js.Tuple2[IamPolicy, ApiResponse]] = js.native
  def testPermissions(permission: java.lang.String): stdLib.Promise[js.Tuple2[ScalablyTyped.runtime.StringDictionary[scala.Boolean], ApiResponse]] = js.native
  def testPermissions(permission: js.Array[java.lang.String]): stdLib.Promise[js.Tuple2[ScalablyTyped.runtime.StringDictionary[scala.Boolean], ApiResponse]] = js.native
}

