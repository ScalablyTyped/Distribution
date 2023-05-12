package typings.ethers.typesUtilsErrorsMod

import org.scalablytyped.runtime.StringDictionary
import typings.ethers.ethersStrings.UNKNOWN_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnknownError
  extends StObject
     with EthersError[UNKNOWN_ERROR]
     with /* key */ StringDictionary[Any]
object UnknownError {
  
  inline def apply(code: ErrorCode, message: String, name: String): UnknownError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnknownError]
  }
}
