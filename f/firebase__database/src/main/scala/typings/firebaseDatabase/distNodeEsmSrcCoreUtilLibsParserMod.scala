package typings.firebaseDatabase

import typings.firebaseDatabase.anon.Domain
import typings.firebaseDatabase.anon.RepoInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreUtilLibsParserMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/util/libs/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDatabaseURL(dataURL: String): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDatabaseURL")(dataURL.asInstanceOf[js.Any]).asInstanceOf[Domain]
  
  inline def parseRepoInfo(dataURL: String, nodeAdmin: Boolean): RepoInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRepoInfo")(dataURL.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[RepoInfo]
}
