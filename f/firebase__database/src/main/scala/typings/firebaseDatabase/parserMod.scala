package typings.firebaseDatabase

import typings.firebaseDatabase.anon.Domain
import typings.firebaseDatabase.anon.RepoInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/util/libs/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  def parseDatabaseURL(dataURL: String): Domain = js.native
  def parseRepoInfo(dataURL: String): RepoInfo = js.native
}

