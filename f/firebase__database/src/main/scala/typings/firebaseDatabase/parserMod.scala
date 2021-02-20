package typings.firebaseDatabase

import typings.firebaseDatabase.anon.Domain
import typings.firebaseDatabase.anon.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@firebase/database/dist/src/core/util/libs/parser", "parseDatabaseURL")
  @js.native
  def parseDatabaseURL(dataURL: String): Domain = js.native
  
  @JSImport("@firebase/database/dist/src/core/util/libs/parser", "parseRepoInfo")
  @js.native
  def parseRepoInfo(dataURL: String, nodeAdmin: Boolean): RepoInfo = js.native
}
