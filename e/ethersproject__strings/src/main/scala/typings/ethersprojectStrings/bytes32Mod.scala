package typings.ethersprojectStrings

import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bytes32Mod {
  
  @JSImport("@ethersproject/strings/lib/bytes32", "formatBytes32String")
  @js.native
  def formatBytes32String(text: String): String = js.native
  
  @JSImport("@ethersproject/strings/lib/bytes32", "parseBytes32String")
  @js.native
  def parseBytes32String(bytes: BytesLike): String = js.native
}
